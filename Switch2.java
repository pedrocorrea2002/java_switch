import java.util.Scanner;


public class Switch2 {
	public static void main(String[] args){
		
		int codigo=0,quantidade=0;
		Scanner code = new Scanner(System.in);
		
		System.out.println("Bem vindo a lanchonete Bom Gosto ^-^");
		System.out.println("Segue abaixo o nosso cardapio");
		System.out.println("ESPECIFICAÇÃO   | CÓDIGO | PREÇO");
		System.out.println("Cachorro Quente |   100  |  3,20");
		System.out.println("Bauru Simples   |   101  |  4,30");
		System.out.println("Bauru com Ovo   |   102  |  5,50");
		System.out.println("Hambúrguer      |   103  |  3,20");
		System.out.println("CheeseBurguer   |   104  |  4,30");
		System.out.println("Refrigerante    |   105  |  4,00");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		System.out.println("Agora digite a quantidade que deseja");
		{while(quantidade == 0){	
			try{
			 quantidade = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		switch(codigo){
		
		case 100:
			System.out.println("Seu pedido de "+quantidade+" Cachorro(s) quente(s) ficou no valor de R$"+(quantidade*3.20));
			break;
		case 101:
			System.out.println("Seu pedido de "+quantidade+" Bauru(s) Simples ficou no valor de R$"+(quantidade*4.30));
			break;
		case 102:
			System.out.println("Seu pedido de "+quantidade+" Bauru(s) com ovo ficou no valor de R$"+(quantidade*5.50));
			break;
		case 103:
			System.out.println("Seu pedido de "+quantidade+" Hambúrguer(s) Simples ficou no valor de R$"+(quantidade*3.20));
			break;
		case 104:
			System.out.println("Seu pedido de "+quantidade+" Cheeseburguer(s) Simples ficou no valor de R$"+(quantidade*4.30));
			break;
		case 105:
			System.out.println("Seu pedido de "+quantidade+" Refrigerante(s) Simples ficou no valor de R$"+(quantidade*4.00));
			break;
		default:
			System.out.println("Produto inexistente");
			break;
	
		}}}}}


