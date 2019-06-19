// Output to console closest to 10 value among "m" "n" entered by user

package Playground;

import static java.lang.Math.abs;

class TaskSix {
    static String findClosest() {
        System.out.println("Please enter first value m to compare");
        double m = ScannerObject.myObj.nextDouble();
        System.out.println("Please enter second value n to compare");
        double n = ScannerObject.myObj.nextDouble();
        double compareM= 10 - m;
        double compareN= 10 - n;
        if (abs(compareM) < abs(compareN)) {
            return "m is closest to 10 among this pair of values: " + m;
        } else if (abs(compareN) < abs(compareM)) {
            return "n is closest to 10 among this pair of values: " + n;
        } else {
            return "you entered equal values";
        }
    }
}
