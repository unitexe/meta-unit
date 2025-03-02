SUMMARY = "Python USBTMC driver for controlling instruments over USB"
HOMEPAGE = "https://github.com/python-ivi/python-usbtmc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=28349e620c063ac78d1d51ced232e42a"

RDEPENDS:${PN}:append = " python3-pyusb"

SRC_URI[sha256sum] = "510658781dd94a38d86c6f742a338a5a737af76c71ed15718088cbee9aeb0ba7"

inherit pypi setuptools3

PYPI_PACKAGE = "python-usbtmc"

BBCLASSEXTEND = "native nativesdk"
