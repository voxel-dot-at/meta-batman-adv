# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSES/preferred/GPL-2.0
#
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=fc6177742f3ff0569ececd42b9b7d5fc"

SRC_URI = "git://git.open-mesh.org/batctl.git"

inherit pkgconfig

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "70968bb67d4da6f3c9349697a702dda4d2a8a166"

DEPENDS += " libnl libcap "

S = "${WORKDIR}/git"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	make PREFIX="${D}" install
}

