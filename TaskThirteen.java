/* Output to console the following pyramid:
                 9
               8 9 8
             7 8 9 8 7
           6 7 8 9 8 7 6
         5 6 7 8 9 8 7 6 5
       4 5 6 7 8 9 8 7 6 5 4
     3 4 5 6 7 8 9 8 7 6 5 4 3
   2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
package Playground;

class TaskThirteen {
    static String pyramid() {
        int x = 9;

        for (int i = 9; i <= x; i++) {

            for (int j = 1; j <= x - i; j++)
                System.out.print("   ");

            for (int k = i; k >= 1; k--)
                System.out.print((k >= 10) ? +k : "  " + k);

            for (int k = 2; k <= i; k++)
                System.out.print((k >= 10) ? +k : "  " + k);
            System.out.println();
        }
        return "";
    }
}

