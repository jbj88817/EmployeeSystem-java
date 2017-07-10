package di.parts;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class LargeEngine implements Engine {

    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("started large " + horsePower + "hp engine");
    }
}
