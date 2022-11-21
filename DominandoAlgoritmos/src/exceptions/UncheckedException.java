package exceptions;

import javax.swing.JOptionPane;

// faver divisao de dois valores
public class UncheckedException {
	public static void main(String[] args) {
		
		boolean loopCont = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado: " + resultado);
				loopCont = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada invalida. Digite um numero inteiro. "
						+ e.getMessage());
//				e.printStackTrace();
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Nenhum numero e divisivel por 0 ");
			}
			finally {
				System.out.println("Chegou no finally");
			}
		} while (loopCont);
		
	
		
		System.out.println("Chegou ate o fim");
	}

	public static int dividir( int a, int b) {
		return a / b;
	}
}

