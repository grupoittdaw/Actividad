package operaciones;
/** La clase Producto contiene métodos para realizar operaciones numéricas básicas 
 * como las funciones:
 * <p>-Producto de dos números reales.
 * <p>-Producto de dos números enteros.
 * <p>-Producto de tres números reales.
 * <p>-Potencia.
 *  
 * @author Jose Maria Tenreiro Eiranova 
 * @since 28/01/2021
 *
 */
public class Producto {
	/**
	 * @param productoReales2 Será un valor REAL resultante que nos devolverá la 
	 * función producto_Reales2()
	 */
	double productoReales2;
	
	/**@param productoEnteros Será un valor entero resultante que nos devolverá la 
	 * función producto_Enteros()
	 */
	int productoEnteros;
	
	/**@param productoReales3 Será un valor real resultante que nos devolverá la 
	 * función producto_Reales3()
	 */
	double productoReales3;
	
	/**@param valorPotencia Será un valor real resultante que nos devolverá la 
	 * funcion potencia_Numero()
	 */
	double potenciaNumero;
	
	/**Este será el constructor por defecto de la clase Producto <p>
	 * Inicializa un objeto Producto recién creado sin el paso de ningún parámetro.
	 * 
	 */
	public Producto(){
		
	}//Cierre constructor
	
	 /**

     * Método que devuelve el resultado del producto de dos números reales <p>
     	 NOTA:<p>Cuando un número es positivo y el otro es negativo, el producto es negativo.
			<p>Cuando ambos números son negativos, el producto es positivo.
			<p>Cuando ambos números son positivos, el producto es positivo.
			<p>Si cualquiera de los dos numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato double(64 bits) se nos informará de un error.
     * @return Valor real que nos devuelve la función o método (producto)
     * @param num1Real Primer numero real que será el multiplicando 
     * @param num2Real Segundo numero real que será el multiplicador
     * @throws Exception -Numero mayor de 64 bits en num1Real,num2Real o productoReales2
     * Introducir letras en vez de números
     * 
     *{@link Exception#getMessage()}

     */
	public double producto_Reales2(double num1Real, double num2Real) throws Exception {
		productoReales2=num1Real*num2Real;
		return productoReales2;
	}//Cierre función producto_Reales2

	/**

     * Método que devuelve el resultado del producto de dos números enteros <p>
     	 NOTA:<p>Cuando un número es positivo y el otro es negativo, el producto es negativo.
			<p>Cuando ambos números son negativos, el producto es positivo.
			<p>Cuando ambos números son positivos, el producto es positivo.
			<p>Si cualquiera de los dos numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato int(32 bits) se nos informará de un error.
     * @return Valor real que nos devuelve la función o método (producto)
     * @param num1Real Primer numero entero que será el multiplicando 
     * @param num2Real Segundo numero entero que será el multiplicador
		@throws Exception -Numero mayor de 32 bits en num1Entero,num2Real o productoEnteros
		Introducir letras en vez de números. Introducir numero real en numero entero.
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

     * Método que devuelve el resultado del producto de tres números reales mediante una funcion asociativa <p>
     	 NOTA:<p>Si hay un número impar de números negativos, el producto es negativo. 
     	 	<p>Si hay un número par de números negativos, el producto es positivo
			<p>Si cualquiera de los  numeros es cero, el producto es cero.
			<p>Si el valor del resultado es mayor que el valor maximo del tipo de dato double(64 bits) se nos informará de un error.
     * @return Valor real que nos devuelve la función o método (producto)
     * @param num1Real Primer numero real que será el multiplicando en la primera operación que hace la función
     * @param num2Real Segundo numero real que será el multiplicador en la primera operacion que hace la función
     * @param num3Real Tercer numero real  que sera el multiplicador del resultado del producto entre num1Real y num2Real
		
		@throws Exception -Numero mayor de 64 bits en num1Real,num2Real,num3Real o productoReales3
		{@link Exception#getMessage()}
     */

	public double producto_Real3(double num1Real,double num2Real,double num3Real)throws Exception {
		productoReales3=num1Real*num2Real*num3Real;
		return productoReales3;
	}//Cierre funcion producto_Real3
	
	 /**

     * Método que devuelve el resultado de calcular la potencia de un numero REAL <p>
     * NOTA:<p>Potencia de un número es el resultado tras la sucesiva multiplicación de un número por sí mismo.
     * <p>Cualquier número con exponente 1 siempre será el mismo número.
     * <p>Cualquier número con exponente cero siempre será 1.
     * <p>Cualquier número con base 10, el exponente significa el numero de ceros del resultado.
     * @return Valor REAL que nos devuelve la función o método (potencia)
     * @param base Numero real sobre el cual se calculara su potencia.
     * @param exponente Número entero que significa el número de veces que se multiplica la base.
     * @throws Exception Numero mayor de 64bits base o potenciaNumero. Numero mayor de 32 bits en exponente.
     * Introducir letras en vez de números. Introducir numero real en numero entero.
     * 
     * {@link Exception#getMessage()}

     */

	public double potencia_Numero(double base, int exponente) {
		potenciaNumero=Math.pow(base, exponente);
		return potenciaNumero;

	}//Cierre función potencia_Numero
	
}//Cierre de la clase Producto