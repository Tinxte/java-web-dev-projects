package technology;


public class Laptop extends Computer{
    String operatingSystem;

    public Laptop(int modelYear, String name, int ram, String operatingSystem) {
        super(modelYear, name, ram);
    this.operatingSystem = operatingSystem;
    }

    public String print() {
        return "Your " + getModelYear() + getOperatingSystem() + "has printed successfully!";
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
