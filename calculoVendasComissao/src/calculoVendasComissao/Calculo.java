package calculoVendasComissao;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		String nome;
		double ano, vendas;
		
		System.out.print("Nome do vendedor: ");
		nome = leitor.next();		
		System.out.print("Quanto tempo de trabalho:");
		ano = leitor.nextDouble();		
		System.out.print("Total de vendas: ");		
		vendas = leitor.nextDouble();
		
		leitor.close();
		
		if (vendas >= 10.000 && vendas < 20.000 && ano >=1) {
			double por1 = vendas*0.05/(100);
			System.out.println(nome + " Sua comissão é de: " + por1);
			System.out.println("-----------------------------------------");
		} else if(vendas>=20.000 && ano>=1) {
			double por2 = vendas*0.10/(100);
			System.out.println(nome + " Sua comissão é de: " + por2);
			
		}else {
			double por3 =vendas*3/(100);
		}
		}
		
	

}
