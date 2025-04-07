SUMMARY = "Systemd service for generating wireguard keys for device"
SECTION = "core"
LICENSE = "MIT"

SYSTEMD_SERVICE:${PN} = "wgkeygen.service"

SRC_URI = "\
    file://wgkeygen.service \
"

do_install() {
    # Install systemd unit.
    install -D -p -m0644 ${WORKDIR}/wgkeygen.service ${D}${systemd_system_unitdir}/wgkeygen.service
}

inherit systemd

FILES:${PN} = "\
    ${systemd_system_unitdir} \
"

RDEPENDS:${PN} = "\
    wireguard-tools \
"
