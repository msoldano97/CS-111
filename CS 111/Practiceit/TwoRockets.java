public class TwoRockets {
    
    public static void main (String[] args) {
        coneShape();
        section();
        box();
        section();
        unitedStates();
        section();
        box();
        section();
        coneShape();
    }
    public static void coneShape() {
         System.out.println("   /\\       /\\\n" +
                            "  /  \\     /  \\\n"+
                            " /    \\   /    \\");
    }
    public static void section() {
         System.out.println("+------+ +------+");
    }
    public static void box() {
         System.out.println("|      | |      |\n" +
                            "|      | |      |");
    }
    public static void unitedStates() {
          System.out.println("|United| |United\n" +
                             "|States| |States|");
    }
}
