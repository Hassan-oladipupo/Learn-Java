public class SmartLight implements  ControllableDevice{
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart light is turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart light is turned OFF");
    }

    @Override
    public void status() {
        String status = isOn? "ON": "OFF";
        System.out.println("smart light status is " + status);
    }
}
