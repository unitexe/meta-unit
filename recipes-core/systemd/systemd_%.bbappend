# Some systemd service need to wait for time sync.
PACKAGECONFIG:append = " timesyncd"
