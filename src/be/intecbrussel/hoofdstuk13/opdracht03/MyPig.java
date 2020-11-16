package be.intecbrussel.hoofdstuk13.opdracht03;

public class MyPig implements Pig{
    @Override
    public void grunt() {
        System.out.println("REEEEEE");
    }

    public static void main(String[] args) {
        MyPig knorretje = new MyPig();
        knorretje.grunt();
        knorretje.fly();
    }
}
