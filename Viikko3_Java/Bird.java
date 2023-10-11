public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void works() {
        System.out.println(name + " swims!");
    }
}