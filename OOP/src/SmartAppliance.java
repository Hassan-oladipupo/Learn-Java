public class SmartAppliance {
  private String applianceName;
  private String applianceType;
  private String powerStatus;

  // class construct
    public SmartAppliance(
            String applianceName,
            String applianceType,
            String powerStatus
    ){
        this.applianceName = applianceName;
        this.applianceType = applianceType;
        this.powerStatus = powerStatus;
    }

    // getInstance: to create a new SmartAppliance instance in memory
     public SmartAppliance getInstance(){
        return this;
     }

     // class method
    public  void displayAppliance(){
        System.out.println(
                "applianceName:" +  applianceName
        );
        System.out.println(
                "applianceType:" +  applianceType
        );

        System.out.println(
                "powerStatus:" +  powerStatus
        );
    }
    // class setter

    public SmartAppliance setApplianceName(String applianceName) {
        this.applianceName = applianceName;
        return  this;
    }

    public SmartAppliance setApplianceType(String applianceType) {
        this.applianceType = applianceType;
        return this;
    }

    public SmartAppliance  setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }
}
