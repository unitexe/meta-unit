inherit core-image
inherit image-buildinfo

IMAGE_INSTALL:append = " packagegroup-unit"
IMAGE_INSTALL:append = " packagegroup-unit-devtools"
IMAGE_INSTALL:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-unit-podman', '', d)}"
