package Capsula;

public class ObjetoCliente {
	public static void main(String[] args) {

		Cliente cliente = new Cliente(1, "João Silva", "11999999999", "123.456.789-10", "MG-12.345.678");

        System.out.println("ID do Cliente: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("RG: " + cliente.getRg());

        cliente.setNome("Maria Oliveira");
        cliente.setTelefone("21988888888");

        System.out.println("Nome atualizado: " + cliente.getNome());
        System.out.println("Telefone atualizado: " + cliente.getTelefone());

    }
}
