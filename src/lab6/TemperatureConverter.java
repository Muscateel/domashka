package lab6;


interface Convertable {
    double convert(double inputTemperature);
}


class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}


class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature * 9/5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0;


        Convertable celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        Convertable celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();


        double kelvinTemperature = celsiusToKelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);


        System.out.println(celsiusTemperature + " градусов Цельсия = " + kelvinTemperature + " Кельвин");
        System.out.println(celsiusTemperature + " градусов Цельсия = " + fahrenheitTemperature + " Фаренгейт");
    }
}
