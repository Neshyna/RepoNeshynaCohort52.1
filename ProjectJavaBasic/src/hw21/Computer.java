package hw21;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }
}
