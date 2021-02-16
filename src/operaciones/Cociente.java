package operaciones;
/** La clase Cociente contiene m�todos para realizar operaciones num�ricas b�sicas 
 * como las funciones:
 * <p>-Divisi�n de dos n�meros reales
 * <p>-Divisi�n de dos n�meros enteros 
 * <p>-El inverso de un n�mero entero 
 * <p>-La ra�z de un n�mero real.
 *  
 * @author Jose Maria Tenreiro Eiranova
 * @since 19/01/2021
 *
 */
public class Cociente {
	/**
	 * @param divisionReales Ser� un valor REAL resultante que nos devolver� la 
	 * funci�n division_Reales()
	 */
	double divisionReales;
	
	/**@param divisionEnteros Ser� un valor entero resultante que nos devolver� la 
	 * funci�n division_Enteros()
	 */
	double divisionEnteros;
	
	/**@param inverso Ser� un valor real resultante que nos devolver� la 
	 * funci�n inverso_Numero()
	 */
	double inverso;
	
	/**@param raizNumero Ser� un valor real resultante que nos devolver� la 
	 * funcion raiz_Numero()
	 */
	double raizNumero;
	
	/**Este ser� el constructor por defecto de la clase Cociente <p>
	 * Inicializa un objeto Cociente reci�n creado sin el paso de ning�n par�metro.
	 * 
	 */
	public Cociente(){
		
	}//Cierre constructor
	
	 /**

     * M�todo que devuelve el resultado de la divisi�n de dos n�meros reales <p>
     	 NOTA:<p>Cuando un n�mero es positivo y el otro es negativo, el cociente es negativo.
			<p>Cuando ambos n�meros son negativos, el cociente es positivo.
			<p>Cuando ambos n�meros son positivos, el cociente es positivo.
			<p>Si el dividendo(num1Real) es cero, el cociente es cero.
			<p>Si el divisor (num2Real) es cero, el resultado es infinito.
     * @return Valor real que nos devuelve la funci�n o m�todo (cociente)
     * @param num1Real Primer numero real que ser� el dividendo 
     * @param num2Real Segundo numero real que ser� el divisor
		@throws Exception -Numero mayor de 64 bits en num1Real,num2Real. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     */
	public double division_Reales(double num1Real, double num2Real)throws Exception {
		divisionReales=num1Real/num2Real;
		return divisionReales;
	}//Cierre funci�n division_Reales

	 /**

     * M�todo que devuelve el resultado de la divisi�n de dos n�meros enteros<p>
     NOTA:<p>Cuando un n�mero es positivo y el otro es negativo, el cociente es negativo.
			<p>Cuando ambos n�meros son negativos, el cociente es positivo.
			<p>Cuando ambos n�meros son positivos, el cociente es positivo.
			<p>Si el dividendo(num1Real) es cero, el cociente es cero.
			<p>Si el divisor (num2Real) es cero, el resultado da infinito.
			<p>Si el cociente no es un n�mero exacto, la funci�n redondea 
			al siguiente o anterior n�mero.
     * @return Valor entero que nos devuelve la funci�n o m�todo (cociente)
     * @param num1Entero Primer n�mero entero que ser� el dividendo 
     * @param num2Entero Segundo n�mero entero que ser� el divisor
		@throws Exception -Numero mayor de 32 bits en num1Entero,num2Entero.
		Introducir un n�mero real en vez de entero.  Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     */
	public double division_Enteros(int num1Entero, int num2Entero)throws Exception {
		divisionEnteros=(num1Entero/num2Entero);
		return divisionEnteros;
	}//Cierre funcion division_Enteros
	
	 /**

     * M�todo que devuelve el resultado de calcular el inverso de un n�mero  
     * <p>NOTA:
     * Un n�mero es inverso de otro si al multiplicarlos obtenemos como resultado la unidad. 
     * El elemento inverso, es igual a 1 partido por el n�mero.
     	<p>Si el n�mero introducido es negativo, el inverso es negativo. 
     * @return Valor que nos devuelve la funci�n o m�todo (cociente)
     * @param numero real que ser� el denominador en la operaci�n
     * y sobre el cual se calcular� su n�mero inverso
     * @throws Exception -Numero mayor de 64 bits en numero. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}
     * 

     */

	public double inverso_Numero(double numero)throws Exception {
		inverso=1/numero;
		return inverso;
	}//Cierre funcion inverso_Numero
	
	 /**

     * M�todo que devuelve el resultado de calcular la ra�z cuadrada de un 
     * n�mero REAL <p>
     * NOTA:<p>La ra�z cuadrada de un n�mero es aquel valor que al ser multiplicado 
     * por s� mismo da como resultado el valor del n�mero introducido
     * <p>Si el n�mero introducido es negativo, el resultado ser� un mensaje "Entrada no v�lida".
     * 
     * @return Valor REAL que nos devuelve la funci�n o m�todo (cociente)
     * @param numero N�mero REAL sobre el cual se calcular� la ra�z cuadrada.
     * @throws Exception -Numero mayor de 64 bits en numero. Introducir letras en vez de numeros.
		{@link Exception#getMessage()}

     */

	public double raiz_Numero(double numero)throws Exception {
		raizNumero=Math.sqrt(numero);
		return raizNumero;

	}//Cierre funci�n raiz_Numero
	
}//Cierre de la clase Cociente
