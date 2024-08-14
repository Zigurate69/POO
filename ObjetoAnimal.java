package POO2;

public class ObjetoAnimal {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();

		animal1.setNome("Cleusa");
		animal1.setGenero("Feminino");
		animal1.setCor("Marrom");
		animal1.setPeso(500);

		animal2.setNome("Lowsten");
		animal2.setGenero("Masculino");
		animal2.setCor("Branco");
		animal2.setPeso(210);

		animal3.setNome("Scanor");
		animal3.setGenero("Masculino");
		animal3.setCor("Cinza");
		animal3.setPeso(197);

		System.out.println(animal1.getNome());
		System.out.println(animal1.getGenero());
		System.out.println(animal1.getCor());
		System.out.println(animal1.getPeso());

		System.out.println(animal2.getNome());
		System.out.println(animal2.getGenero());
		System.out.println(animal2.getCor());
		System.out.println(animal2.getPeso());

		System.out.println(animal3.getNome());
		System.out.println(animal3.getGenero());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getPeso());
	}
}