package inheritance;

public class StandardMemory implements Memory {
    private String brand;
    private String size;

    // standard const, getters, setters

    public StandardMemory(final String brand, final String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }
}
