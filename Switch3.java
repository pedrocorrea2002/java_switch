import java.util.Scanner;


public class Switch3 {
	public static void main(String[] args){
		
		int codigo=0;
		Scanner code = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("1-Inclus�o de Alunos");
		System.out.println("2-Altera��o de Alunos");
		System.out.println("3-Exclus�o de Alunos");
		System.out.println("4-Consulta de Alunos");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		
		switch(codigo){
		
		case 1:
			System.out.println("Executa a rotina de Inclus�o de Alunos");
			break;
		case 2:
			System.out.println("Executa a rotina de Altera��o de Alunos");
			break;
		case 3:
			System.out.println("Executa a rotina de Exclus�o de Alunos");
			break;
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
	
		}}}}


