package be.intecbrussel.hoofdstuk12;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "Tony";
        int age = 26;

        System.out.println("My name is " + name + " and my age is " + age + ".");
        System.out.printf("My name is %s and my age is %d. %n", name, age);

        String myOutput = String.format("My name is %s and my age is %d.", name, age);
        System.out.println(myOutput);

        String table = "";
        table += String.format("%-20s %-20s %n", "Naam" , "Leeftijd");
        table += String.format("%-20s %-20d %n", "Tony", 45);
        table += String.format("%-20s %-20d %n", "Elline", 19);
        table += String.format("%-20s %-20d %n", "Manu", 56);
        table += String.format("%-20s %-20d %n", "JMRR", 100);


        System.out.println(table);

    }
}
