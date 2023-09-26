import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    public Integer weight;
//    public int weight;



    abstract void say();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

//    @Override
//    public int compareTo(Animal o) {
//        if (o.weight>this.weight) return 1;
//        if (o.weight<this.weight) return -1;
//        return 0;
//    }

        @Override
    public int compareTo(Animal o) {
        int result = this.weight - o.weight;
        if (result == 0) {
            result = this.weight.compareTo(o.weight);
        }
        return result;
    }

//    @Override
//    public int compareTo(Person other) {
//        int result = this.age - other.age;
//        if (result == 0) {
//            result = this.name.compareTo(other.name);
//        }
//        return result;
//    }
}
