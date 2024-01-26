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

PV = "6.6.14"
SRCREV = "98817289bcec2331c6893139c52105738090afc0"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
"
