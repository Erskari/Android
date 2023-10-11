public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void works() {
        System.out.println(name + " flies!");
    }
}