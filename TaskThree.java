// Output to console the following sequence: 7 14 21 28 35 42 49 56 63 70 77 84 91 98

package Playground;

class TaskThree {
    static String SevensSequence () {
        int firstVal = 7;
        int iteration = 1;
        while (iteration < 15) {
            System.out.print(firstVal * iteration + " ");
            iteration++;
        }
        return "";
    }
}
