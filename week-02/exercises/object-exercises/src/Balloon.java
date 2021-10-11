public class Balloon {
    private String color;
    private double psi;


    public String getColor() {
        return color;
    }
    public double getPsi() {
        return psi;
    }

    public Balloon(String color) {
        this.color = color;
    }
    public double inflate() {
        this.psi = this.psi + Math.random() * 5;
        if (this.psi > 16) {
            return Double.POSITIVE_INFINITY;
        } else {
            return this.psi;
        }
    }
    public boolean isExploded() {
        if (this.psi > 16) {
            return true;
        } else {
            return false;
        }
    }
}
