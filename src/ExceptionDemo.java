public class ExceptionDemo {

    private static void temperatureReport( TemperatureObject batch ){
        try{
        // method test temperature object
        batch.test();
        // print perfect temperature
        System.out.println( "Perfect Temperature" );
        // jika masuk catch maka masuk ke exception bad temperature
        }catch ( BadTemperature bt ){
            System.out.println( bt.getMessage( ) );
        }
    }
    
    public static void main( String[] args ){
    temperatureReport( new TemperatureObject( 100 ) );
    temperatureReport( new TemperatureObject( 50 ) );
    temperatureReport( new TemperatureObject( 75 ) );
    }
    
}
