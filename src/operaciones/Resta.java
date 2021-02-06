package operaciones;

/** La clase Resta contiene metodos para realizar operaciones numericas basicas 
 * como los metodos:
 * <p>-Resta de dos numeros reales
 * <p>-Resta de dos numeros enteros 
 * <p>-Resta de tres numeros reales 
 * <p>-Resta de numero acumulado.
 *  
 * @author Jorge Jaen Ferrer
 * @since 21/01/2021
 *
 */
public class Resta {
	/**
	 * @param restaR es un numero real que nos devuelve el metodo resta_Real
	 */
	double restaR;
	
	/**@param restaE es un numero entero que nos devuelve el metodo resta_Dos_Entero 
	 */
	int restaE;
	
	/**@param restaR2 es un numero real que nos devuelve el metodo resta_Tres_Real
	 */
	double restaR2;
	
	/**@param acumulado es un numero real que guarda el valor acumulado en el metodo acumular
	 */
	double acumulado;
	
	/**Constructor por defecto
	 */
	public Resta(){}
	
	 /**
     * Metodo que devuelve el resultado de la resta de dos numeros reales <p>
     	 NOTA:<p>Se ejecuta la resta de num1 - num2
     * @return Número real
     * @param num1 numero real
     * @param num2 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public double resta_Real(double num1, double num2) throws Exception {

		return restaR;
	}

	 /**
     * Metodo que devuelve el resultado de la resta de dos numeros enteros <p>
     	 NOTA:<p>Se ejecuta la resta de num1 - num2
     * @return Numero entero
     * @param num1 numero entero
     * @param num2 numero entero
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public int resta_Dos_Entero(int num1, int num2) throws Exception {

		return restaE;
	}
	
	/**
     * Metodo que devuelve el resultado de la resta de tres numeros reales <p>
     	 NOTA:<p>Se ejecuta la resta de num1 - num2
     * @return Numero real
     * @param num1 numero real
     * @param num2 numero real
     * @param num3 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public double resta_Tres_Real(double num1, double num2, double num3) throws Exception {

		return restaR2;
	}
	
	/**
     * Metodo que guarda la resta del valor acumulado <p>
     	 NOTA:<p>Si acumulado == 0 entonces acumulado = num1
	 *        <p>Si acumulado != 0 entonces num1 -= acumulado	 
     * @param num1 numero real
     * @throws Exception
	 *         Numero negativo. {@link Exception#getLocalizedMessage()}
     */
	public void acumular(double num1) throws Exception {
		
	}

}
	
	