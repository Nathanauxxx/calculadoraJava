
package calculadora;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Double valorUm;
	Double valorDois;
	String operacao;
	boolean continuar;
	try {
		do {
			System.out.println("digite o valor um:");
			valorUm= scanner.nextDouble();
			
			System.out.println("digite a operacao (+, -,/, *):");
			operacao = scanner.next();
			
			System.out.println("digite o valor dois:");
			valorDois = scanner.nextDouble();
			
			System.out.println("resultado:" + realizarCalculo(valorUm,valorDois,operacao));
			
			continuar = verificarNovoOperacao();
	
	
	}while(continuar);
	

	}catch(InputMismatchException ex) {
		System.out.println("os valores para calculo devem ser numericos");
	}
}
	public static boolean verificarNovoOperacao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("deseja realizar uma nova operacao?(s ou n)");
		return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
	}
	public static Double realizarCalculo(Double valorUm,Double valorDois,String operacao) {
		Double respostaCalculo = 0.0;
		
		switch (operacao) {
		case "+":
			respostaCalculo = valorUm + valorDois;
			break;
		case "-":
			respostaCalculo = valorUm - valorDois;
			break;
		case "*":
			respostaCalculo = valorUm * valorDois;
			break;
		case "/":
			respostaCalculo = valorUm / valorDois;
			break;
			default:
			System.out.println("operacao e invalida '-'");
			break;
		}
		return respostaCalculo;

	}
}
