package inheritance;

public class StandardProcessor implements Processor {
    private String model;

    public StandardProcessor(final String model) {
        this.model = model;
    }

    //standard getters/setters

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }
}
