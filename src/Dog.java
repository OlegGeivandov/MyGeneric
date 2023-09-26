public class Dog extends Animal{

    Dog(double weight) {
        super(weight);
    }
    @Override
    void say() {
        System.out.println("гав-гав");
    }
}
