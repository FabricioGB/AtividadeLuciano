package atividadegitmerging;

public class Util {

    private Util() {

    }

    public static double CalculaImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static int converterfahrenheit(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
