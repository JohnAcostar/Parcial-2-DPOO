package dpoo.mundo;

public class Parcial {

    public int potencia(int b, int e) throws Exception {

        if (e < 0) {
            throw new Exception("El exponente no puede ser negativo, ya que resultara en un numero fraccionario.");
        }
        
        /**
         * El exponente no puede ser negativo, debido a que el resultado sera un numero fraccionario, es decir no entero
         * por ejemplo se tiene que 2^-1 seria 1/2.
         */
        
        if (b == 0 && e == 0) {
        	return 1;
        }
        
        
        /**
         * Segun el siguiente paper, aunque depende la definicion que se tome, si se sigue las reglas definidas de la potencias, como se menciona en el siguiente paper 
         * I. Barukčić, “Zero divided by zero equals one,” Journal of Applied Mathematics and Physics, 
         * vol. 06, no. 04, pp. 836–853, Jan. 2018, doi: 10.4236/jamp.2018.64072.
         *  se tiene que 0^0 es 1
         */
        
        if (e == 0) {
            return 1;
            /**
             * Cualquier numero elevado a la 0 retornara 1, siguiendo la definicion.
             */
        }
        
        if (b == 0) {
            return 0;
        }
        /**
         * Cualquier resultado de elevar 0 a cualquier otro numero, diferente a 0, resultara en 0, siguiendo la definicion.
         */
    

        long result = 1;
        
        /**
         * Se usa Long porque el método que se propone debe detectar cuándo el resultado es mayor que el valor máximo de un entero.
         */
        
        for (int i = 0; i < e; i++) {
            result *= b;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                throw new Exception("El resultado esta afuera de los rangos propuestos de un entero");
            }
        }

        return (int) result;
    }
}