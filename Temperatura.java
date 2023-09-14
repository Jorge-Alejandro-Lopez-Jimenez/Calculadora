package Calculadora;

public class Temperatura {

    /**
     * Cambia de grados fahrenheit a celsius
     * 
     * @param Fahrenheit La cantidad en grados fahrenheit a convertir
     * @return La cantidad resultante
     */
    public static double FahrenheitACelsius(double Fahrenheit) {
        double convertir = (Fahrenheit - 32) * 5.0 / 9.0;
        return convertir;
    }

    /**
     * Cambia de grados celsius a fahrenheit
     * 
     * @param Celsius La cantidad en grados celsius a convertir
     * @return La cantidad resultante
     */
    public static double CelsiusAFahrenheit(double Celsius) {
        double convertir = (Celsius * 9.0 / 5.0) + 32;
        return convertir;
    }

    /**
     * Cambia de grados kelvin a celsius
     * 
     * @param Kelvin La cantidad en grados kelvin a convertir
     * @return La cantidad resultante
     */
    public static double KelvinACelsius(double Kelvin) {
        double convertir = (Kelvin - 273.15);
        return convertir;
    }

    /**
     * Cambia de grados celsius a kelvin
     * 
     * @param Celsius La cantidad en grados celsius a convertir
     * @return La cantidad resultante
     */
    public static double CelsiusAKelvin(double Celsius) {
        double convertir = (Celsius + 273.15);
        return convertir;
    }
}
