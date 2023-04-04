public class Produto {
    protected String nome;
    protected Double preco;
    
    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }
    
    public boolean isCaro(){
        return preco > 50.0;
    }
    
    public double calcularDesconto(double porcentagemDesconto){
        return preco * (1 - porcentagemDesconto/100);
    }
    
    public double calcularDesconto(double porcentagemDesconto, double valorMinimoDesconto){
        double desconto = preco * (1 - porcentagemDesconto/100);
        return desconto > valorMinimoDesconto ? desconto : valorMinimoDesconto;
    }
}