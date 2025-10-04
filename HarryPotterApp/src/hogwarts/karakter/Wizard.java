package hogwarts.karakter;

public class Wizard {
    private String name;
    private String house;

    public Wizard(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public void showInfo() {
        System.out.println("👩‍🎓 Wizard Info:");
        System.out.println("   " + name + " from " + house);
    }
}
