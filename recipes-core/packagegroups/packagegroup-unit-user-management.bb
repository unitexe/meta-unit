SUMMARY = "Unit core packages"
DESCRIPTION = "Stuff needed for all unit images"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " add-user-unitexe"
