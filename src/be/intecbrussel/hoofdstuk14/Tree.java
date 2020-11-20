package be.intecbrussel.hoofdstuk14;

public class Tree { //outerClass

    private String name;
    private int number;

    public void useFullMethod() {
        System.out.println("very use full");
    }

    public void useTree() {
        DeciduousTree populier = new DeciduousTree();
        System.out.println(populier.hasIdeas());
    }

    public class DeciduousTree { //innerClass
        private String type;
        public boolean hasIdeas() {
            return true;
        }
    }
}
