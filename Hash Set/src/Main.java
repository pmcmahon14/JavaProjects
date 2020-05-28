import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();
        h.add("dog");
        h.add("human");
        h.add("pain in the patookus");
        h.add("and other body parts");

        h.remove("and other body parts");

        System.out.println(h);
    }
}
