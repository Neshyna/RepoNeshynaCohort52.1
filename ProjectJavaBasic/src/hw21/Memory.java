package hw21;

public class Memory extends Component{

    private Computer computer;

    public Memory(String brand, String model, Computer computer) {
        super(brand, model);
        this.computer = computer;
    }
}
