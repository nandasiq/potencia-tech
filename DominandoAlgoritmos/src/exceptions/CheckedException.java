package exceptions;

import java.io.*;


public class CheckedException {

	public static void main(String[] args) throws IOException{
		String nomeArquivo = "teste.txt";
		imprimirConsole(nomeArquivo);
		
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
