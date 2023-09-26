import java.util.*;

/*
Сделать собственную коллекцию, в которой будет
помещаться до 3 однотипных Животных,
которые при добавлении автоматически сортируются по весу
 */
public class MyList {

    private List<Animal> animals;

    public MyList() {
        this.animals = new ArrayList<>();
    }

    public int getCount() {
        return animals.size();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void put(Animal an) {
        if (animals.size() < 3) {
            animals.add(an);
            Collections.sort(animals);
        }
    }
}
