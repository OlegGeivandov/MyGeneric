public class Mouse extends Animal{

    Mouse(double weight) {
        super(weight);
    }

    @Override
    void say() {
        System.out.println("пи-пи-пи");
    }
}
