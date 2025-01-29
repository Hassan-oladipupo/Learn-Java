public class SmartApplianceMain {
    public  static void main(String[] args){
        SmartAppliance myAppliance = new SmartAppliance(
                "Washing machine",
                "LG Gold",
                "on"
        );
        myAppliance.displayAppliance();
        // creating a new instance of the SmartAppliance object
        SmartAppliance myAppliance2 = myAppliance.getInstance();
        myAppliance2.setApplianceName("Electric kettle");
        System.out.println("........................");
        myAppliance2.displayAppliance();

        // creating a reference of myAppliance ie changing  it value in memory
        SmartAppliance myAppliance3 = myAppliance;
        myAppliance3.setApplianceName("Electric Iron");
        System.out.println("........................");
        myAppliance3.displayAppliance();

        System.out.println("........................");
        myAppliance.displayAppliance();

        SmartAppliance myAppliance4 = myAppliance;
        //Method chaining : joining 2 or method of smart appliance object
        System.out.println("........................");
        myAppliance4.setApplianceName("Oven").setApplianceType("Bread oven").setPowerStatus("Off");
        myAppliance4.displayAppliance();
    }
}
