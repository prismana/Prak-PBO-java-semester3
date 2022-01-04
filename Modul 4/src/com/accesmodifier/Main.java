package com.accesmodifier;

import com.accesmodifier.privat.PrivateModifier;
import com.accesmodifier.proteksi.ProtectedModifier;
import com.accesmodifier.umum.PublicModifier;
import com.accesmodifier.yangdefault.DefaultModifier;

public class Main {

    public static void main(String[] args) {

        //memanggil dan membuat objek dari Private acces
        PrivateModifier privat = new PrivateModifier();
        //privat.printInfo();

        //memanggil dan membuat objek dari Public acces
        PublicModifier publik = new PublicModifier();
        publik.tambah();
        publik.kali();
        publik.kurang();
        publik.mean();

        //memanggil dan membuat objek dari Default acces
        DefaultModifier deflt = new DefaultModifier();
        //deflt.jumlah();

        //memanggil dan membuat objek dari Protected acces
        ProtectedModifier shield = new ProtectedModifier();
        //shield.printInfo();
        //shield.sendMessage();
    }
}
