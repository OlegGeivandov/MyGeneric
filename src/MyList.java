import java.util.*;

/*
Сделать собственную коллекцию, в которой будет
помещаться до 3 однотипных Животных,
которые при добавлении автоматически сортируются по весу
 */
public class MyList<E extends Animal> {

    private List<E> animals;

    public MyList() {
        this.animals = new ArrayList<>();
    }

    public int getCount() {
        return animals.size();
    }

    public List<E> getAnimals() {
        return animals;
    }

    public void put(E an) {
        if (animals.size() < 3) {
            animals.add(an);
            Collections.sort(animals);
        }
    }
}
