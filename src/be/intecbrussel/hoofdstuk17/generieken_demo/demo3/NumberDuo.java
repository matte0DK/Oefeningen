package be.intecbrussel.hoofdstuk17.generieken_demo.demo3;

public class NumberDuo<E extends Number,T extends Number>{
    private E first;
    private T second;

    public NumberDuo(E first, T second) {
        setFirst(first);
        setSecond(second);
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }
}
