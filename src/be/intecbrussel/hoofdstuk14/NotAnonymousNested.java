package be.intecbrussel.hoofdstuk14;

public class NotAnonymousNested {
    public static void main(String[] args) {
//        Ice myIceCreamCone = new IceCream();
//        myIceCreamCone.melt(); => non anonymous.

        Ice myMagnum44 = new Ice() {
            @Override
            public void melt() {
                System.out.println("why does it have trigger? ");
            }
        };

        myMagnum44.melt();
    }
}
