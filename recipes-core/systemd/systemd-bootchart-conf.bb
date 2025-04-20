SUMMARY = "Systemd bootchart config override"
SECTION = "core"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
    file://unit.conf \
"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -D -p -m0644 ${UNPACKDIR}/unit.conf ${D}${sysconfdir}/systemd/bootchart.conf.d/unit.conf
}

inherit systemd

FILES:${PN} = "\
    ${sysconfdir}/systemd/bootchart.conf.d \
"
