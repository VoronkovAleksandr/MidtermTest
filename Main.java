
public class Main {
    public static void main(String[] args) {
        Toys toys = new Toys();
        Raffle raffle = new Raffle(toys);
        StringBuilder sb = new StringBuilder();
        WriteData writeData = new WriteData("text.txt");

        toys.addToy(1, 2, "Верблюд");
        toys.addToy(2,2,"Конструктор");
        toys.addToy(3, 6, "Робот");
        toys.addToy(4,10,"Самокат");

        for (int i = 0; i < 10; i++) {
            raffle.start();
            sb.append(raffle.getWinning());
            sb.append("\n");
        }
        writeData.SaveData(sb.toString());
    }
}
