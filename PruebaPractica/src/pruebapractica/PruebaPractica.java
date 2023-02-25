package pruebapractica;

import java.util.Scanner;

public class PruebaPractica {

	public static void main(String[] args) {
		//Calculadora que reciba una operación aritmética en una cadena de caracteres, que se pueda validar que es una fórmula válida, e imprimir dicha operación y el paso a paso de la misma.
		
		//Delacarión del método necesario para la entrada de datos por consola
		Scanner entrada = new Scanner (System.in);
		//Declaración de la variable String donde entrará la fórmula
		String formula = "";
		
		System.out.println("Ingerse la fórmula artimética: ");
		formula = entrada.nextLine();
		System.out.println("Resolución de la fórmula:\n"+formula);
		
		System.out.println(calculo(formula));
	}
	
	//Creación de la función
	public static String calculo (String formula) {
		String result=" ";
		char suma = '+';
		char resta = '-';
		char multi = '*';
		char div = '/';
		char parentesisi = '(';
		char parentesisf = ')';
		int operator1, operator2;
		String numS;
		double numD;
		char [] n_formula = formula.toCharArray();

		//Búsqueda de un paréntesis
		for (int i=0 ; i<formula.length(); i++) {
			if (n_formula[i] == parentesisi) {
				operator1 = (int)i;
				for (int f=operator1; f<formula.length(); f++) {
					if (n_formula[f] == parentesisf) {
						operator2 = (int)f;
						numS = formula.substring((i+1), (f-1));
						numD = Double.parseDouble (numS);
						
					}
				}
			}
			return result;
		}
		
		
	}

}
