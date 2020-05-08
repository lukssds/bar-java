package bar;

import java.util.Locale;
import java.util.Scanner;
public class solucaobar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		char sexo;
		int cerveja,espeto,refri;
		double consumo, couvert, total, ingresso;
		
		
		
		System.out.print("Digite o sexo: ");
		sexo=sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		cerveja=sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri=sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espeto=sc.nextInt();
		
		
		if (sexo =='f') { 
			
			ingresso=8.0;
		}
		
		else {
			
			ingresso=10.0;
			
		}
		
		consumo=cerveja*5.0 + refri *3.0 + espeto*7.0;
		
		if (consumo > 30) {
			couvert=0.0;
			
		}
		else {
			couvert=4.0;
		}
		
		total= ingresso + consumo + couvert;
		
		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		
		if (couvert == 0.0) {
			System.out.println("Isento de Couvert");
			
		}
		
		else {
			
			System.out.printf("Couvert = R$ %.2f%n",couvert);
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n",total);
		sc.close();
	}

}
