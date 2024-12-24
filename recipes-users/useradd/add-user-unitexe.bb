SUMMARY = "Add unitexe user"
DESCRIPTION = "Add unitexe user and create users home directory"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

EXCLUDE_FROM_WORLD = "1"

inherit useradd
inherit extrausers

DEPENDS:append = " sudo"
RDEPENDS:${PN}:append = " sudo shadow"

USERADD_PACKAGES = "${PN}"

USER_TO_ADD_NAME ?= "unitexe"
USER_TO_ADD_UID ?= "1300"
USER_TO_ADD_PASSWORD_HASHED ?= "\$6\$esHchcEKubkj/1v7\$woeV0ChUqcC8J8lOEWB563mX4XRAvYJldGcU/I0Pzg1Nw9bBGOQoLmIsn0wU1gUzpysZr6R18xps5Cjn470Nv/"

USERADD_PARAM:${PN} = "--uid ${USER_TO_ADD_UID} --home-dir /home/${USER_TO_ADD_NAME} --system --shell ${base_bindir}/sh --password '${USER_TO_ADD_PASSWORD_HASHED}' ${USER_TO_ADD_NAME}"

# Add user to sudo group.
EXTRA_USERS_PARAMS:append = " usermod --append --groups sudo ${USER_TO_ADD_NAME}"

do_install() {
    install -d ${D}/home/${USER_TO_ADD_NAME}
}

pkg_postinst_ontarget:${PN}() {
    chown -R ${USER_TO_ADD_NAME}:${USER_TO_ADD_NAME} /home/${USER_TO_ADD_NAME}
}

FILES:${PN} = "/home/${USER_TO_ADD_NAME}"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
