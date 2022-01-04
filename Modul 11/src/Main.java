import com.latihan.NestedClass;

public class Main {
    public static void main(String[] args) {
        NestedClass nc = new NestedClass();

        NestedClass.StaticNestedClass stat= new NestedClass.StaticNestedClass();
        stat.tampilkanNama();

        NestedClass.InnerClass iner = new NestedClass.InnerClass();
        iner.tampilkanJurusan();
    }
}
