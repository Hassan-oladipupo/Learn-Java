public interface ControllableDevice {

    void turnOn();
    void turnOff();

    default void status(){
        System.out.println("Status: Unknown");
    }
}
