public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void wakeUp() {
        System.out.println(name + " wakeup!");
    }

    public void rest() {
        System.out.println(name + " rest!");
    }
    public void works() {
        System.out.println(name + " works!");
    }

}
