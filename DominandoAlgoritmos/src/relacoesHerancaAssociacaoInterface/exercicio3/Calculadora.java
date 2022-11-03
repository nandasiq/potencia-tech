package relacoesHerancaAssociacaoInterface.exercicio3;

class Calculadora implements OperacaoMatematica{
	
	@Override
	public void soma(int a, int b) {
		System.out.println("Soma: " + a + b);
	}
	@Override
	public void subt(int a, int b) {
		System.out.println("Subtracao: " + (a - b));
	}
	@Override
	public void mult(int a, int b) {
		System.out.println("Multiplicacao: " + (a * b));
	}
	@Override
	public void divi(int a, int b) {
		System.out.println("Divisao: " + (a / b));
	}

}
