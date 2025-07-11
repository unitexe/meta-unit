inherit core-image
inherit image-buildinfo

IMAGE_INSTALL:append = " packagegroup-unit"
IMAGE_INSTALL:append = " packagegroup-unit-devtools"
IMAGE_INSTALL:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-unit-podman', '', d)}"
IMAGE_INSTALL:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'packagegroup-unit-quadlets', '', d)}"
IMAGE_INSTALL:append = " packagegroup-unit-apps"
IMAGE_INSTALL:append = " packagegroup-unit-networking"
IMAGE_INSTALL:append = " packagegroup-unit-python"
IMAGE_INSTALL:append = " packagegroup-unit-profiling"
IMAGE_INSTALL:append = " packagegroup-unit-user-management"
