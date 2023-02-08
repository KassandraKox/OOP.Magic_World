import java.util.ArrayList;
import java.util.Random;

public class BaseWalker extends BaseHero {
    public BaseWalker(String type, String name, int attack, int defense,
                      int[] damage, int maxHealth, int speed) {
        super(type, name, attack, defense, damage, maxHealth, speed);
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


        if (distance <= 1) {
            int hurt = attackCalculation(list, 0, indexMinDistance);
            list.get(indexMinDistance).hasDamage(hurt);
            System.out.printf("\nГерой -%s- по имени '%s' атаковал '%s', урон составил %d.",
                    getType(), getName(), list.get(indexMinDistance).getName(), hurt);
            return;
        }

        int x = getPosition().x;
        int y = getPosition().y;


        if (list.get(indexMinDistance).getPosition().y > getPosition().y && checkPosition(new Vector2(x, y + 1), list)) {
            setPosition(new Vector2(x, y + 1));
        } else if (list.get(indexMinDistance).getPosition().y < getPosition().y && checkPosition(new Vector2(x, y - 1), list)) {
            setPosition(new Vector2(x, y - 1));
        } else if (list.get(indexMinDistance).getPosition().x < getPosition().x && checkPosition(new Vector2(x - 1, y), list)) {
            setPosition(new Vector2(x - 1, y));
        } else if (list.get(indexMinDistance).getPosition().x > getPosition().x && checkPosition(new Vector2(x + 1, y), list)) {
            setPosition(new Vector2(x + 1, y));
        }

        ifStops(x, y, list);

    }

    public void ifStops(int x, int y, ArrayList<BaseHero> list) {

        while (getPosition().x == x && getPosition().y == y) {

            int value = new Random().nextInt(4);
            switch (value) {
                case 0:
                    if (checkPosition(new Vector2(x, y + 1), list)) {
                        setPosition(new Vector2(x, y + 1));
                    }
                    break;
                case 1:
                    if (checkPosition(new Vector2(x, y - 1), list)) {
                        setPosition(new Vector2(x, y - 1));
                    }
                    break;
                case 2:
                    if (checkPosition(new Vector2(x - 1, y), list)) {
                        setPosition(new Vector2(x - 1, y));
                    }
                    break;
                case 3:
                    if (checkPosition(new Vector2(x + 1, y), list)) {
                        setPosition(new Vector2(x + 1, y));
                    }
                    break;
            }
        }
    }

}
