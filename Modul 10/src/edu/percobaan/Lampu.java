package edu.percobaan;

public class Lampu implements ActivityLampu{
    public int statusLampu;

    @Override
    public void matikanLampu() {
        if (statusLampu == 0) {
            System.out.println("Lampu sudah dalam kondisi mati");
        } else if (statusLampu == 1) {
            statusLampu =- 1;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if (statusLampu == 1) {
            System.out.println("Lampu sudah dinyalakan");
        }
        else {
            statusLampu = statusLampu + 1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }

    //method untuk meredupkan lampu
    @Override
    public void redupkanLampu() {
        if (statusLampu == 2) {
            System.out.println("Lampu dalam keadaan redup");
        }
        else if (statusLampu == 1){
            statusLampu = statusLampu + 1;
            System.out.println("Lampu dalam keadaan redup");
        } else if (statusLampu == 0){
            statusLampu = statusLampu + 2;
            System.out.println("Lampu dalalm keadaan redup");
        }
    }

    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
