package POO;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
			
		aviao1.setCor("Red");
		aviao1.setPorte("Médio");
		aviao1.setQtdAssento(60);
		aviao1.setVelocidade(150);
		
		aviao2.setCor("Blue");
		aviao2.setPorte("Médio");
		aviao2.setQtdAssento(60);
		aviao2.setVelocidade(80);
		
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getVelocidade());
		System.out.println(aviao1.voar());
		
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getVelocidade());
		System.out.println(aviao1.pousar());

	}

}
