package objects;

public class FelidaeFamily extends Animal{

    public void meowing() {
        System.out.print("meowing... meowing...");
    }

    public FelidaeFamily(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }
}
