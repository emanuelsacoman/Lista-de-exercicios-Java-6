public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4.0, 4.0, "cheio");
        Triangulo t2 = new Triangulo(12.0, 8.0, "contorno");

        Retangulo r1 = new Retangulo(2.0, 2.0);
        Retangulo r2 = new Retangulo(6.0, 3.0);

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());

        System.out.println("\nInfo para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());
        
        System.out.println("\nInfo para r1: ");
        r1.isQuadrado();
        System.out.println("Area = " + r1.area());
        
        System.out.println("\nInfo para r2: ");
        r2.isQuadrado();
        System.out.println("Area = " + r2.area());
    }
}    