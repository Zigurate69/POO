package POO3;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(12345678);
		cliente1.setNome("Samuel");
		cliente1.setTelefone("xxxxxxxxxx");
		cliente1.setCPF("xxxxxxxxxx");
		cliente1.setRG("xxxxxxxxxx");
		cliente1.setGenero("Masculino");
		cliente1.setLocalizacao("Jardim Fogaça");
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getRG());
		System.out.println(cliente1.getGenero());
		System.out.println(cliente1.getLocalizacao());
		

	}

}
