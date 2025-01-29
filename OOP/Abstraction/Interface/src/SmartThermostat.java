public class SmartThermostat implements  ControllableDevice{

    private  boolean isOn = false;
    private double temperature = 25.0;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat is  turned ON");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat is not turned OFF");
    }

    @Override
    public void status() {
        String status = isOn? "ON": "Off";
        System.out.println("smart thermostat status is " + status
        + ", Temperature is " + temperature
        );
    }
    public  void setTemperature(double tempt){
        this.temperature = tempt;
        System.out.println("Temperature is set to " + tempt);

    }
}
