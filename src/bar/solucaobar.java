package bar;

import java.util.Locale;
import java.util.Scanner;
public class solucaobar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		char sexo;
		int cerveja,espeto,refri;
		
		
		
		System.out.print("Digite o sexo: ");
		sexo=sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		cerveja=sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espeto=sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri=sc.nextInt();
		
		
		sc.close();
	}

}
