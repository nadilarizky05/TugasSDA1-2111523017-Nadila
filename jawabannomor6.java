import java.util.ArrayList;

public class jawabannomor6 {
    public static void main(String[] args) {

    ArrayList<String> lastname = new ArrayList<String>();
    lastname.add("e");
    lastname.add("l");
    lastname.add("i");
    lastname.add("a");
    
    System.out.println("Nama saya adalah ELIA");
    lastname.add(0,"e");
    System.out.println("Ketika ditambahkan huruf e pada index ke-0 maka nama saya menjadi " + lastname);

    lastname.add(2,"f");
    System.out.println("Ketika ditambahkan huruf f pada index ke-2 maka nama saya menjadi " + lastname);

    lastname.add(3,"g");
    System.out.println("Ketika ditambahkan huruf g pada index ke-3 maka nama saya menjadi " + lastname);

    lastname.add(4,"h");
    System.out.println("Ketika ditambahkan huruf h pada index ke-4 maka nama saya menjadi " + lastname);

    lastname.add(6,"h");
    System.out.println("Ketika ditambahkan huruf h pada index ke-6 maka nama saya menjadi " + lastname);

    lastname.add(-3,"j");
    System.out.println("Ketika ditambahkan huruf j pada index ke-(-3) maka nama saya menjadi " + lastname);
    }
}




