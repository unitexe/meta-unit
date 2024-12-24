do_install:append() {
    echo "unitexe:100000:65536" >> ${D}${sysconfdir}/subuid
    echo "" >> ${D}${sysconfdir}/subuid
    echo "unitexe:100000:65536" >> ${D}${sysconfdir}/subgid
    echo "" >> ${D}${sysconfdir}/subgid
}
