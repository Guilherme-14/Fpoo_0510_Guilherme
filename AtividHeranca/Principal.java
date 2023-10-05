package AtividHeranca;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo ("Bmw" , "X1" , 2020 , "Branca");
		System.out.println("Veiculo:");
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		
		Automovel automovel = new Automovel ("Bmw" , "X1" , 2020 , "Branca" ,4 , "220 cavalos");
		System.out.println("Automovel:");
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		System.out.println(automovel.getNumPortas());
		System.out.println(automovel.getMotor());
		
		Moto moto = new Moto("Bmw" , "X1" , 2020 , "Branca" , 1000);
		System.out.println("Moto:");
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		System.out.println(moto.getCilindrada());
		
	}

}
