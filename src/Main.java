public class Main {
    public static void main(String[] args) {

        MyList<Animal> collection = new MyList();

        Animal cat = new Cat(5.2);
        Animal dog = new Dog(7.8);
        Animal mouse = new Mouse(0.5);

        collection.put(cat);
        collection.put(dog);
        collection.put(mouse);

        for (Animal animal : collection.getAnimals()) {
            animal.say();
        }

    }
}