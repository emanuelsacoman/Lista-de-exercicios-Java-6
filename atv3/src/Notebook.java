public class Notebook extends Computador {
    private int codigo;

    public Notebook(){
        System.out.println("Notebook()");
        codigo = 12345;
        ligar();
    }
    public void ligar(){
        System.out.println("Código: "+codigo);
    }
}