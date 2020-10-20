
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 7;
        int b = 3;
        int answer = (a/b);
        System.out.println(answer);

        //percent
        double c = .03;
        double d = (c*100);
        System.out.println(d);
        System.out.println(d + "%");

        //inverse
        double numToBeInverse = .25;
        double invAnswer;
        invAnswer = 1/numToBeInverse;
        System.out.println("Inverse of " + numToBeInverse + " is " + invAnswer);

        //test for integer
        int num = 3;
        if (num == (int)num) {
            System.out.println("Number " + num + " is integer.");
        } else {
            System.out.println("Number " + num + " isn't an integer.");
        }

        //convert radians to degrees
        //works when angle is 0 but not at 90
        //tan 45 should be 1
        //angles
        double radianInput = 1;
        System.out.println(radianInput + " radian");
        double degrees = radianInput * (180/Math.PI);
        System.out.println(degrees + " degrees");
        double backToRadian = degrees / (180/Math.PI);
        System.out.println(backToRadian + " radian");
        double convert = Math.PI/180;
        double angle = 45;
        double radians = angle*convert;
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        double arcsinValue = Math.asin(radians);
        double arccosValue = Math.acos(radians);
        double arctanValue = Math.atan(radians);

        System.out.println("Sin is " + sinValue);
        System.out.println("Cos is " + cosValue);
        System.out.println("Tan is " + tanValue);
        System.out.println("Arcsin is " + arcsinValue);
        System.out.println("Arccos is " + arccosValue);
        System.out.println("Arctan is " + arctanValue);

        //factorial
        int input = 8;
        int total = 1;
        for (int i = 1; i < input + 1; i++) {
            total = total * i;
        }
        System.out.println("The factorial of " + input + " is " + total);

        //power
        double base = 3;
        double exponent = 5;
        double result = Math.pow(base, exponent);

        System.out.println(base + " to the power of " + exponent + " is " + result);

        //roots, using above from power
        double root = Math.pow(result, 1/exponent);
        System.out.println(result + " to root " + exponent + " is " + root);

        //pi
        System.out.println("Pi is " + Math.PI);

        //e Euler's number
        double epower = 1;
        System.out.println("Euler's number to the power of " + epower + " is " + Math.exp(epower));

        //log
        double negNum = -2.55;
        double posInf = 1.0 / 0;
        double posZero = 0, dbl = 145.256;

        // negative integer as argument, output NAN
        System.out.println(Math.log(negNum));

        // positive infinity as argument, output Infinity
        System.out.println(Math.log(posInf));

        // positive zero as argument, output -Infinity
        System.out.println(Math.log(posZero));

        // positive double as argument
        System.out.println(Math.log(dbl));

        double firstValue;
        double secondValue;
        double oneValue = 2;
        double twoValue = 5;

        /*if(oneValue == 0) {
            //firstValue = 2;
            firstValue = Double.parseDouble(oneValue.getText().toString())
            System.out.println(firstValue);
        } else {
            secondValue = 5;
            System.out.println(Math.pow(firstValue, secondValue));
        }*/

    }
}
