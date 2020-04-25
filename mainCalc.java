package calculadora;
import java.util.ArrayList;
import java.util.Scanner;
import calculadora.Calculadora;

public class mainCalc {

	static Calculadora calc=new Calculadora();
	static Scanner sc=new Scanner(System.in);
	static Integer valor=0;
	static Integer num1;
	static Integer num2;
	static ArrayList<String> mensajes=new ArrayList();
	
	public static void main(String[] args) {
		do {
			//Abrimos el menu
			menu();
			//Escogemos opcion del menu
			opcionSelect(0);
			valor=entrada(6);
			if (valor>=1 && valor <=5) {
				switch (valor) {
					case 1:
						{num1=entrada(4);
						num2=entrada(5);
						metodosCalc("suma",num1,num2);
						break;}
					case 2:
						{num1=entrada(4);
						num2=entrada(5);
						metodosCalc("resta",num1,num2);
						break;}
					case 3:
						{num1=entrada(4);
						num2=entrada(5);
						metodosCalc("mult",num1,num2);
						break;}
					case 4:
						{num1=entrada(4);
						num2=entrada(5);
						metodosCalc("div",num1,num2);
						break;}
				}
			} 
			else {
				opcionSelect(1);
			}
		} while (valor!=5);
		opcionSelect(2);
		sc.close();
	}

	public static void menu() {
		System.out.println("----INICIO----");
		System.out.println("1--Sumar");
		System.out.println("2--Restar");
		System.out.println("3--Multiplicar");
		System.out.println("4--Dividir");
	}
	//Recepcion de datos de entrada
	public static int entrada(int opcion) {
		int numero=0;
		boolean prueba=false;
		while(!prueba) {
			opcionSelect(opcion);
			try {
				numero=sc.nextInt();
				prueba=true;
			} catch (Exception e) {
				opcionSelect(3);
				sc.nextLine();
			}
		}
		return numero;
	}
	//Metodo que contiene los mensajes de la aplicación
	public static void opcionSelect(int opcion) {
		mensajes.add("***Seleccione una opcion***");
		mensajes.add("Opción no disponible.");
		mensajes.add("Aplicación finalizada.");
		mensajes.add("Introduzca valor numérico.");
		mensajes.add("Introduzca valor 1...");
		mensajes.add("Introduzca valor 2...");
		mensajes.add("");
		System.out.println(mensajes.get(opcion)); 
	}

	public static void metodosCalc(String operacion, int val1, int val2) {
		int resultado=0;
		switch(operacion) {
		case "suma":{resultado=calc.sumar(val1, val2);break;}
		case "resta":{resultado=calc.restar(val1, val2);break;}
		case "mult":{resultado=calc.multiplicar(val1, val2);break;}
		case "div":{resultado=calc.dividir(val1, val2);break;}
		}
		System.out.println("RESULTADO="+resultado);
	}
	
}