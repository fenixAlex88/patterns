package factoryMethod;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = Warrior.createWarrior(1);
        System.out.println(warrior != null ? warrior.getClass() : null);
    }
}
