public class Cat extends Animal{

    Cat(double weight) {
        super(weight);
    }
    @Override
    void say() {
        System.out.println("мррр-мяу");
    }
}
