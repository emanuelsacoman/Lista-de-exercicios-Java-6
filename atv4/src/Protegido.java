public class Protegido {
    private int i;
    
    public Protegido(int i) {
        this.i = i;
    }

    protected int getI() {
        return i;
    }

    protected void ajustar(int i) {
        this.i = i;
    }
}