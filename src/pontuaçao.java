import java.util.Locale;
import java.util.Scanner;

public class pontua�ao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
	//CABE�ALHO
	
	System.out.println("SISTEMA DE PERFIL DE CLIENTE");
	System.out.println("--------------------------------");
	System.out.println("IFORME OS DADOS DO �LTIMO ANO");
	
	//LEITURA DO VOLUME
	int compras,pagamento;
	System.out.println("Quantas compras o cliente fes no �ltimo ano?");
	compras=sc.nextInt();
	double ticket,total;
	System.out.printf("Qual o ticket medio?");
	ticket=sc.nextDouble();
	total=compras*ticket;
	
		
		sc.close();
	}

}
