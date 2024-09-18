package Capsula;

public class ObjetoTema {
	public static void main(String[] args) {
	Tema tema = new Tema(1, "Tema Festa Infantil", 200.00, "Azul");

    System.out.println("Nome do Tema: " + tema.getNome());
    System.out.println("Valor do Aluguel: " + tema.getValorAluguel());
    System.out.println("Cor da Toalha: " + tema.getCorToalha());

    tema.setValorAluguel(250.00);
    System.out.println("Novo Valor do Aluguel: " + tema.getValorAluguel());

    tema.setNome("Tema Festa Adulto");
    tema.setCorToalha("Vermelha");

    System.out.println("Nome do Tema atualizado: " + tema.getNome());
    System.out.println("Cor da Toalha atualizada: " + tema.getCorToalha());
    System.out.println("Valor do Aluguel atualizado: " + tema.getValorAluguel());

    tema.exibirInformacoes();
}
}

