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
	//LEITURA DE OUTROS DADOS
	System.out.println("Quantas vezes o cliente atrasou o pagamento?");
	pagamento=sc.nextInt();
	char pagamentoDBC;
	System.out.println("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
	pagamentoDBC=sc.next().charAt(0);
	
	
		
		
		
		sc.close();
	}

}
