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

# Utilities
RDEPENDS:${PN}:append = " tree"
RDEPENDS:${PN}:append = " jq"

# GPIO
RDEPENDS:${PN}:append = " libgpiod"
RDEPENDS:${PN}:append = " libgpiod-tools"

# UART
RDEPENDS:${PN}:append = " minicom"

# I2C
RDEPENDS:${PN}:append = " i2c-tools"
