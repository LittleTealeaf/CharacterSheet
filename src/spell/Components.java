package spell;

public class Components {
    private Boolean V,S;
    private String materials;

    public Components(boolean Vocal, boolean Somatic) {
        this(Vocal,Somatic,null);
    }

    public Components(boolean Vocal, boolean Somatic, String materials) {
        V = Vocal;
        S = Somatic;
        this.materials = materials;
    }

}
