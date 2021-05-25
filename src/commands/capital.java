package commands;

public class capital {

    public static boolean capitalToggle;

    public static void capital() {
        if (!capitalToggle) {
            capitalToggle = true;
            System.out.println("De resultaten zullen vanaf nu beginnen met een hoofdletter");
        } else {
            capitalToggle = false;
            System.out.println("De resultaten zullen vanaf nu beginnen zonder hoofdletter");
        }
    }
}