package old;

@Deprecated
public class Armor extends Item implements Equippable {
    private boolean equipped;

    public Armor() {
        super();
    }


    @Override
    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    @Override
    public boolean isEquipped() {
        return equipped;
    }

    @Override
    public void addBonuses(PlayerBonuses playerBonuses) {
        if(isEquipped()) {
            super.addBonuses(playerBonuses);
        }
    }
}
