import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Lego {
    private static PriorityQueue<SexShop> queue;

    public Lego(String toy1, String toy2, String toy3, String toy4, String toy5, String toy6, String toy7, String toy8, String toy9, String toy10) {
        queue = new PriorityQueue<>();

        addToy(toy1);
        addToy(toy2);
        addToy(toy3);
        addToy(toy4);
        addToy(toy5);
        addToy(toy6);
        addToy(toy7);
        addToy(toy8);
        addToy(toy9);
        addToy(toy10);
        System.out.println(queue.peek());
    }

    private void addToy(String toyString) {
        String[] toyArr = toyString.split(",");
        String id = toyArr[0].trim();
        String name = toyArr[1].trim();
        int weight = Integer.parseInt(toyArr[2].trim());
        int size = Integer.parseInt(toyArr[3].trim());
        String country = toyArr[4].trim();
        SexShop sexShop = new SexShop(id, name, weight, size, country);
        queue.add(sexShop);
    }

    public void writeResultsToFile() throws IOException {
        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < 10; i++) {
                SexShop toy = getRandomToy();
                if (toy != null) {
                    writer.write(toy.getId() + " " + toy.getName() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private SexShop getRandomToy() {
        int random = (int) (Math.random() * 10);
        if (random < 2) {
            return queue.poll();
        } else if (random >= 4 && random < 11) {
            queue.add(queue.poll());
            return queue.poll();
        } else {
            return queue.peek();
        }
    }
}