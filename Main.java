
public class Main {
    public static void main(String[] args) {
        Toys toys = new Toys();
        toys.addToy(1, 2, "Верблюд");
        toys.addToy(2,2,"Конструктор");
        toys.addToy(3, 6, "Робот");

        System.out.println(toys.getToysToString());
    }
}
