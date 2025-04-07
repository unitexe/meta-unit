SUMMARY = "Unit development tools"
DESCRIPTION = "Number of tools useful for development"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

# libgpiod gets renamed
# Getting error message below:
#   ERROR: packagegroup-unit-devtools-1.0-r0 do_package_write_rpm: An allarch packagegroup shouldn't depend on packages which are dynamically renamed (libgpiod to libgpiod3)
# Solution mentioned in commit which introduced this error message:
#   https://lists.openembedded.org/g/openembedded-core/topic/patch_4_4_package_add/87011325
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

# Kernel debugging
RDEPENDS:${PN}:append = " dtc"

# Systemd debugging
RDEPENDS:${PN}:append = " systemd-bootchart"

# Networking
RDEPENDS:${PN}:append = " curl"
RDEPENDS:${PN}:append = " openssh"
RDEPENDS:${PN}:append = " openssh-authorized-keys"
RDEPENDS:${PN}:append = " python3-speedtest-cli"
RDEPENDS:${PN}:append = " wireguard-tools"
RDEPENDS:${PN}:append = " systemd-wgkeygen"

# Utilities
RDEPENDS:${PN}:append = " tree"

# GPIO
RDEPENDS:${PN}:append = " libgpiod"
RDEPENDS:${PN}:append = " libgpiod-tools"
RDEPENDS:${PN}:append = " python3-gpiod"

# SPI
RDEPENDS:${PN}:append = " python3-spidev"

# UART
RDEPENDS:${PN}:append = " minicom"

# Performance analysis
RDEPENDS:${PN}:append = " procps"
RDEPENDS:${PN}:append = " sysstat"

# Performance testing
RDEPENDS:${PN}:append = " stress-ng"

# gRPC
RDEPENDS:${PN}:append = " python3-grpcio"
RDEPENDS:${PN}:append = " python3-grpcio-tools"
RDEPENDS:${PN}:append = " python3-grpcio-reflection"
RDEPENDS:${PN}:append = " python3-grpcio-health-checking"

# SCPI
RDEPENDS:${PN}:append = " python3-usbtmc"

# I2C
RDEPENDS:${PN}:append = " i2c-tools"
RDEPENDS:${PN}:append = " python3-smbus"

# Misc.
RDEPENDS:${PN}:append = " python3-tomllib"
