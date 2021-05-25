package commands;

public class help {
    public static void help() {
        System.out.println("Noob, pros hebben geen hulp nodig");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Oke dan, dit zijn de commands die je kunt gebruiken:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n/clipboard: toggle of de resultaten automatisch op je clipboard gezet worden (standaard: aan)" +
                "\n/capital: toggle of je tekst begint met een hoofdletter of niet (standaard: zonder hoofdletter)" +
                "\n/shrug: stuur een shrug" +
                "\n/clear: haalt alle tekst op het scherm weg" +
                "\n/stop: stopt het programma");
    }
}
