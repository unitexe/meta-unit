# Some systemd service need to wait for time sync.
PACKAGECONFIG:append = " timesyncd"

# Auto-enable the time wait service.
SYSTEMD_SERVICE:${PN}:append = " systemd-time-wait-sync.service"
