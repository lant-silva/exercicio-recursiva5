package view;

public class Main {
	public static void main(String[] args) {
		
		int num = 1231123;
		int digitos = recursivaDigitos(num);
		System.out.println(digitos);
		
	}

	private static int recursivaDigitos(int num) {
		int total;
		if(num<10) { //condição de parada
			return 1;
		}else {
			total = recursivaDigitos(num/10); //chamada recursiva
			total++;
		}
		return total;
	}
}
