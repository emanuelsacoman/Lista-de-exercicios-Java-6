public class Livro {
    private String autor;
    private int paginas;

    public Livro(int paginas, String autor){
        this.paginas = paginas;
        this.autor = autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public boolean isExtenso(){
        return paginas > 100;
    }
    
    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}