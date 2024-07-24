package factoryMethod2;

public class Archer extends Warrior {
    @Override
    Weapon getWeapon() {
        return new Bow();
    }
}
