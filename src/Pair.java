public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "apple");

        System.out.println("Первая пара: " + pair);

        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
    }
}