package hogwarts.data;

import java.util.HashMap;

public class PotionInventory {
    private HashMap<String, Integer> potions = new HashMap<>();

    public void addPotion(String name, int quantity) {
        potions.put(name, quantity);
    }

    public void showPotions() {
        System.out.println("\n🧪 Potion Inventory:");
        for (String key : potions.keySet()) {
            System.out.println("   • " + key + " x" + potions.get(key));
        }
    }
}
