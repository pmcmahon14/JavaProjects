public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 = num1 * 1000;
        num2 = num2 * 1000;

        int intnum1 = (int) num1;
        int intnum2 = (int) num2;

        if (intnum1 == intnum2) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }
}
