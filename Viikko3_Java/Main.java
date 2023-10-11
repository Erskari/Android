import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        Note jambo = new Note();
        Note jambu = new Note("blunu", Color.BLUE);
        System.out.println(jambo);
        System.out.println(jambu);

        Fish turtle = new Fish("Turtle");
        Bird hawk = new Bird("Hawk");
        turtle.wakeUp();
        turtle.works();
        turtle.rest();

        hawk.wakeUp();
        hawk.works();
        hawk.rest();
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(new Bird("Eagle"));
        list.add(new Fish("Salmon"));
        for (Animal a : list) {
            a.wakeUp();
        }
        for (Animal a : list) {
            a.works();
        }
        for (Animal a : list) {
            a.rest();
        }
    }
}
