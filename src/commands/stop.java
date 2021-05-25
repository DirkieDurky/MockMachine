package commands;

public class stop {
    public static void stop() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
        try {
            Thread.sleep(840);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String stopText = "N";
        System.out.println(stopText);
        for (int j = 0; j < 9; j++) {
            stopText += "o";
            System.out.println(stopText);
            try {
                Thread.sleep(69);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 50; i++) {
                System.out.println("\n");
            }
        }
        stopText += "-";
        System.out.println(stopText);
        try {
            Thread.sleep(69);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
