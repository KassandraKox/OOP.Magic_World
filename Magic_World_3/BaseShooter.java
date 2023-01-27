package Project_Magic_World.Magic_World_3;

import java.util.ArrayList;

public class BaseShooter extends BaseHero{
    
    private int shots;

    public BaseShooter(String type, String name, int attack, int defense,
            int[] damage, int health, int speed, int shots) {
        super(type, name, attack, defense, damage, health, speed);
        this.shots = shots;
    }

    @Override
    public void step(ArrayList<BaseHero> list) {

        if (shots > 0) {
            shots--;
            System.out.printf("\nГерой -%s- по имени '%s' произвел один выстрел. Осталось %d выстрелов. ", getType(),
                    getName(), shots);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType().equals("farmer") && ((Farmer) list.get(i)).getDelivery() == 1) {
                ((Farmer) list.get(i)).setDelivery(0);
                shots++;
                System.out.printf("Крестьянин по имени '%s' осуществляет доставку. Осталось выстрелов %d",
                        list.get(i).getName(), shots);
                break;
            }
        }

    }

    @Override
    public String toString() {
        return super.toString() + " {Выстрелы: " + shots + "}";
    }

    public int getShots() {
        return shots;
    }

}