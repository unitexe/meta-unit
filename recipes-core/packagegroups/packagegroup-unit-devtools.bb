SUMMARY = "Unit development tools"
DESCRIPTION = "Number of tools useful for development"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

# Kernel debugging
RDEPENDS:${PN}:append = " dtc"

# Systemd debugging
RDEPENDS:${PN}:append = " systemd-bootchart"

# Networking
RDEPENDS:${PN}:append = " curl"
RDEPENDS:${PN}:append = " openssh"
RDEPENDS:${PN}:append = " openssh-authorized-keys"

# Utilities
RDEPENDS:${PN}:append = " tree"

# GPIO
RDEPENDS:${PN}:append = " libgpiod"
