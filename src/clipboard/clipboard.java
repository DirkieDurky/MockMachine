package clipboard;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class clipboard {

    private static int clipboardInt = 1;

    public static void setClipboard (String result) {
        if (clipboardInt == 1) {
            StringSelection stringSelection = new StringSelection(result);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    public static int getClipboardInt() {
        return clipboardInt;
    }

    public static void setClipboardInt(int givenClipboardInt) {
        clipboardInt = givenClipboardInt;
    }
}