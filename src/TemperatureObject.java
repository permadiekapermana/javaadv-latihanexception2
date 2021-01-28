public class TemperatureObject {

    // var temperature
    int temperature;
    TemperatureObject(int temp){
        temperature = temp;
    }

    // method
    void test() throws TooHot, TooCold{
		if(temperature < 70) throw new TooCold("Very Cold");
		if(temperature > 80) throw new TooHot("Very Hot");		
    }
    
}
