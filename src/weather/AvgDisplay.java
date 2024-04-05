package weather;

public class AvgDisplay implements Observer{
    private float temp;
    private float humidity;

    private Provider provider;
    AvgDisplay(Provider p){
        this.provider = p;

        provider.register(this);
    }


    @Override
    public void update(float temp, float humidity) {

        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("AVG Temp is: " + temp + "current humidity is "
                + humidity);
    }

    public void deRegister(){
        this.provider.remove(this);
    }


}
