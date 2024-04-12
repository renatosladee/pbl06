public class Roupa extends Produto {
    private double tamanhoLargura;
    private double tamanhoComprimento;
    private double precoTecido;
    private double ano;

    public Roupa(double tamanhoLargura, double tamanhoComprimento, String nome, double precoTecido, double ano) {
        super(nome);
        this.precoTecido = precoTecido;
        this.tamanhoLargura = tamanhoLargura;
        this.tamanhoComprimento = tamanhoComprimento;
        this.ano = ano;
    }

    public double gettamanhoComprimento() {
        return tamanhoComprimento;
    }

    public double gettamanhoLargura() {
        return tamanhoLargura;
    }

    public boolean iscropped() {
        return tamanhoLargura > tamanhoComprimento;
    }

    @Override
    public double getAno() {
        return ano;
    }

    @Override
    public double getPreco() {
        return (tamanhoComprimento * tamanhoLargura) / precoTecido * .2;
    }
}
