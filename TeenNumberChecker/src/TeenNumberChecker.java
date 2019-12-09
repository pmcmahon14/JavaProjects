public class TeenNumberChecker {

    public static boolean hasTeen(int n1, int n2, int n3) {

        if ((n1 > 12 && n1 < 20) || (n2 > 12 && n2 < 20) || (n3 > 12 && n3 < 20)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean isTeen(int n1){

        if (n1 > 12 && n1 < 20) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
