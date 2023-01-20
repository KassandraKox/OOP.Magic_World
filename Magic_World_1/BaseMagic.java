package Project_Magic_World.Magic_World_1;

public class BaseMagic extends BaseHero {
    
    private int mana;

    public BaseMagic(String type, String name, int attack, int defense,
            int[] damage, int health, int speed, int mana) {
        super(type, name, attack, defense, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + " {Магия: " + mana + "}";
    }

    public int getMana(){
        return mana;
    }
}
