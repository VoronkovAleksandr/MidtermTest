import java.util.ArrayList;
import java.util.List;

public class Toys {
    private List<Toy> toys = new ArrayList();

    public void addToy(int id, int weight, String title){
        Toy toy = new Toy(id, weight, title);
        this.toys.add(toy);
    }

    public Toy getToyById(int id){
        for (Toy toy: toys){
            if (toy.getId() == id){
                return toy;
            }
        }
        return null;
    }

    public String getToysToString(){
        StringBuilder sb = new StringBuilder();
        for (Toy toy: toys){
            sb.append(toy.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<Toy> getToys(){
        return toys;
    }

    public int size(){
        return toys.size();
    }

}
