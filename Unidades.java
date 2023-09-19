package Calculadora;

public class Unidades {

    public float conversor(float entrada, char opcion) {
        switch (opcion) {
            case 'a':
                return metrosAPulgadas(entrada);
            case 1:
                return pulgadasAMetros(entrada);
            case 'b':
                return metrosAYardas(entrada);
            case 2:
                return yardasAMetros(entrada);
            case 'c':
                return metrosAMillas(entrada);
            case 3:
                return millasAMetros(entrada);
            case 'd':
                return metrosACentimetros(entrada);
            case 4:
                return centimetrosAMetros(entrada);
            case 'e':
                return metrosAKilometros(entrada);
            case 5:
                return kilometrosAMetros(entrada);
            default:
                return -1; // Opción no válida
        }
    }

    // Método para convertir de metros a pulgadas
    private float metrosAPulgadas(float valor) {
        float resultado = valor * 39.37f;
        return resultado; // Resultado en pulgadas
    }

    // Método para convertir de pulgadas a metros
    private float pulgadasAMetros(float valor) {
        float resultado = valor / 39.37f;
        return resultado; // Resultado en metros
    }

    // metodo para metros a yardas
    private float metrosAYardas(float valor) {
        float resultado = valor * 1.09361f;
        return resultado;// resultado en yardas
    }

    // metodo para yardas a metros
    private float yardasAMetros(float valor) {
        float resultado = valor / 1.09361f;
        return resultado;// resultado en metros
    }

    // metodo para metros a millas
    private float metrosAMillas(float valor) {
        float resultado = valor * 0.000621371f;
        return resultado;// resultado en millas
    }

    // metodo para millas a metros
    private float millasAMetros(float valor) {
        float resultado = valor / 0.000621371f;
        return resultado;// resultado en metros
    }

    // metodo para metros a centimetros
    private float metrosACentimetros(float valor) {
        float resultado = valor * 100f;
        return resultado;// resultado en cm
    }

    // metodo para centimetros a metros
    private float centimetrosAMetros(float valor) {
        float resultado = valor / 100f;
        return resultado;// resultado en metros
    }

    // metodo para metros a kilometros
    private float metrosAKilometros(float valor) {
        float resultado = valor / 1000f;
        return resultado;// resultado en kilometros
    }

    // metodo para kilometros a metros
    private float kilometrosAMetros(float valor) {
        float resultado = valor * 1000f;
        return resultado;// resultado en metros
    }

}
