package RandomDado;
import java.util.Random;


public class dadoRamdom {
	public static void main(String[] args) {
		Random d6 = new Random();
		int[] numero =  new int[6];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = 0;
		}
		
		for (int i = 0; i < 6000 ; i++) {
			numero[d6.nextInt(6)]++;
		}
		
		for (int i = 0; i < numero.length ; i++) {
			System.out.println("Numero "  + (i+1) + ":" +numero[i]);
		}
	}

}
