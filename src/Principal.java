import java.util.InputMismatchException;
import java.util.Scanner;

import operaciones.Cociente;
import operaciones.Producto;
import operaciones.Resta;
import operaciones.Suma;

public class Principal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// Aqui se instancian los objetos Suma,Resta,Producto y Cociente
		Suma s1 = new Suma();
		Resta r1 = new Resta();
		Producto p1 = new Producto();
		Cociente c1 = new Cociente();

		boolean salir = false;
		/*
		 * El bucle while es para repetir el menu de la calculadora mientras no
		 * se escoja la opci�n salir.
		 */
		while (!salir) {
			int subopcion;
			/*
			 * Con este primer switch case decidimos a que operacion vamos a
			 * realizar, Suma,Resta,Producto o Cociente
			 */
			switch (menu()) {

			case 1: // Se ha seleccionado en el menu calculadora la operacion
				// SUMA
				
				
				
				
			case 2:// Se ha seleccionado en el menu calculadora la operacion
					// RESTA
				boolean salir2 = false;
				while (!salir2) {
					// Presentamos el submenu para escoger opciones del producto
					System.out.println("Operaci�n Resta a realizar:");
					System.out.println("1.Resta de dos n�meros reales");
					System.out.println("2.Resta de dos n�meros enteros");
					System.out.println("3.Resta de tres n�meros reales");
					System.out.println("4.Resta del valor acumulado");
					System.out.println("5.Volver a calculadora");
					// Recogemos la opcion que escogemos mediante la variable
					// subopcion
					subopcion = sc.nextInt();
					/*
					 * Con esa variable y con otro switch case seleccionamos la
					 * operaci�n a realizar.
					 */
					switch (subopcion) {
					case 1:// Se ha seleccionado en el submenu Resta la
							// operacion resta de 2 Reales
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero real");
							double numero1 = sc.nextDouble();
							System.out.println("Dame el segundo n�mero real");
							double numero2 = sc.nextDouble();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ r1.resta_Real(numero1, numero2));
						} catch (Exception e) {
							salir2 = true;
							salir=true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
									.println("ERROR\n"
											+ "FIN DEL PROGRAMA");
							//System.exit(0);
						}
						break;
					case 2:// Se ha seleccionado en el submenu Resta la
							// operacion resta de 2 Enteros
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero entero");
							int numero11 = sc.nextInt();
							System.out.println("Dame el segundo n�mero entero");
							int numero21 = sc.nextInt();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ r1.resta_Dos_Entero(numero11, numero21));
						} catch (Exception e) {
							salir = true;
							salir2 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("ERROR\n"
									+ "FIN DEL PROGRAMA");

						}
						break;
					case 3:// Se ha seleccionado en el submenu Resta la
							// operacion resta de 3 Reales
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero real");
							double numero111 = sc.nextDouble();
							System.out.println("Dame el segundo n�mero real");
							double numero211 = sc.nextDouble();
							System.out.println("Dame el tercer n�mero real");
							double numero3 = sc.nextDouble();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ r1.resta_Tres_Real(numero111, numero211,
											numero3));
						} catch (Exception e) {
							salir = true;
							salir2 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("ERROR\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 4:// Se ha seleccionado en el submenu Resta la
							// operacion resta del valor acumulado
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out
									.println("Dame el numero real");
							double numReal = sc.nextDouble();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							r1.acumular(numReal);
							System.out.println("RESULTADO = "
									+ Math.abs(r1.getAcumulado()));
						} catch (Exception e) {
							salir = true;
							salir2 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("ERROR\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 5:// Se ha seleccionado en el submenu Resta la
							// operacion Salir y volver a calculadora
						System.out.println("Pulsado volver a calculadora");
						salir2 = true;
						break;
						
					default://Se ha introducido un valor erroneo en el submenu
						System.out
								.println("Opcion incorrecta.Introduce una opci�n correcta");
						
					}//Cierre switch submenu Producto
				}//Cierre while submenu Producto
				break;
			
			
			
			case 3:// Se ha seleccionado en el menu calculadora la operacion
					// PRODUCTO

				/*
				 * Con el siguiente bucle while, no salimos de el, hasta que se
				 * escoja una opcion valida del submenu PRODUCTO o la opcion
				 * salir.
				 */
				boolean salir3 = false;
				while (!salir3) {
					// Presentamos el submenu para escoger opciones del producto
					System.out.println("Operaci�n PRODUCTO a realizar:");
					System.out.println("1.Producto de dos n�meros reales");
					System.out.println("2.Producto de dos n�meros enteros");
					System.out.println("3.Producto de tres n�meros reales");
					System.out.println("4.Potencia de un n�mero");
					System.out.println("5.Volver a calculadora");
					// Recogemos la opcion que escogemos mediante la variable
					// subopcion
					subopcion = sc.nextInt();
					/*
					 * Con esa variable y con otro switch case seleccionamos la
					 * operaci�n a realizar.
					 */
					switch (subopcion) {
					case 1:// Se ha seleccionado en el submenu PRODUCTO la
							// operacion producto de 2 Reales
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero real");
							double numero1 = sc.nextDouble();
							System.out.println("Dame el segundo n�mero real");
							double numero2 = sc.nextDouble();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ p1.producto_Reales2(numero1, numero2));
						} catch (Exception e) {
							salir3 = true;
							salir=true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
									.println("Has metido un numero equivocado\n"
											+ "FIN DEL PROGRAMA");
							//System.exit(0);
						}
						break;
					case 2:// Se ha seleccionado en el submenu PRODUCTO la
							// operacion producto de 2 Enteros
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero entero");
							int numero11 = sc.nextInt();
							System.out.println("Dame el segundo n�mero entero");
							int numero21 = sc.nextInt();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ p1.producto_Enteros(numero11, numero21));
						} catch (Exception e) {
							salir = true;
							salir3 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");

						}
						break;
					case 3:// Se ha seleccionado en el submenu PRODUCTO la
							// operacion producto de 3 Reales
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero real");
							double numero111 = sc.nextDouble();
							System.out.println("Dame el segundo n�mero real");
							double numero211 = sc.nextDouble();
							System.out.println("Dame el tercer n�mero real");
							double numero3 = sc.nextDouble();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ p1.producto_Real3(numero111, numero211,
											numero3));
						} catch (Exception e) {
							salir = true;
							salir3 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 4:// Se ha seleccionado en el submenu PRODUCTO la
							// operacion potencia de un Real
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out
									.println("Dame el numero para calcular su potencia");
							double base = sc.nextDouble();
							System.out.println("Dame el exponente");
							int exponente = sc.nextInt();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ p1.potencia_Numero(base, exponente));
						} catch (Exception e) {
							salir = true;
							salir3 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 5:// Se ha seleccionado en el submenu PRODUCTO la
							// operacion Salir y volver a calculadora
						System.out.println("Pulsado volver a calculadora");
						salir3 = true;
						break;
						
					default://Se ha introducido un valor erroneo en el submenu
						System.out
								.println("Opcion incorrecta.Introduce una opci�n correcta");
						
					}//Cierre switch submenu Producto
				}//Cierre while submenu Producto
				break;
				
			case 4:// Se ha seleccionado en el menu calculadora la operacion
					// COCIENTE

				/*
				 * Con el siguiente bucle while, no salimos de el, hasta que se
				 * escoja una opcion valida del submenu COCIENTE o la opcion
				 * salir
				 */
				boolean salir4 = false;
				while (!salir4) {
					// Presentamos el submenu para escoger opciones del COCIENTE
					System.out.println("Operaci�n COCIENTE a realizar:");
					System.out.println("1.Cociente de dos n�meros reales");
					System.out.println("2.Cociente de dos n�meros enteros");
					System.out.println("3.Calculo del inverso de un n�mero");
					System.out.println("4.Ra�z Cuadrada de un n�mero");
					System.out.println("5.Volver a calculadora");
					
					// Recogemos la opcion que escogemos mediante la variable
					// subopcion
					subopcion = sc.nextInt();
					/*
					 * Con esa variable y con otro switch case seleccionamos la
					 * operaci�n a realizar.
					 */
					switch (subopcion) {
					case 1:// Se ha seleccionado en el submenu COCIENTE la
						// operacion cociente de dos numeros Reales
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero real");
							double numero1 = sc.nextDouble();
							System.out.println("Dame el segundo n�mero real");
							double numero2 = sc.nextDouble();
								if (numero2==0){//Si el divisor es cero el resultado es infinito
									System.out.println("RESULTADO: Infinito");
									break;
								}
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */

							System.out.println("RESULTADO = "
									+ c1.division_Reales(numero1, numero2));
						} catch (Exception e) {
							salir = true;
							salir4 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 2:// Se ha seleccionado en el submenu COCIENTE la
						// operacion cociente de dos numeros Enteros
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out.println("Dame el primer n�mero entero");
							int numero11 = sc.nextInt();
							System.out.println("Dame el segundo n�mero entero");
							int numero21 = sc.nextInt();
								if (numero21==0){//Si el divisor es cero el resultado es infinito
								System.out.println("RESULTADO: Infinito");
								break;
							}
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ c1.division_Enteros(numero11, numero21));
						} catch (InputMismatchException e) {
							salir = true;
							salir4 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 3:// Se ha seleccionado en el submenu COCIENTE la
						// operacion calculo del inverso de un numero Entero
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out
									.println("Dame el n�mero para calcular su inverso");
							int numero111 = sc.nextInt();
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ c1.inverso_Numero(numero111));
						} catch (Exception e) {
							salir = true;
							salir4 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 4:// Se ha seleccionado en el submenu COCIENTE la
						// operacion calculo de la raiz cuadrada de un numero Real
						try {// El bloque try-catch nos captura si introducimos
								// cadena en vez de n�mero
							System.out
									.println("Dame el numero para calcular su ra�z cuadrada");
							double numero = sc.nextDouble();
								if (numero<0){
									System.out.println("La ra�z cuadrada de un n�mero negativo no tiene soluci�n real ");
									break;
								}
							/*
							 * Despues de introducir los valores correctos,
							 * calculamos el resultado mediante el metodo
							 * adecuado.
							 */
							System.out.println("RESULTADO = "
									+ c1.raiz_Numero(numero));
						} catch (Exception e) {
							salir = true;
							salir4 = true;/*
										 * Aqui es donde capturamos la excepcion
										 * de introducir cadena y salir del
										 * bucle
										 */
							System.out
							.println("Has metido un numero equivocado\n"
									+ "FIN DEL PROGRAMA");
						}
						break;
					case 5:// Se ha seleccionado en el submenu COCIENTE la
							// operacion Salir y volver a calculadora
						System.out.println("Pulsado volver a calculadora");
						salir4 = true;
						break;
					default://Se ha seleccionado una opcion erronea. 
						System.out
								.println("Opcion incorrecta.Introduce una opci�n correcta");
						

					}//Cierre switch submenu Cociente
				}//Cierre while submenu Cociente
				break;
				// La opcion 5 del menu principal de la calculadora finaliza el
				// programa
			case 5:
				System.out.println("FIN DEL PROGRAMA");
				salir = true;
				break;
			default:
				/*
				 * Cualquier otra opci�n num�rica introducida en el menu de la
				 * calculadora nos  informa de que la opci�n es
				 * incorrecta y nos vuelve a mostrar el menu calculadora
				 */
				System.out.println("Opcion Incorrecta");
				break;

			}//Cierre switch menu calculadora

		}//cierre bucle while menu

	}//Cierre metodo main

	/**
	 * Este metodo nos devuelve el men� de la calculadora y un entero que ser�
	 * la opci�n que hemos escogido de ese men�.
	 * 
	 * @return La opci�n que hemos escogido en el men�. Si introducimos una
	 *         cadena en vez de un numero, la opcion que devuelve es un 5 para
	 *         salir de la calculadora
	 */
	public static int menu() {
		int opcion = 0;
		try {

			System.out
					.println("-----------------------------------\n########### CALCULADORA ###########\n-----------------------------------");
			System.out.println("       1. Suma");
			System.out.println("       2. Resta");
			System.out.println("       3. Producto");
			System.out.println("       4. Cociente");
			System.out.println("       5. Salir");
			System.out.println("Introduce una opci�n de c�lculo: ");
			opcion = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out
					.println("Has introducido una cadena en vez de una opcion.");
			opcion = 5;
		}
		return opcion;

	}//Cierre funcion menu
}//Cierre clase principal
