import java.text.DecimalFormat;
import java.util.Scanner;


public class Switch5 {
	public static void main(String[] args){
		
		int codigo=0;
		double pre�o=0;
		Scanner code = new Scanner(System.in);
		
		DecimalFormat df =  new DecimalFormat("0.00");
		
		System.out.println("Insira o valor da compra");
		{while(pre�o == 0){	
			try{
			 pre�o = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		
		System.out.println("Escolha a melhor forma de pagamento");
		System.out.println("1-� vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-� vista com cart�o de cr�dito, com 5% de desconto");
		System.out.println("3-Em 2 vezes, pre�o normal de etiqueta sem juros");
		System.out.println("4-Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
		{while(codigo == 0){	
			try{
			 codigo = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		
		switch(codigo){
		
		case 1:
			System.out.println("Total a pagar = R$"+(df.format(pre�o-(pre�o/10))));
			break;
		case 2:
			System.out.println("Total a pagar = R$"+(df.format(pre�o-(pre�o/20))));
			break;
		case 3:
			System.out.println("Total a pagar = R$"+df.format(pre�o)+" em 2 vezes de R$"+df.format(pre�o/2));
			break;
		case 4:
			System.out.println("Total a pagar = R$"+df.format(pre�o+(pre�o/10))+" em 3 vezes de R$"+df.format((pre�o+(pre�o/10))/3));
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
	
		}}}}}


