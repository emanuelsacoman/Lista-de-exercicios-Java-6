public class Triangulo extends TwoDShape {
    private String estilo;

    public Triangulo(double largura, double altura, String estilo){
        super(largura, altura);
        this.estilo = estilo;
    }
    
    public double area() {
        return (getAltura() * getLargura()) / 2;
    }

    public void mostraEstilo() {
        System.out.println("Triangulo = " + estilo);
    }
}