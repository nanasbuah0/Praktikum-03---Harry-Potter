package hogwarts;

import hogwarts.karakter.Wizard;
import hogwarts.data.SpellBook;
import hogwarts.data.PotionInventory;
import hogwarts.exception.MagicalChallengeException;
import hogwarts.exception.PotionNotFoundException;

public class MainApp {
    // kode warna
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        System.out.println(CYAN + "=======================================" + RESET);
        System.out.println(PURPLE + "🪄 Welcome to Hogwarts Magic Simulator" + RESET);
        System.out.println(CYAN + "=======================================" + RESET);

        // Wizard
        Wizard hermione = new Wizard("Hermione Granger", "Gryffindor");
        System.out.println(YELLOW);
        hermione.showInfo();
        System.out.println(RESET);

        // ArrayList (SpellBook)
        SpellBook book = new SpellBook();
        book.addSpell("Wingardium Leviosa");
        book.addSpell("Alohomora");
        book.addSpell("Expelliarmus");
        System.out.println(GREEN);
        book.showSpells();
        System.out.println(RESET);

        // HashMap (PotionInventory)
        PotionInventory inventory = new PotionInventory();
        inventory.addPotion("Polyjuice", 1);
        inventory.addPotion("Healing Potion", 3);
        inventory.addPotion("Veritaserum", 2);
        System.out.println(BLUE);
        inventory.showPotions();
        System.out.println(RESET);

        // Exception Handling
        try {
            magicalChallenge();
        } catch (MagicalChallengeException e) {
            System.out.println(RED);
            System.out.println("\n📜 Magical Challenge!");
            System.out.println("⚠️ " + e.getMessage());
            System.out.println(RESET);
        } finally {
            System.out.println(YELLOW + "\n✨ Hermione thinks quickly and overcomes the challenge with her wisdom ✨" + RESET);
        }

        try {
            findPotion("Invisibility Potion");
        } catch (PotionNotFoundException e) {
            System.out.println(RED);
            System.out.println("\n🔍 Potion Search Result:");
            System.out.println("❌ " + e.getMessage());
            System.out.println("💡 Hint: Maybe it's hidden in the Restricted Section of the Library!");
            System.out.println(RESET);
        }

        System.out.println(PURPLE + "\n🌟 End of Simulation 🌟" + RESET);
    }

    public static void magicalChallenge() throws MagicalChallengeException {
        throw new MagicalChallengeException("A mysterious riddle blocks Hermione's spell...\n\"Knowledge is the greatest power, not curses!\"");
    }

    public static void findPotion(String potion) {
        throw new PotionNotFoundException(potion + " was not found on the shelves...");
    }
}
