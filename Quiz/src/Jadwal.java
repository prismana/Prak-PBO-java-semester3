//L200200031_Rahdriawan Prismana
public class Jadwal {
    private String item;
    private boolean selesai;

    public Jadwal (String item, boolean selesai){
        this.item = item;
        this.selesai = selesai;
    }
    public boolean ApakahSelesai(){
        return selesai;
    }
    public String tampilkan() {
        String s = ("Daftar jadwal hari ini: " + item + "\n");
        if(ApakahSelesai()){
            s = s + "telah selesai dikerjakan";
        }
        else {
            s = s + "belum dikerjakan";
        }
        System.out.println(s);
        return s;
    }
}

class Main {
    public static void main(String[] args) {
        Jadwal jadwalku = new Jadwal("Mencuci baju", false);
        jadwalku.tampilkan();
    }
}
