public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.turnOff();
        light.status();;

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.turnOn();
        thermostat.status();
        thermostat.setTemperature(23);


    }
}