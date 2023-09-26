import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    public double weight;

    abstract void say();

    Animal(double weight) {
        this.weight = weight;
    }

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
        @Override
    public int compareTo(Animal o) {
        return Double.compare(this.weight, o.weight);
    }
}
