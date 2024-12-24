SUMMARY = "Unit development tools"
DESCRIPTION = "Number of tools useful for development"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

# Networking
RDEPENDS:${PN}:append = " curl"

# Utilities
RDEPENDS:${PN}:append = " tree"
