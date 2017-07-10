package di.parts;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("started small " + horsePower + "hp engine");
    }
}
