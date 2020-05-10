import java.util.Scanner;


public class Switch4 {
	public static void main(String[] args){
		
		int codigo=0,num1=0,num2=0,num3=0;
		Scanner code = new Scanner(System.in);
		
		System.out.println("Selecione a média que deseja calcular");
		System.out.println("Opção 1: média aritmética");
		System.out.println("Opção 2: média ponderada(3,3,4)");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		switch(codigo){
		
		case 1:
			System.out.println("Agora digite 3 números, conforme indicado");
			System.out.println("Número 1");
			
			{while(num1 == 0){	
				try{
				 num1 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			System.out.println("Número 2");
			
			{while(num2 == 0){	
				try{
				 num2 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			System.out.println("Número 3");
			
			{while(num3 == 0){	
				try{
				 num3 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			float r=(num1+num2+num3)/3;
			System.out.println(r);
			break;
			}}}
		case 2:
			System.out.println("Agora digite 3 números, conforme indicado");
			System.out.println("Número 1");
			
			{while(num1 == 0){	
				try{
				 num1 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			System.out.println("Número 2");
			
			{while(num2 == 0){	
				try{
				 num2 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			System.out.println("Número 3");
			
			{while(num3 == 0){	
				try{
				 num3 = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor");
				}}
			float r=((num1*3)+(num2*3)+(num3*4))/10;
			System.out.println(r);
			break;
			}}}
		default:
			System.out.println("Opção Inválida");
			break;
	
		}}}}


