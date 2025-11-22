DISTRO = "unity"

INIT_MANAGER = "systemd"

# Graphics
DISTRO_FEATURES:append = " opengl"

# Containers
DISTRO_FEATURES:append = " virtualization"
DISTRO_FEATURES:append = " pam"
