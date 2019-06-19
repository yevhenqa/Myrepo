// Remove numbers from the string "World 2 kill2 all 2 green tree2" and output to console

package Playground;

class TaskEleven {
    static String removeNumbers () {
        System.out.println("Initial string: World 2 kill2 all 2 green tree2");
        String inistring = "World 2 kill2 all 2 green tree2";
        inistring = inistring.replaceAll("[0-9]","");
        return inistring;
    }
}
