//Main.java
public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Longsword", "Melee", 10, 5);

        Elf elf = new Elf("Aelar", 3, 30, 12, 50, 100, sword, null);

        System.out.println("Character Created:");
        System.out.println(elf);

        System.out.println();

        Dwarf dwarf = new Dwarf("Borin", 2, 40, 15, 20, 50, sword, null);

        elf.attack(dwarf);
        dwarf.assist(dwarf);

        System.out.println();
        System.out.println("After actions:");
        System.out.println(dwarf);
    }
}
