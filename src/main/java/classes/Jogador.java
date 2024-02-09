package Classes;

public class Jogador {

    private String nome;
    private float banca;

    public Jogador(String nome, float banca) {
        this.nome = nome;
        this.banca = banca;
    }

    public static void main(String[] args) {
        Bichos bicharada = Bichos.getInstanciaDosBichos();
        float teste = bicharada.verificarBixos("Borboleta", "Camelo", 100, 50);
        System.out.println(teste);
    }

}
