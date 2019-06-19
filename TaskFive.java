// Output to console checking if entered value of "n" is even or odd

package Playground;

class TaskFive {
    static String oddEvenCheck() {
        System.out.println("Please enter number");
        long n = ScannerObject.myObj.nextLong();
        if (n % 2 == 0) {
            System.out.println("Entered value is even");
        } else {
            System.out.println("Entered value is odd");
        }
        return "";
    }
}
