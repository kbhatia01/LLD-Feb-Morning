package weather;

public class Main {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        currentDisplay cd = new currentDisplay(w);

        AvgDisplay ad = new AvgDisplay(w);

        w.setMeasurement(10,20);
        w.setMeasurement(12, 20);

        cd.deRegister();
        w.setMeasurement(10,20);


    }
}
