import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String toy1 = "1c, dickpick, 500, 30, usa";
        String toy2 = "2f, vagina, 1000, 30, china";
        String toy3 = "3e, gossip, 500, 150, usa";
        String toy4 = "4e, handcuffs, 100, 50, russia";
        String toy5 = "5a, heels, 500, 30, usa";
        String toy6 = "6d, inflatable woman, 500, 30, usa";
        String toy7 = "7c, inflatable man, 500, 30, usa";
        String toy8 = "8b, bigboobs, 500, 30, usa";
        String toy9 = "9b, inflatable ass, 500, 30, usa";
        String toy10 = "10c, inflatable vagina, 500, 30, usa";
        Lego lego = new Lego(toy1, toy2, toy3, toy4, toy5, toy6, toy7, toy8, toy9, toy10);
        try {
            lego.writeResultsToFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}