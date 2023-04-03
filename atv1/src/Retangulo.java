public class Retangulo extends TwoDShape{

    public Retangulo(double largura, double altura){
        super(largura, altura);
    }

    public boolean isQuadrado(){
        if (getAltura() == getLargura()){
            System.out.println("É um quadrado.");
            return true;
        }else {
            System.out.println("É um retangulo.");     
            area();       
            return false;
        }
    }

    public double area(){
        return getLargura() * getAltura();
    }
}