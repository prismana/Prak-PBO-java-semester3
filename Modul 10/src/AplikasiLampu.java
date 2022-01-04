import java.util.Scanner;
import edu.percobaan.*;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu Lamp = new Lampu();
        Scanner scan = new Scanner(System.in);
        Lamp.statusLampu = Lamp.setSaklar(0);
        System.out.println("Status Lampu: " + Lamp.statusLampu + "\nketikkan:");
        System.out.println("1 untuk menyalakan lampu \n2 untuk meredupkan lampu \n0 untuk mematikan lampu");

        if (Lamp.setSaklar(scan.nextInt()) == 0) {
            Lamp.matikanLampu();
            System.out.println("Status lampu: " + Lamp.statusLampu);
        } //menambah kondisi untuk meredupkan lampu
        else if (Lamp.setSaklar(scan.nextInt()) == 2){
            Lamp.redupkanLampu();
            System.out.println("Status lampu: " + Lamp.statusLampu);
        }
        else if (Lamp.setSaklar(scan.nextInt()) == 1){
            Lamp.hidupkanLampu();
            System.out.println("Status lampu: " + Lamp.statusLampu);
        }
    }
}
