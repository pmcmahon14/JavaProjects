public class EqualSumChecker {

    public static boolean hasEqualSum(int n1, int n2, int n3) {

        int sum = n1 + n2;

        if (sum == n3) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
