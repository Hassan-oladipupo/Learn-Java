public class Computer extends Device{
    private int ram;
    private int storage;

//class constructor
    public Computer(
            String brand,
            String model,
            int ram,
            int storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;
    }

    // overriding the method in the super class device
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ram: " + ram);
        System.out.println("storage: " + storage);
    }
}
