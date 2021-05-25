import commands.*;
import java.util.Scanner;
import static clipboard.clipboard.setClipboard;
import static commands.capital.capitalToggle;

public class Console {
    public void console() {

        Scanner scanner = new Scanner(System.in);
        String result;
        //First message
        System.out.println("Hi, this is the MockMachine. It mocks everything you type. Try it!");
        while (true) {
            result = "";
            //Reads input
            String text = scanner.nextLine();
            //Commands
            switch (text) {
                case "/stop":
                case "/exit":
                case "/tyfop":
                case "/houop":
                case "/houdoe":
                case "/doei":
                case "/joe":
                case "/bye":
                case "/stfu":
                case "/joejoe":
                case "/byebye":
                    stop.stop();
                    return;
                case "/capital":
                    capital.capital();
                    break;
                case "/clipboard":
                    clipboardCommand.toggleClipboard();
                    break;
                case "/shrug":
                    shrug.shrug();
                    break;
                case "/help":
                    help.help();
                    break;
                case "/clear":
                    clear.clear();
                    break;
                default:

                    int repeat = 0;
                    int textLetter = 0;
                    int lengthOfText = text.length();
                    int capital = 0;

                    while (repeat < lengthOfText) {
                        char letterImDealingWith = text.charAt(textLetter);
                        textLetter++;
                        repeat++;
                        if (!capitalToggle) {
                            if (capital == 1) {
                                result += Character.toUpperCase(letterImDealingWith);
                            } else {
                                result += Character.toLowerCase(letterImDealingWith);
                            }
                        } else {
                            if (capital == 0) {
                                result += Character.toUpperCase(letterImDealingWith);
                            } else {
                                result += Character.toLowerCase(letterImDealingWith);
                            }
                        }
                        if (capital == 1) {
                            capital = 0;
                        } else {
                            capital = 1;
                        }
                    }
                    System.out.println(result);
                    setClipboard(result);
            }
        }
    }
}