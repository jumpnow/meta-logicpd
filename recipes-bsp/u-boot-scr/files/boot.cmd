setenv bootdir /boot
setenv bootpart 0:2
setenv console ttyS0,115200n8
setenv fdtaddr 0x88000000
setenv fdtfile logicpd-torpedo-37xx-devkit-28.dtb
setenv loadaddr 0x82000000
setenv mmcroot /dev/mmcblk0p2 rw
setenv mmcrootfstype ext4 rootwait
setenv bootargs console=${console} root=${mmcroot} rootfstype=${mmcrootfstype}
load mmc ${bootpart} ${fdtaddr} ${bootdir}/${fdtfile}
load mmc ${bootpart} ${loadaddr} ${bootdir}/zImage
bootz ${loadaddr} - ${fdtaddr}
