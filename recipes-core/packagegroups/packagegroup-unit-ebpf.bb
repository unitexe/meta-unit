SUMMARY = "Unit eBPF packages"
DESCRIPTION = "Stuff needed for eBPF experiments"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

# eBPF
RDEPENDS:${PN}:append = " bcc"
RDEPENDS:${PN}:append = " bpftrace"
RDEPENDS:${PN}:append = " pahole"
RDEPENDS:${PN}:append = " bpftool"
