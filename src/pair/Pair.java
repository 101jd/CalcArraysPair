package pair;

public class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second){
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
        return new StringBuilder()
                .append("First: ")
                .append(first.toString())
                .append(System.lineSeparator())
                .append("Second: ")
                .append(second.toString())
                .toString();
    }
}
