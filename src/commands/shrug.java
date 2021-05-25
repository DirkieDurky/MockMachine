package commands;

import static clipboard.clipboard.*;

public class shrug {
    public static void shrug () {
        String result = "¯\\_(ツ)_/¯";
        System.out.println(result);
        setClipboard(result);
    }
}