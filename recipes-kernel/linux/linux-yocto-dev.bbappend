FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Wireguard.
SRC_URI:append = " file://networking.cfg"

# Needed for systemd-bootchart. Ideally only included in development images.
SRC_URI:append = " file://stats.cfg"

# eBPF.
# See https://github.com/iovisor/bcc/blob/master/docs/kernel_config.md for details.
SRC_URI:append = " file://bpf.cfg"
SRC_URI:append = " file://bcc.cfg"
KERNEL_DEBUG = "True"
