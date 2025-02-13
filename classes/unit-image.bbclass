inherit core-image
inherit image-buildinfo
inherit unit-image-users

IMAGE_INSTALL:append = " packagegroup-unit"
IMAGE_INSTALL:append = " packagegroup-unit-devtools"
IMAGE_INSTALL:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-unit-podman', '', d)}"
IMAGE_INSTALL:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-unit-quadlets', '', d)}"
