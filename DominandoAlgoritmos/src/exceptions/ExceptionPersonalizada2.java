package exceptions;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada2 {
	public static void main(String[] args) {
		
		int[] numerador = {4, 5, 8, 10};
		int[] denominador = {2, 4, 0, 2, 8};
		
		for(int i = 0; i < denominador.length; i++) {
			
			try {
			if (numerador[i]% 2 != 0) 
					throw new DivisaoNaoExataException("Divisao nao exata. ",
							numerador[i], denominador[i]);
			
				int resultado = numerador[i]/denominador[i];
				System.out.println(resultado);
				
				} catch (DivisaoNaoExataException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null,
							"Nao e possivel dividir por zero.");
				} catch (ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, 
							"Existem mais numeros em uma array do que a outra. ");
				}
			
		}
		System.out.println("Programa continua");
	}

}




