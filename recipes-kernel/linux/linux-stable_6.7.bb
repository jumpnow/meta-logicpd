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

LINUX_VERSION = "6.7"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "6.7.0"
SRCREV = "0dd3ee31125508cd67f7e7172247f05b7fd1753a"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
"