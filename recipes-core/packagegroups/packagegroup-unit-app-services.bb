SUMMARY = "Unit application services"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " systemd-unitsrv"
