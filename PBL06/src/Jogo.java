public class Jogo extends Produto {
    private String plataforma;
    private double ano;
    private double preco;


    public Jogo(String plataforma, String nome, double ano, double preco) {
        super(nome);
        this.ano = ano;
        this.plataforma = plataforma;
        this.preco = preco;
    }


    @Override
    public double getAno() {
        return ano;
    }

    @Override
    public double getPreco() {
        return preco = ano * 1.5/preco ;
    }

}
