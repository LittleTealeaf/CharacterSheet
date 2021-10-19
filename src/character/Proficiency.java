package character;

public class Proficiency {

    private String name;
    private Category category;


    public Proficiency(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public enum Category {
        ARMOR, WEAPONS, TOOLS;
    }

}
