public class Elf extends GameCharacter {

    public Elf() {
        super();
        setRace("Elf");
    }

    public Elf(String name, int level, int hp, int armor,int gold, int exp, Weapon w1, Weapon w2) {

        super(name, "Elf", level, hp, armor, gold, exp, w1, w2);
    }

    public Elf(Elf other) {
        super(other);
    }

    // heal ally
    public void assist(GameCharacter ally) {

        int heal = 5 + getLevel();

        ally.setHitPoints(ally.getHitPoints() + heal);

        System.out.println(getName() + " heals " + ally.getName());
    }

    // magic attack
    public void attack(GameCharacter enemy) {

        int damage = getExpPoints() / 10 + 5;

        enemy.setHitPoints(enemy.getHitPoints() - damage);

        System.out.println(getName() + " casts spell on " + enemy.getName());
    }
}