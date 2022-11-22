package exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada1 {

	public static void main(String[] args) {
		String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo: ");

		imprimirConsole(nomeArquivo);
		System.out.println("Apesa da exception (ou nao), o programa continua");

	}

	public static void imprimirConsole(String nomeArquivo) {

		try {
			BufferedReader br = lerArquivo(nomeArquivo);
			String line = br.readLine();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			do {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			} while (line != null);

			bw.flush();
			br.close();
		} catch (NomeErradoExceptions e) {
			JOptionPane.showMessageDialog(null, 
					e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. " + "Avise o suporte " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static BufferedReader lerArquivo(String nomeArquivo) throws NomeErradoExceptions {
		File file = new File(nomeArquivo);
		try {
			return new BufferedReader(new FileReader(nomeArquivo));
		} catch (FileNotFoundException e) {
			throw new NomeErradoExceptions(file.getName(), file.getPath());
		}
	}

}

class NomeErradoExceptions extends Exception {
	private String nomeArquivo;
	private String diretorio;

	public NomeErradoExceptions(String nomeArquivo, String diretorio) {
		super("O aquivo " + nomeArquivo 
				+ " nao foi encontrado no diretorio " + diretorio);
		this.nomeArquivo = nomeArquivo;
		this.diretorio = diretorio;
	}

	@Override
	public String toString() {
		return "Nome do arquivo: " + nomeArquivo + " - Diretorio: " + diretorio;
	}

}
