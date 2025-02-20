FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Wireguard.
SRC_URI:append = " file://networking.cfg"

# Needed for systemd-bootchart. Ideally only included in development images.
SRC_URI:append = " file://stats.cfg"
