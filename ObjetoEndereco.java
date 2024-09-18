package Capsula;

public class ObjetoEndereco {
	public static void main(String[] args) {

		Endereco endereco = new Endereco(1, "Rua das Flores", 123, "Apto 101", "Centro", "São Paulo", "01000-000", "SP");

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("UF: " + endereco.getUf());

        endereco.setLogradouro("Avenida Paulista");
        endereco.setNumero(456);

        System.out.println("Logradouro atualizado: " + endereco.getLogradouro());
        System.out.println("Número atualizado: " + endereco.getNumero());

        endereco.exibirInformacoes();
    }

}
