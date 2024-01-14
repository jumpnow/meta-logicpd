setenv bootpart 0:2
setenv bootdir /boot
setenv mmcroot /dev/mmcblk0p2 rw
setenv mmcrootfstype ext4 rootwait
setenv console ttyS0,115200n8
setenv bootargs console=${console} root=${mmcroot} rootfstype=${mmcrootfstype}
setenv fdtfile logicpd-torpedo-37xx-devkit.dtb
load mmc ${bootpart} ${fdtaddr} ${bootdir}/${fdtfile}
load mmc ${bootpart} ${loadaddr} ${bootdir}/zImage
bootz ${loadaddr} - ${fdtaddr}
