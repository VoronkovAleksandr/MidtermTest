import java.util.Objects;

public class Toy {
    private int id;
    private int weight;
    private String title;

    public Toy(int id, int weight, String title){
        this.id = id;
        this.weight = weight;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id && title.equals(toy.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return this.id +
                " " + this.title +
                " " + "Вес: " +  this.weight;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public int getWeight() {
        return weight;
    }
}
