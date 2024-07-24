package factoryMethod;

public abstract class Warrior {
    static Warrior createWarrior(int i) {
        return switch (i) {
            case 1 -> new Archer();
            case 2 -> new Horseman();
            case 3 -> new Infantryman();
            default -> {
                System.out.println("Invalid warrior");
                yield null;
            }
        };
    }
}
