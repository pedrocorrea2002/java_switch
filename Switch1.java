import java.util.Scanner;


public class Switch1 {
	public static void main(String[] args){
		
		int codigo=0;
		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite o código do produto:");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		switch(codigo){
		
		case 001:
			System.out.println("Parafuso");
			break;
		case 002:
			System.out.println("Porca");
			break;
		case 003:
			System.out.println("Prego");
			break;
		case 004:
			System.out.println("Ferramenta");
			break;
		default:
			System.out.println("Diversos");
			break;
	
		}}}}


