package technology;

public abstract class Computer {
    private int modelYear;
    private String name;
    public int ram;

    public Computer(int modelYear, String name, int ram) {
        this.modelYear = modelYear;
        this.name = name;
        this.ram = ram;
    }

    public void addRam(int amount) {
        int originalRam = this.getRam();
        int upgradedRam = this.getRam();
        upgradedRam += amount;
        setRam(upgradedRam);
        System.out.println("RAM upgraded from " + originalRam + "to " + upgradedRam + "successfully!");
        System.out.println("Current RAM:");
        System.out.println(this.getRam());
    }

    public int getModelYear() {
        return modelYear;
    }

    private void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
