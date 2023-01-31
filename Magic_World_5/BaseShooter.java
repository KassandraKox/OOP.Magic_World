package Project_Magic_World.Magic_World_5;

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
        if (status.equals("dead")) {
            return;
        }
        float distance = getTarget(list)[0];
        int indexMinDistance = (int) getTarget(list)[1];
        if ((int) indexMinDistance == -1) {
            System.out.printf("\n------------Game over------------");
            return;
        }
        int hurt = attackCalculation(list, distance, indexMinDistance);
        list.get(indexMinDistance).hasDamage(hurt);

        if (shots > 0) {
            shots--;
            System.out.printf("\nГерой -%s- по имени '%s' произвел один выстрел в '%s', урон которого составил %d. Осталось %d выстрелов. ",
                    getType(), getName(), list.get(indexMinDistance).getName(), hurt, shots);
        }

        for (int i = 0; i < gang.size(); i++) {
            if (gang.get(i).getType().equals("farmer") && ((Farmer) gang.get(i)).getDelivery() == 1) {
                ((Farmer) gang.get(i)).setDelivery(0);
                shots++;
                System.out.printf("Крестьянин по имени '%s' осуществляет доставку. Осталось выстрелов %d",
                        gang.get(i).getName(), shots);
                break;
            }
        }
    }

    private float[] getTarget(ArrayList<BaseHero> list) {
        float minDistance = Float.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).status.equals("dead")) {
                if (minDistance > getPosition().getDistance(list.get(i).getPosition().x, list.get(i).getPosition().y)) {
                    minDistance = getPosition().getDistance(list.get(i).getPosition().x, list.get(i).getPosition().y);
                    minIndex = i;
                }
            }
        }


        return new float[]{minDistance, (float) minIndex};
    }


    @Override
    public String getInfo() {
        String outStr = String.format("%21s %10s ⚔%-2d \uD83D\uDEE1%-2d ♥%-5.2f/%-2d ☠%-2d/%-2d \uD83D\uDD57%-2d ↗%-2d",
                getName(), getType(), getAttack(), getDefense(), getHealth(), getMaxHealth(),
                getDamage()[0], getDamage()[1], getSpeed(), getShots());
        return outStr;
    }

    @Override
    public String toString() {
        return super.toString() + " {Выстрелы: " + shots + "}";
    }

    public int getShots() {
        return shots;
    }

}