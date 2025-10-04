package hogwarts.data;

import java.util.ArrayList;

public class SpellBook {
    private ArrayList<String> spells = new ArrayList<>();

    public void addSpell(String spell) {
        spells.add(spell);
    }

    public void showSpells() {
        System.out.println("\n📖 SpellBook:");
        for (String spell : spells) {
            System.out.println("   - " + spell);
        }
    }
}
