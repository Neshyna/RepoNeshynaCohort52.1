package hw21;

public class Processor extends Component {

    private Computer computer;

    public Processor(String brand, String model, Computer computer) {
        super(brand, model);
        this.computer = computer;
    }
}
