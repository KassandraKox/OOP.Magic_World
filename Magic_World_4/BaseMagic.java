package Project_Magic_World.Magic_World_4;

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
        int index = 0;
        int min = gang.get(0).getHealth();
        for (int i = 0; i < gang.size(); i++) {
            if (min > gang.get(i).getHealth()) {
                min = gang.get(i).getHealth();
                index = i;
            }
        }

        if (gang.get(index).getHealth() < 100) {
            int addHealth = (-1) * this.getDamage()[0] * 100 / gang.get(index).getMaxHealth(); // прибавляемое здоровье в
                                                                                           // процентах
            System.out.println("\n--------------------");
            System.out.println("Герой -" + this.getType() + "- по имени '" + this.getName() + "' лечит -"
                + gang.get(index).getType() + "- по имени '" + list.get(index).getName() + "' здоровье которого "
                + gang.get(index).getHealth() + "% на " + this.getDamage()[0] * (-1) + " пункта (" + addHealth + "%)");

            gang.get(index).setHealth(gang.get(index).getHealth() + addHealth);
            if (gang.get(index).getHealth() > 100) {
                gang.get(index).setHealth(100);
            }

        }
    }

    @Override
    public String toString() {
        return super.toString() + " {Магия: " + mana + "}";
    }

    public int getMana() {
        return mana;
    }
}