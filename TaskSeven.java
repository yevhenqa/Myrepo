// Method for solving quadratic equation

package Playground;

import static java.lang.Math.sqrt;

class TaskSeven {
    static String quadequation () {
        System.out.println("Solving quadratic equation - ax^2+bx+c=0");
        System.out.println("Enter a value");
        int a =ScannerObject.myObj.nextInt();
        System.out.println("Enter b value");
        int b =ScannerObject.myObj.nextInt();
        System.out.println("Enter c value");
        int c =ScannerObject.myObj.nextInt();
        System.out.println("Find discriminant");
        int d = b^2 - 4*a*c;
        return "Discriminant value is D=" + d;
        if (d<0) {
            double x1 = ((-(b) + sqrt(d))/ (2*a));
        }



    }
}
