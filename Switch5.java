import java.text.DecimalFormat;
import java.util.Scanner;


public class Switch5 {
	public static void main(String[] args){
		
		int codigo=0;
		double preço=0;
		Scanner code = new Scanner(System.in);
		
		DecimalFormat df =  new DecimalFormat("0.00");
		
		System.out.println("Insira o valor da compra");
		{while(preço == 0){	
			try{
			 preço = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		System.out.println("Escolha a melhor forma de pagamento");
		System.out.println("1-À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-À vista com cartão de crédito, com 5% de desconto");
		System.out.println("3-Em 2 vezes, preço normal de etiqueta sem juros");
		System.out.println("4-Em 3 vezes, preço de etiqueta com acréscimo de 10%");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		switch(codigo){
		
		case 1:
			System.out.println("Total a pagar = R$"+(df.format(preço-(preço/10))));
			break;
		case 2:
			System.out.println("Total a pagar = R$"+(df.format(preço-(preço/20))));
			break;
		case 3:
			System.out.println("Total a pagar = R$"+df.format(preço)+" em 2 vezes de R$"+df.format(preço/2));
			break;
		case 4:
			System.out.println("Total a pagar = R$"+df.format(preço+(preço/10))+" em 3 vezes de R$"+df.format((preço+(preço/10))/3));
			break;
		default:
			System.out.println("Opção Inválida");
			break;
	
		}}}}}


