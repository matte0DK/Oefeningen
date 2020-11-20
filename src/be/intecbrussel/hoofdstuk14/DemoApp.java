package be.intecbrussel.hoofdstuk14;

public class DemoApp {

    public static void main(String[] args) {

        Tree myTree = new Tree();
        Tree.DeciduousTree myDeciduous = myTree.new DeciduousTree();

        myDeciduous.hasIdeas();
    }
}
