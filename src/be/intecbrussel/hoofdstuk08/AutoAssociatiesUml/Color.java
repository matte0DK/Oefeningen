package be.intecbrussel.hoofdstuk08.AutoAssociatiesUml;

public class Color {
    private String name;
    private int[] rgb = new int[3];

    // constructor
    public Color(String name, int r, int g, int b) {
        this.name = name;
        this.rgb[0] = r;
        this.rgb[1] = g;
        this.rgb[2] = b;
    }

    // getters
    public String getName() {
        return name;
    }

    public int[] getRgb() {
        return rgb;
    }
}
