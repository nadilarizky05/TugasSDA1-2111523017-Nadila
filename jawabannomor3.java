import java.util.ArrayList;

public class jawabannomor3 {
    public static void main(String[] args) {
        
        ArrayList<String> lastname = new ArrayList<>();

        lastname.add("E");
        lastname.add("L");
        lastname.add("I");
        lastname.add("A");

        System.out.println("Data di Index 0 adalah " + lastname.get(0));
        System.out.println("Data di Index 2 adalah " + lastname.get(2));
        System.out.println("Data di Index -3 adalah " + lastname.get(-3));
        System.out.println("Data di Index 6 adalah " + lastname.get(6));
    }
}

