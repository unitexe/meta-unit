inherit packagegroup

RDEPENDS:${PN}:append = " python3-gpiod"
RDEPENDS:${PN}:append = " python3-spidev"
RDEPENDS:${PN}:append = " python3-grpcio"
RDEPENDS:${PN}:append = " python3-grpcio-tools"
RDEPENDS:${PN}:append = " python3-grpcio-reflection"
RDEPENDS:${PN}:append = " python3-grpcio-health-checking"
RDEPENDS:${PN}:append = " python3-usbtmc"
RDEPENDS:${PN}:append = " python3-smbus"
RDEPENDS:${PN}:append = " python3-tomllib"
