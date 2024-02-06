FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Remove-preboot-and-env-in-nand-from-config.patch"

UBOOT_SUFFIX = "img"
SPL_BINARY = "MLO"
