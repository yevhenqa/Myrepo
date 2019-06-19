//Output the sum of two entered values

package Playground;

class TaskTen {
    static int concatenate() {
        System.out.println("Please enter first value to concatenate");
        double augend = ScannerObject.myObj.nextDouble();
        System.out.println("Please enter second value to concatenate");
        double addend = ScannerObject.myObj.nextDouble();
        return (int) (augend + addend);
    }
}

