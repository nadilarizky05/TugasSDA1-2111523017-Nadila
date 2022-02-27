import java.util.ArrayList;

public class jawabannomor5 {
    public static void main(String [] args) {
        
        ArrayList lastname = new ArrayList();
        
        lastname.add("E");
        lastname.add("L");
        lastname.add("I");
        lastname.add("A");

        lastname.remove(3);
        lastname.remove(2);
        lastname.remove(0);
        System.out.println("Ketika Index 0, 2 dan 3 dihapus, nama saya berubah menjadi " + lastname);
    }
}




