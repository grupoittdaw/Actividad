package operaciones;
/** La clase Cociente contiene métodos para realizar operaciones numéricas básicas 
 * como las funciones:
 * <p>-División de dos números reales
 * <p>-División de dos números enteros 
 * <p>-El inverso de un número entero 
 * <p>-La raíz de un número real.
 *  
 * @author Jose Maria Tenreiro Eiranova
 * @since 19/01/2021
 *
 */
public class Cociente {
	/**
	 * @param divisionReales Será un valor REAL resultante que nos devolverá la 
	 * función division_Reales()
	 */
	double divisionReales;
	
	/**@param divisionEnteros Será un valor entero resultante que nos devolverá la 
	 * función division_Enteros()
	 */
	double divisionEnteros;
	
	/**@param inverso Será un valor real resultante que nos devolverá la 
	 * función inverso_Numero()
	 */
	double inverso;
	
	/**@param raizNumero Será un valor real resultante que nos devolverá la 
	 * funcion raiz_Numero()
	 */
	double raizNumero;
	
	/**Este será el constructor por defecto de la clase Cociente <p>
	 * Inicializa un objeto Cociente recién creado sin el paso de ningún parámetro.
	 * 
	 */
	public Cociente(){
		
	}//Cierre constructor
	
	 /**

     * Método que devuelve el resultado de la división de dos números reales <p>
     	 NOTA:<p>Cuando un número es positivo y el otro es negativo, el cociente es negativo.
			<p>Cuando ambos números son negativos, el cociente es positivo.
			<p>Cuando ambos números son positivos, el cociente es positivo.
			<p>Si el dividendo(num1Real) es cero, el cociente es cero.
			<p>Si el divisor (num2Real) es cero, el resultado es infinito.
     * @return Valor real que nos devuelve la función o método (cociente)
     * @param num1Real Primer numero real que será el dividendo 
     * @param num2Real Segundo numero real que será el divisor
		@throws Exception -Numero mayor de 64 bits en num1Real,num2Real. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     */
	public double division_Reales(double num1Real, double num2Real)throws Exception {
		divisionReales=num1Real/num2Real;
		return divisionReales;
	}//Cierre función division_Reales

	 /**

     * Método que devuelve el resultado de la división de dos números enteros<p>
     NOTA:<p>Cuando un número es positivo y el otro es negativo, el cociente es negativo.
			<p>Cuando ambos números son negativos, el cociente es positivo.
			<p>Cuando ambos números son positivos, el cociente es positivo.
			<p>Si el dividendo(num1Real) es cero, el cociente es cero.
			<p>Si el divisor (num2Real) es cero, el resultado da infinito.
			<p>Si el cociente no es un número exacto, la función redondea 
			al siguiente o anterior número.
     * @return Valor entero que nos devuelve la función o método (cociente)
     * @param num1Entero Primer número entero que será el dividendo 
     * @param num2Entero Segundo número entero que será el divisor
		@throws Exception -Numero mayor de 32 bits en num1Entero,num2Entero.
		Introducir un número real en vez de entero.  Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     */
	public double division_Enteros(int num1Entero, int num2Entero)throws Exception {
		divisionEnteros=(num1Entero/num2Entero);
		return divisionEnteros;
	}//Cierre funcion division_Enteros
	
	 /**

     * Método que devuelve el resultado de calcular el inverso de un número  
     * <p>NOTA:
     * Un número es inverso de otro si al multiplicarlos obtenemos como resultado la unidad. 
     * El elemento inverso, es igual a 1 partido por el número.
     	<p>Si el número introducido es negativo, el inverso es negativo. 
     * @return Valor que nos devuelve la función o método (cociente)
     * @param numero real que será el denominador en la operación
     * y sobre el cual se calculará su número inverso
     * @throws Exception -Numero mayor de 64 bits en numero. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     * 

     */

	public double inverso_Numero(double numero)throws Exception {
		inverso=1/numero;
		return inverso;
	}//Cierre funcion inverso_Numero
	
	 /**

     * Método que devuelve el resultado de calcular la raíz cuadrada de un 
     * número REAL <p>
     * NOTA:<p>La raíz cuadrada de un número es aquel valor que al ser multiplicado 
     * por sí mismo da como resultado el valor del número introducido
     * <p>Si el número introducido es negativo, el resultado será un mensaje "Entrada no válida".
     * 
     * @return Valor REAL que nos devuelve la función o método (cociente)
     * @param numero Número REAL sobre el cual se calculará la raíz cuadrada.
     * @throws Exception -Numero mayor de 64 bits en numero. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}

     */

	public double raiz_Numero(double numero)throws Exception {
		raizNumero=Math.sqrt(numero);
		return raizNumero;

	}//Cierre función raiz_Numero
	
}//Cierre de la clase Cociente
