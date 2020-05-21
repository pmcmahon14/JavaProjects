public class Main {

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        int[] myIntArray2 = new int[10];
        for(int i=0; i<myIntArray2.length; i++) {
            myIntArray[i] = i*10;
        }
        for(int i=0; i<myIntArray2.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        String[]names;
        names = new String[4];
        names[0] = "Patrick";
        names[1] = "Dawn";
        names[2] = "Finn";
        names[3] = "Sierra";

        int random = (int) (Math.random()*4);

        System.out.println("The random name is: " + names[random]);
    }
}
