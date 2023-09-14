package Calculadora;

public class Temperatura {
    
    public static double FahrenheitACelsius(double Fahrenheit){
        double convertir = (Fahrenheit - 32) * 5.0/9.0;
        return convertir;
    }

    public static double CelsiusAFahrenheit(double Celsius){
        double convertir = (Celsius * 9.0/5.0) + 32;
        return convertir;
    }

    public static double KelvinACelsius(double Kelvin){
        double convertir = (Kelvin - 273.15);
        return convertir;
    }

    public static double CelsiusAKelvin(double Celsius){
        double convertir = (Celsius + 273.15);
        return convertir;
    }
}
