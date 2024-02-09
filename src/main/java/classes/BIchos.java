package Classes;

import java.util.Random;

public class Bichos {

    private static Bichos instancia = null;
    private String[] bichos = { "Avestruz", "Aguia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro",
            "Camelo", "Cobra", "Coelho", "Cavalo" };

    private Bichos() {
        // Construtor privado para impedir a criação de instâncias diretamente.
    }

    public static Bichos getInstanciaDosBichos() {
        if (instancia == null) {
            instancia = new Bichos();
        }
        return instancia;
    }

    public String[] getBichosDoJogo() {
        return bichos;
    }

    public void printarBichos() {
        for (int i = 0; i < bichos.length; i++) {
            System.out.println(bichos[i]);
        }
    }

    public String[] getBichos() {
        return bichos;
    }

    public void setBichos(String[] bichos) {
        this.bichos = bichos;
    }

    public float verificarBixos(String bichoEscolhido1, String bichoEscolhido2, float banca, float aposta) {
        Bichos bicharada = Bichos.getInstanciaDosBichos();
        Random rand1 = new Random();
        Random rand2 = new Random();
        int randomico1 = rand1.nextInt(11);
        int randomico2 = rand2.nextInt(11);
        boolean acertou1 = false;
        boolean acertou2 = false;

        if (banca <= 0 || banca < aposta) {
            System.out.println("Sua banca é insuficiente para jogar!");

        } else {

            if (bichoEscolhido1.equals(bicharada.getBichos()[randomico1])
                    || bichoEscolhido1.equals(bicharada.getBichos()[randomico2])) {
                acertou1 = true;
                System.out.println("Acertou o bicho: " + bichoEscolhido1);
            }
            if (bichoEscolhido2.equals(bicharada.getBichos()[randomico1])
                    || bichoEscolhido2.equals(bicharada.getBichos()[randomico2])) {
                acertou2 = true;
                System.out.println("Acertou o bicho: " + bichoEscolhido2);
            }
            System.out.println("Bichos sorteados: " + bicharada.getBichos()[randomico1] + " e "
                    + bicharada.getBichos()[randomico2]);
            if (acertou1 && acertou2) {
                System.out.println("Acertou os 2 bichos!");
                System.out.println("Valor apostado: " + aposta);
                System.out.println("Valor apostada duplicada! \nBanca final:" + (banca += aposta * 2));
            } else if (acertou1 || acertou2) {
                System.out.println("Acertou pelo menos um dos bichos! ");
                System.out.println("Valor apostado: " + aposta);
                System.out.println("Valor apostado será somado com sua metade! \nBanca final: "
                        + (banca += aposta + (aposta / 2)));

            } else {
                System.out.println("Não acertou nenhum bicho!");
                System.out.println("Valor apostado: " + aposta);
                System.out.println("Valor apostado foi perdido! \nBanca final: " + (banca -= aposta));

            }
            return banca;
        }
        return 0;
    }
}
