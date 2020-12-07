package be.intecbrussel.hoofdstuk17.generieken_demo.demo3;

public class Demo3App {
    public static void main(String[] args) {
        NumberDuo<Integer, Short> numberDuo = new NumberDuo<>(3,Short.valueOf("5"));

        Number n1 = new Integer("5");
        Number n2 = new Byte("4");
        Number nSum = n1.doubleValue() + n2.doubleValue();
    }
}
