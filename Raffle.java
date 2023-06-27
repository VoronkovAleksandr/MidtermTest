import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Raffle {
    private String winning;
    private Toys toys;

    public Raffle(Toys toys) {
        this.toys = toys;
    }

    public void start(){
        Random r = new Random();
        Queue toysInRaffle = new PriorityQueue();
        for (Toy toy: toys.getToys()) {
            for (int i = 0; i < toy.getWeight(); i++) {
                toysInRaffle.add(toy.toString());
            }
        }
        int rndNum = r.nextInt(1, toysInRaffle.size());
        for (int i = 0; i < rndNum; i++) {
            winning = (String) toysInRaffle.poll();
        }
    }
    public String getWinning(){
        return winning;
    }
}
