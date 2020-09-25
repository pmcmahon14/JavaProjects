public class Main {

    public static void main(String[] args) {
        //int n = 26755;
        //int n = 235467;
        int n = 23984798;
        int count = 0;

        while (n%2==0) {
            count = count + 1;
            n /= 2;
        }
        if (count > 0) {
            System.out.println(2 + "^" + count);
        }
        count = 0;

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while (n%i == 0) {
                count = count + 1;
                //System.out.println(i + " " + "after");
                //System.out.println(n /= i);
                n /= i;
            }
            if (count > 0) {
                System.out.println(i + "^" + count);
            }
            count = 0;
        }

        if (n > 2)
            System.out.println(n);

    }
}
