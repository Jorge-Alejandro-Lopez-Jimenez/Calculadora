package Calculadora;

/**
 * La clase Metodos contiene métodos para convertir entre diferentes sistemas de
 * unidades.
 */
public class Sistemas {
    /**
     * Convierte una cadena binaria en un número decimal.
     *
     * @param binario La cadena binaria a convertir.
     * @return El número decimal resultante.
     */
    public static int convertirBinarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            if (binario.charAt(i) == '1') {
                decimal += Math.pow(2, longitud - 1 - i);
            }
        }
        return decimal;
    }

    /**
     * Convierte un número decimal en una cadena binaria.
     *
     * @param decimal El número decimal a convertir.
     * @return La cadena binaria resultante.
     */
    public static String convertirDecimalABinario(int decimal) {
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario.insert(0, residuo);
            decimal /= 2;
        }
        return binario.toString();
    }

    /**
     * Convierte una cadena hexadecimal en un número decimal.
     *
     * @param hexadecimal La cadena hexadecimal a convertir.
     * @return El número decimal resultante.
     */
    public static int convertirHexadecimalADecimal(String hexadecimal) {
        int decimal = 0;
        int longitud = hexadecimal.length();
        for (int i = 0; i < longitud; i++) {
            char c = hexadecimal.charAt(i);
            int valor = "0123456789ABCDEF".indexOf(Character.toUpperCase(c));
            decimal += valor * Math.pow(16, longitud - 1 - i);
        }
        return decimal;
    }

    /**
     * Convierte un número decimal en una cadena hexadecimal.
     *
     * @param decimal El número decimal a convertir.
     * @return La cadena hexadecimal resultante.
     */
    public static String convertirDecimalAHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 16;
            hexadecimal.insert(0, "0123456789ABCDEF".charAt(residuo));
            decimal /= 16;
        }
        return hexadecimal.toString();
    }

    /**
     * Convierte una cadena octal en un número decimal.
     *
     * @param octal La cadena octal a convertir.
     * @return El número decimal resultante.
     */
    public static int convertirOctalADecimal(String octal) {
        int decimal = 0;
        int longitud = octal.length();
        for (int i = 0; i < longitud; i++) {
            int valor = Character.getNumericValue(octal.charAt(i));
            decimal += valor * Math.pow(8, longitud - 1 - i);
        }
        return decimal;
    }

    /**
     * Convierte un número decimal en una cadena octal.
     *
     * @param decimal El número decimal a convertir.
     * @return La cadena octal resultante.
     */
    public static String convertirDecimalAOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 8;
            octal.insert(0, residuo);
            decimal /= 8;
        }
        return octal.toString();
    }
}
