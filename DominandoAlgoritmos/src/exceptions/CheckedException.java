package exceptions;

import java.io.*;

import javax.swing.JOptionPane;


public class CheckedException {

	public static void main(String[] args) {
		String nomeArquivo = "teste.txt";
		try {
			imprimirConsole(nomeArquivo);
			// exception file not found e generica da mae
			// exceptionIO. Entao se ela vier primeiro ok. Mas se ExceptionIO 
			// viesse primeiro, sempore cairia nela
		} catch (FileNotFoundException e){  
			JOptionPane.showMessageDialog(null, "Revise o nome "
					+ "do arquivo. " + e.getCause());
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. "
					+ "Avise o suporte " + e.getCause());
			e.printStackTrace();
		} finally { 
			// finally sempre sera impresso, independente do exception, mas seu uso e opcional
			System.out.println("Chegou no finally");
		}
		
		System.out.println("Apesa da exception (ou nao), o programa continua");
	
	}
		public static void imprimirConsole (String nomeArquivo) throws IOException {
			File file = new File(nomeArquivo);
			
			BufferedReader br = new BufferedReader(new FileReader(file.getName()));
			String line = br.readLine();
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			do {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			} while (line != null);
			
			bw.flush();
			br.close();
			
		
		
	}
}
