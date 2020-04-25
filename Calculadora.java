package calculadora;

public class Calculadora {

	int num1;
	int num2;
	int resultado=0;
	
	public Calculadora() {}
	
	public Calculadora(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int sumar(int num1, int num2) {
		resultado=num1+num2;
		return resultado;
	}
	
	public int restar(int num1, int num2) {
		resultado=num1-num2;
		return resultado;
	}
	
	public int multiplicar(int num1, int num2) {
		resultado=num1*num2;
		return resultado;
	}
	
	public int dividir(int num1, int num2) {
		resultado=num1/num2;
		return resultado;
	}

}