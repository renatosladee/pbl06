public class Main {
    private Produto[] produtos = {
            new Jogo("PC", "Temple Guardians", 2022, 50),
            new Jogo("Playstation 5", "Helldivers 2", 2024, 80),
            new Roupa(86, 42, "Cropped Maravilha", 5, 2024),
            new Roupa(90, 110, "Sobretudo Preto", 3, 1998)
    };

    private void imprimir(Produto f) {
        System.out.println("Nome: " + f.getNome());
        System.out.println("Ano: " + f.getAno());
        System.out.println("Preco: " + f.getPreco());
    }

    public void run() {
        System.out.println("JOGOS E ROUPAS: ");
        System.out.println();

        for (Produto f: produtos) {
            imprimir(f);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}