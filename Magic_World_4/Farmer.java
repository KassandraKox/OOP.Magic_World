package Project_Magic_World.Magic_World_4;

import java.util.ArrayList;

public class Farmer extends BaseHero {
    
    private int delivery;

    public Farmer(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("farmer", name, 1, 1, new int[] { 1, 1 }, 1, 3);
        this.delivery = 1;
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> list) {
        if (delivery == 0) {
            delivery = 1;
            System.out.printf("\nГерой -%s- по имени '%s' готов к доставке ", getType(),
                    getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " {Доставка: " + delivery + "}";
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

}