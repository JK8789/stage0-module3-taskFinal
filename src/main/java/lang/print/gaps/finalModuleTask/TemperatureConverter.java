package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheit = temperatureCelsius * 1.8 + 32;
        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(9);
    }
}
