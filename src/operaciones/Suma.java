package operaciones;
/** La clase Suma contiene metodos para realizar operaciones numericas basicas 
 * como los metodos:
 * <p>-Suma de dos numeros reales
 * <p>-Suma de dos numeros enteros 
 * <p>-Suma de tres numeros reales 
 * <p>-Suma de numero acumulado.
 *  
 * @author Jorge Jaen Ferrer 
 * @since 28/01/2021
 *
 */
public class Suma {
	/**
	 * @param sumaR es un numero real que nos devuelve el metodo suma_Real
	 */
	double sumaR;
	
	/**@param sumaE es un numero entero que nos devuelve el metodo suma_Dos_Entero 
	 */
	int sumaE;
	
	/**@param sumaR2 es un numero real que nos devuelve el metodo suma_Tres_Real
	 */
	double sumaR2;
	
	/**@param acumulado es un numero real que guarda el valor acumulado en el metodo acumular
	 */
	double acumulado;
	
	/**Constructor por defecto
	 */
	public Suma(){}
	
	 /**
     * Metodo que devuelve el resultado de la suma de dos numeros reales <p>
     	 NOTA:<p>Se ejecuta la suma de num1 + num2
     * @return Número real
     * @param num1 numero real
     * @param num2 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public double suma_Real(double num1, double num2) throws Exception {

		return sumaR;
	}

	 /**
     * Metodo que devuelve el resultado de la suma de dos numeros enteros <p>
     	 NOTA:<p>Se ejecuta la suma de num1 + num2
     * @return Numero entero
     * @param num1 numero entero
     * @param num2 numero entero
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public int suma_Dos_Entero(int num1, int num2) throws Exception {

		return sumaE;
	}
	
	/**
     * Metodo que devuelve el resultado de la suma de tres numeros reales <p>
     	 NOTA:<p>Se ejecuta la suma de num1 + num2 + num3
     * @return Numero real
     * @param num1 numero real
     * @param num2 numero real
     * @param num3 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public double resta_Tres_Real(double num1, double num2, double num3) throws Exception {

		return sumaR2;
	}
	
	/**
     * Metodo que guarda la suma del valor acumulado <p>
     	 NOTA:<p>Si acumulado == 0 entonces acumulado = num1
	 *        <p>Si acumulado != 0 entonces num1 += acumulado	 
     * @param num1 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public void acumular(double num1) throws Exception {
		
	}

}
	
	






