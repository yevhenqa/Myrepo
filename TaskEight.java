//Sort array in ascending order 8 15 1 7 26 100 3 1 7 5 5 12 48 33 11 75

package Playground;

import java.util.Arrays;

class TaskEight {
    static String arrSort() {
        int[] arr = {8,15,1,7,26,100,3,1,7,5,5,12,48,33,11,75};
        Arrays.sort(arr);
        System.out.printf("Sorted array : %s",
                Arrays.toString(arr));

        return "";
    }
}
