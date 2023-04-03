public class TwoDShape {
    private double largura;
    private double altura;

    public TwoDShape(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public void mostraDim() {
        System.out.println("Largura e altura = " + largura + " e " + altura);
    }
}