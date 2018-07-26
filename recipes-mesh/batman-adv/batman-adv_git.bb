DESCRIPTION = "batman-adv kernel module"
SECTION = "networking"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=fc6177742f3ff0569ececd42b9b7d5fc"
PR = "r1"

inherit module

SRC_URI = " git://git.open-mesh.org/batman-adv.git;protocol=https \
	    file://makefile.patch;striplevel=2 "

SRCREV = "${AUTOREV}"


# SRC_URI[md5sum] = "7b2a4a176c30896fc2b7a53fe36ba89f"
# SRC_URI[sha256sum] = "b866b28dbbe5c9238abbdf5abbc30fc526dea56898ce4c1bd76d5c017843048b"

S = "${WORKDIR}/git"

PN = "batman-adv"
