SUMMARY = "A basic weston/gtk3/gtkmm3 dev image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require console-dev-image.bb

GTK_STUFF = " \
    gtk+3-dev \
    gtkmm3-dev \
    gtk4-dev \
"

TS_STUFF = " \
    evtest \
    evtest-dev \
    libinput-bin \
    libinput-dbg \
    libinput-dev \
    tslib-conf \
    tslib-calibrate \
    tslib \
"

WESTON_STUFF = " \
    weston-dev \
    weston-examples \
    weston-init \
"

IMAGE_INSTALL += " \
    ${GTK_STUFF} \
    ${TS_STUFF} \
    ${WESTON_STUFF} \
"

export IMAGE_BASENAME = "weston-dev-image"
