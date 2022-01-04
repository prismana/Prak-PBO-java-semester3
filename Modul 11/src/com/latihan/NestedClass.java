package com.latihan;
public class NestedClass {
    String nama = "Rahdriawn Prismana", nim = "L200200031";
    public void printNama(){
        System.out.println(nama + ": " + nim);
    }

    public static class StaticNestedClass{
        public static String jurusan = "informatika";

        NestedClass nc = new NestedClass();
        public void tampilkanNama(){
            nc.printNama();
        }
    }

    public static class InnerClass{
        NestedClass.StaticNestedClass snc = new StaticNestedClass();

        public void tampilkanJurusan() {
            System.out.println("Jurusan: " + snc.jurusan);
        }
    }
}
