import java.text.DecimalFormat;
import java.util.Scanner;


public class Switch6 {
	public static void main(String[] args){
		
		int codigo=0;
		float salario=0;
		Scanner code = new Scanner(System.in);
		DecimalFormat df =  new DecimalFormat("0.00");
		
		System.out.println("Digite o seu salário atual");
		{while(salario == 0){	
			try{
			 salario = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		System.out.println("CARGO       | CÓDIGO | PERCENTUAL");
		System.out.println("Diretor     |   001  |    10%");
		System.out.println("Engenheiro  |   002  |    20%");
		System.out.println("Técnico     |   003  |    30%");
		System.out.println("Gerente     |   004  |    10%");
		System.out.println("Analista    |   005  |    30%");
		System.out.println("Coordenador |   006  |    20%");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		switch(codigo){
		
		case 001:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.1)));
			break;
		case 002:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.2)));
			break;
		case 003:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.3)));
			break;
		case 004:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.1)));
			break;
		case 005:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.3)));
			break;
		case 006:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.2)));
			break;
		default:
			System.out.println("Seu salário com aumento ficou em R$"+df.format(salario+(salario*0.4)));
			break;
	
		}}}}}


