package commands;

import static clipboard.clipboard.*;

public class clipboardCommand {
    public static void toggleClipboard() {
        if (getClipboardInt() == 0) {
            setClipboardInt(1);
            System.out.println("Je resultaten worden vanaf nu automatisch op je clipboard gezet");
        } else {
            setClipboardInt(0);
            System.out.println("Je resultaten worden vanaf nu niet meer automatisch op je clipboard gezet");
        }
    }
}