package relacoesHerancaAssociacaoInterface.exercicio1;

public class Teste {
	public static void main(String[] args) {
		Funcionario fFaxineiro = new Faxineiro();
		Funcionario fVendendor = new Vendedor();
		Funcionario fGerente = new Gerente();
		
		Gerente funcionarioG = (Gerente)new Funcionario();
		Vendedor funcionarioV = (Vendedor)new Funcionario();
		Faxineiro funcionarioF = (Faxineiro)new Funcionario();
	}

}
