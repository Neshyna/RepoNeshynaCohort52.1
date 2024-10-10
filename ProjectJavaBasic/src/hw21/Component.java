package hw21;

public class Component {

    private String brand;
    private String model;

    private Processor processor;
    private Memory memory;
    private Storage storage;

    private Computer computer;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.processor = processor;
        this.storage = storage;
    }
}

