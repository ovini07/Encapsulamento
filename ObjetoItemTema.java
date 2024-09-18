package Capsula;

public class ObjetoItemTema {

	public static void main(String[] args) {
		ItemTema itemTema = new ItemTema (1, "Balões", "Balões coloridos para decoração");

		
		System.out.println("Nome do Item: " + itemTema.getNome());
		System.out.println("Descrição: " + itemTema.getDescricao());
		
		itemTema.setNome("Flores");
		itemTema.setDescricao("Flores artificiais para decoração");

		System.out.println("Nome do Item atualizado: " + itemTema.getNome());
		System.out.println("Descrição atualizada: " + itemTema.getDescricao());

		itemTema.exibirInformacoes();
	}

}
