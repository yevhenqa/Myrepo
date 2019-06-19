// Output to console what number from 1 to 3 user entered

package Playground;

import org.jetbrains.annotations.NotNull;

class TaskOne {
    @NotNull
    static String threeNumbers()
    {
        System.out.println("Please enter 1, 2 or 3");
        int userNumber = ScannerObject.myObj.nextInt();
        if (userNumber == 1) {
            return "You entered 1";
        } else if (userNumber == 2) {
            return "You entered 2";
        } else if (userNumber == 3) {
            return "You entered 3";
        } else {
            return "Please enter right number";
        }
    }
}