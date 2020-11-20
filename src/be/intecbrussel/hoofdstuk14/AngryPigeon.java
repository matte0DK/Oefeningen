package be.intecbrussel.hoofdstuk14;

public class AngryPigeon {

    public Object throwPigeon() {
        int anthonysWeight = 420;

        class Pigeon {
            private String name;
//            private int weight = anthonysWeight;

            public Pigeon(String name) {
                this.name = name;
//                this.weight = anthonysWeight;
            }

            @Override
            public String toString() {
                return "Pigeon{" +
                        "name= " + name + '\'' +
                        ", weight= " + anthonysWeight + '}';
            }
        }

        Pigeon myPigeon = new Pigeon("Anthony");
        System.out.println("Throwing " + myPigeon + " on Manu.");
        return myPigeon;
    }
}
