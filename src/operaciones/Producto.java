package operaciones;
/** La clase Producto contiene m�todos para realizar operaciones num�ricas b�sicas 
 * como las funciones:
 * <p>-Producto de dos n�meros reales.
 * <p>-Producto de dos n�meros enteros.
 * <p>-Producto de tres n�meros reales.
 * <p>-Potencia.
 *  
 * @author Jose Maria Tenreiro Eiranova 
 * @since 28/01/2021
 *
 */
public class Producto {
	/**
	 * @param productoReales2 Ser� un valor REAL resultante que nos devolver� la 
	 * funci�n producto_Reales2()
	 */
	double productoReales2;
	
	/**@param productoEnteros Ser� un valor entero resultante que nos devolver� la 
	 * funci�n producto_Enteros()
	 */
	int productoEnteros;
	
	/**@param productoReales3 Ser� un valor real resultante que nos devolver� la 
	 * funci�n producto_Reales3()
	 */
	double productoReales3;
	
	/**@param valorPotencia Ser� un valor real resultante que nos devolver� la 
	 * funcion potencia_Numero()
	 */
	double potenciaNumero;
	
	/**Este ser� el constructor por defecto de la clase Producto <p>
	 * Inicializa un objeto Producto reci�n creado sin el paso de ning�n par�metro.
	 * 
	 */
	public Producto(){
		
	}//Cierre constructor
	
	 /**

     * M�todo que devuelve el resultado del producto de dos n�meros reales <p>
     	 NOTA:<p>Cuando un n�mero es positivo y el otro es negativo, el producto es negativo.
			<p>Cuando ambos n�meros son negativos, el producto es positivo.
			<p>Cuando ambos n�meros son positivos, el producto es positivo.
			<p>Si cualquiera de los dos numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato double(64 bits) se nos informar� de un error.
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param num1Real Primer numero real que ser� el multiplicando 
     * @param num2Real Segundo numero real que ser� el multiplicador
     * @throws Exception -Numero mayor de 64 bits en num1Real,num2Real o productoReales2
     * Introducir letras en vez de n�meros
     * 
     *{@link Exception#getMessage()}

     */
	public double producto_Reales2(double num1Real, double num2Real) throws Exception {
		productoReales2=num1Real*num2Real;
		return productoReales2;
	}//Cierre funci�n producto_Reales2

	/**

     * M�todo que devuelve el resultado del producto de dos n�meros enteros <p>
     	 NOTA:<p>Cuando un n�mero es positivo y el otro es negativo, el producto es negativo.
			<p>Cuando ambos n�meros son negativos, el producto es positivo.
			<p>Cuando ambos n�meros son positivos, el producto es positivo.
			<p>Si cualquiera de los dos numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato int(32 bits) se nos informar� de un error.
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param num1Real Primer numero entero que ser� el multiplicando 
     * @param num2Real Segundo numero entero que ser� el multiplicador
		@throws Exception -Numero mayor de 32 bits en num1Entero,num2Real o productoEnteros
		Introducir letras en vez de n�meros. Introducir numero real en numero entero.
		{@link Exception#getMessage()}
     */
	public int producto_Enteros(int num1Entero, int num2Entero)throws Exception {
		try{
		productoEnteros=num1Entero*num2Entero;
		}catch (Exception e){
			System.out.println("Has introducido un valor erroneo");
		}
		return productoEnteros;
	}//Cierre funcion producto_Enteros
	
	/**

     * M�todo que devuelve el resultado del producto de tres n�meros reales mediante una funcion asociativa <p>
     	 NOTA:<p>Si hay un n�mero impar de n�meros negativos, el producto es negativo. 
     	 	<p>Si hay un n�mero par de n�meros negativos, el producto es positivo
			<p>Si cualquiera de los  numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato double(64 bits) se nos informar� de un error.
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param num1Real Primer numero real que ser� el multiplicando en la primera operaci�n que hace la funci�n
     * @param num2Real Segundo numero real que ser� el multiplicador en la primera operacion que hace la funci�n
     * @param num3Real Tercer numero real  que sera el multiplicador del resultado del producto entre num1Real y num2Real
		
		@throws Exception -Numero mayor de 64 bits en num1Real,num2Real,num3Real o productoReales3
		{@link Exception#getMessage()}
     */

	public double producto_Real3(double num1Real,double num2Real,double num3Real)throws Exception {
		productoReales3=num1Real*num2Real*num3Real;
		return productoReales3;
	}//Cierre funcion producto_Real3
	
	 /**

     * M�todo que devuelve el resultado de calcular la potencia de un numero REAL <p>
     * NOTA:<p>Potencia de un n�mero es el resultado tras la sucesiva multiplicaci�n de un n�mero por s� mismo.
     * <p>Cualquier n�mero con exponente 1 siempre ser� el mismo n�mero.
     * <p>Cualquier n�mero con exponente cero siempre ser� 1.
     * <p>Cualquier n�mero con base 10, el exponente significa el numero de ceros del resultado.
     * @return Valor REAL que nos devuelve la funci�n o m�todo (potencia)
     * @param base Numero real sobre el cual se calculara su potencia.
     * @param exponente N�mero entero que significa el n�mero de veces que se multiplica la base.
     * @throws Exception Numero mayor de 64bits base o potenciaNumero. Numero mayor de 32 bits en exponente.
     * Introducir letras en vez de n�meros. Introducir numero real en numero entero.
     * 
     * {@link Exception#getMessage()}

     */

	public double potencia_Numero(double base, int exponente) {
		potenciaNumero=Math.pow(base, exponente);
		return potenciaNumero;

	}//Cierre funci�n potencia_Numero
	
}//Cierre de la clase Producto