import java.util.Arrays;

// КЛАСС НЕ ИСПОЛЬЗУЕТСЯ
public class MyArray<E> {
    private final Object[] arr;
    public int length = 0;

    // конструктор
    public MyArray()
    {
        // Создает новый массив объектов указанной длины
        arr = new Object[length];
        this.length = length;
    }

    // Метод для получения объекта с индексом `i` в массиве
    E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E)arr[i];
        return e;
    }

    // Метод для установки значения `e` по индексу `i` в массиве
    void set(int i, E e) {
        arr[i] = e;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
