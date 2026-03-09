public class Dwarf extends GameCharacter {

    public Dwarf() {
        super();
        setRace("Dwarf");
    }

    public Dwarf(String name, int level, int hp, int armor,int gold, int exp, Weapon w1, Weapon w2) {

        super(name, "Dwarf", level, hp, armor, gold, exp, w1, w2);
    }

    public Dwarf(Dwarf other) {
        super(other);
    }

    // improve ally armor
    public void assist(GameCharacter ally) {

        ally.setArmorClass(ally.getArmorClass() + 2);

        System.out.println(getName() + " strengthens " + ally.getName() + "'s armor!");
    }

    // physical attack
    public void attack(GameCharacter enemy) {

        int damage = 5;

        if (getWeapon1() != null)
            damage += getWeapon1().getDamage();

        enemy.setHitPoints(enemy.getHitPoints() - damage);

        System.out.println(getName() + " strikes " + enemy.getName());
    }
}