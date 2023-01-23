package Project_Magic_World.Magic_World_2;

public class Farmer extends BaseHero {
    
    private int delivery;

    public Farmer(String name) {
        super("farmer", name, 1, 1, new int[] { 1, 1 }, 1, 3);
        this.delivery = 1;
    }

    @Override
    public String toString() {
        return super.toString() + " {Доставка: " + delivery + "}";
    }

    public int getSupply(){
        return delivery;
    }

}