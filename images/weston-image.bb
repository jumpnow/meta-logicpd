SUMMARY = "A basic weston/gtk3 test image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require console-image.bb

GTK_STUFF = " \
    gtk+3 \
    gtkmm3 \
    gtk4 \
"

TS_STUFF = " \
    evtest \
    tslib-conf \
    tslib-calibrate \
    tslib \
"

WESTON_STUFF = " \
    weston \
    weston-init \
"

IMAGE_INSTALL += " \
    ${GTK_STUFF} \
    ${TS_STUFF} \
    ${WESTON_STUFF} \
"

export IMAGE_BASENAME = "weston-image"
