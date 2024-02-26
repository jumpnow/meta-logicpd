require linux-stable.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

COMPATIBLE_MACHINE = "logicpd"

KERNEL_DEVICETREE = "\
    ti/omap/logicpd-som-lv-35xx-devkit.dtb \
    ti/omap/logicpd-som-lv-37xx-devkit.dtb \
    ti/omap/logicpd-torpedo-35xx-devkit.dtb \
    ti/omap/logicpd-torpedo-37xx-devkit.dtb \
"

LINUX_VERSION = "6.6"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "6.6.18"
SRCREV = "d8a27ea2c98685cdaa5fa66c809c7069a4ff394b"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
"
