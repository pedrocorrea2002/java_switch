import java.util.Scanner;


public class Switch3 {
	public static void main(String[] args){
		
		int codigo=0;
		Scanner code = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("1-Inclusão de Alunos");
		System.out.println("2-Alteração de Alunos");
		System.out.println("3-Exclusão de Alunos");
		System.out.println("4-Consulta de Alunos");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		switch(codigo){
		
		case 1:
			System.out.println("Executa a rotina de Inclusão de Alunos");
			break;
		case 2:
			System.out.println("Executa a rotina de Alteração de Alunos");
			break;
		case 3:
			System.out.println("Executa a rotina de Exclusão de Alunos");
			break;
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
	
		}}}}


