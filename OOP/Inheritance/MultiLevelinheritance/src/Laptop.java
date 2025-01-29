public class Laptop extends  Computer{

    private double weight;
    private double screenSize;

    //class constructor
    public Laptop(
            String brand,
            String model,
            int ram,
            int storage,
            double weight,
            double screenSize
    ) {
        super(brand, model, ram, storage);
        this.weight = weight;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight : " + weight);
        System.out.println("screenSize: " + screenSize);
    }
}
