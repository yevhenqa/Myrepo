// Remove numbers from the string "Wo2rld 2 ki3ll2 a5ll 2 g6reen tre8e2" and output to console

package Playground;

class TaskTwelve {
    static String anotherRemove () {
        System.out.println("Wo2rld 2 ki3ll2 a5ll 2 g6reen tre8e2");
        String otherString = "World 2 kill2 all 2 green tree2";
        otherString = otherString.replaceAll("[0-9]","");
        return otherString;
    }
}