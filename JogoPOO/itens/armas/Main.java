public class Main {
    public static void main(String[] args) {
        // Criando objetos de armas
        Armas espada = new Armas("Espada Poderosa", "vermelha", "espada", 50, 20, 30, "Ataque corpo a corpo", "Ataque corpo a corpo", 1, 100.0);
        Armas cajado = new Armas("Cajado Místico", "laranja","cajado", 80, 20, 10, "Ataque mágico", "Inteligência mínima de 40", 3, 80.0);
        Armas adagas = new Armas("Adagas Sombrias","verde", "adaga", 70, 40, 5, "Ataque furtivo", "Destreza mínima de 50", 1, 70.0);
        Armas luvasSagradas = new Armas("Luvas Sagradas","branca", "Luvas", 60, 30, 15, "Curandeiro", "Fé mínima de 30", 1, 90.0);
        Armas besta = new Armas("Besta Poderosa","preta","besta", 90, 70, 5, "Ataque à distância", "Destreza mínima de 60", 10, 120.0);
        Armas arco = new Armas("Arco Élfico", "marrom","arco", 80, 60, 10, "Ataque à distância", "Destreza mínima de 50", 8, 100.0);
        Armas machado = new Armas("Machado Brutal", "preto","machado", 110, 80, 25, "Ataque poderoso", "Força mínima de 70", 1, 150.0);
        Armas chineloDaMae = new Armas("Chinelo da Mãe", "rosa","chinelo", 1, 1, 100, "Repreensão Divina", "Nenhum", 1, 0.0);
        Armas lança = new Armas("lança afiada", "prata","lança", 10, 11, 85, "Ataque à distância", "Nenhum", 1, 20.0);
        Armas faca = new Armas("faca de cozinha", "prata","lança", 10, 11, 85, "Ataque à distância", "Nenhum", 1, 20.0);
        // Criando objeto de armadura
        Armadura armadura = new Armadura("Elmo de Ferro", "Peitoral de Aço", "Braceletes de Couro", "Luvas de Malha", "Calças de Couro", "Botas de Ferro");
        // Definindo valores de proteção para cada parte da armadura
        armadura.setCapacete("Elmo de Ferro (+20 Defesa)");
        armadura.setPeitorais("Peitoral de Aço (+50 Defesa)");
        armadura.setBraceletes("Braceletes de Couro (+10 Defesa)");
        armadura.setLuvas("Luvas de Malha (+15 Defesa)");
        armadura.setCalcas("Calças de Couro (+20 Defesa)");
        armadura.setBotas("Botas de Ferro (+25 Defesa)");

        // Exibindo informações das armas
        System.out.println("Armas:");
        exibirInformacoesArma(espada);
        exibirInformacoesArma(cajado);
        exibirInformacoesArma(adagas);
        exibirInformacoesArma(luvasSagradas);
        exibirInformacoesArma(besta);
        exibirInformacoesArma(arco);
        exibirInformacoesArma(machado);
        exibirInformacoesArma(chineloDaMae);
        exibirInformacoesArma(lança);
        exibirInformacoesArma(faca);

        // Exibindo informações da armadura
        System.out.println("\nArmadura:");
        exibirInformacoesArmadura(armadura);
    }

    private static void exibirInformacoesArma(Armas armas) {
        System.out.println("Nome: " + armas.getNome());
        System.out.println("cor: " + armas.getcor());
        System.out.println("Tipo: " + armas.getTipoArmas());
        System.out.println("Duração: " + armas.getDuracao());
        System.out.println("Dano: " + armas.getDano());
        System.out.println("Defesa: " + armas.getDefesa());
        System.out.println("Função: " + armas.getFuncao());
        System.out.println("Requisitos: " + armas.getRequisitos());
        System.out.println("Alcance: " + armas.getAlcance());
        System.out.println("Valor de Troca: " + armas.getValorTroca());
        System.out.println();
    }

    private static void exibirInformacoesArmadura(Armadura armadura) {
        System.out.println("Capacete: " + armadura.getCapacete());
        System.out.println("Peitorais: " + armadura.getPeitorais());
        System.out.println("Braceletes: " + armadura.getBraceletes());
        System.out.println("Luvas: " + armadura.getLuvas());
        System.out.println("Calças: " + armadura.getCalcas());
        System.out.println("Botas: " + armadura.getBotas());
    }
}