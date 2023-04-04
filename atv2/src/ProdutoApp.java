public class ProdutoApp {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50);
        if (produto.isCaro()) {
            System.out.println("O produto " + produto.getNome() + " é caro.");
        } else {
            System.out.println("O produto " + produto.getNome() + " não é caro.");
        }
        
        Livro livro = new Livro(256, "Machado de Assis");
        if (livro.isExtenso()) {
            System.out.println("O livro é extenso, tem " + livro.getPaginas() + " páginas.");
        } else {
            System.out.println("O livro não é extenso, tem " + livro.getPaginas() + " páginas.");
        }
    }
}