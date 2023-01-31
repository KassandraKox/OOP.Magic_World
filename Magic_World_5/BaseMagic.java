package Project_Magic_World.Magic_World_5;

import java.util.ArrayList;

public class BaseMagic extends BaseHero {
    
    private int mana;

    public BaseMagic(String type, String name, int attack, int defense,
            int[] damage, int health, int speed, int mana) {
        super(type, name, attack, defense, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseHero> list) {
        if (status.equals("dead")) {
            return;
        }
        int index = healingIndex();
        if (index == -1) {
            System.out.printf("\n------------Game over------------");
            return;
        }

        if (gang.get(index).getHealth() < gang.get(index).getMaxHealth()) {
            float addHealth = (-1) * getDamage()[0];

            System.out.print("\nГерой -" + getType() + "- по имени '" + getName() + "' лечит -"
                    + gang.get(index).getType() + "- по имени '" + gang.get(index).getName() + "' здоровье которого "
                    + gang.get(index).getHealth() + " на " + addHealth + " пункта");

            gang.get(index).setHealth(gang.get(index).getHealth() + addHealth);
            if (gang.get(index).getHealth() > gang.get(index).getMaxHealth()) {
                gang.get(index).setHealth(gang.get(index).getMaxHealth());
            }
            }

        }
    

    private int healingIndex() {
        int index = -1;
        float min = Float.MAX_VALUE;
        for (int i = 0; i < gang.size(); i++) {
            if (!gang.get(i).status.equals("dead")) {
                if (min > gang.get(i).getHealth() / gang.get(i).getMaxHealth()) {
                    min = gang.get(i).getHealth() / gang.get(i).getMaxHealth();
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return super.toString() + " {Магия: " + mana + "}";
    }

    public int getMana() {
        return mana;
    }
}