package Project_Magic_World.Magic_World_4;

import java.util.ArrayList;

public class Robber extends BaseHero {
    
    public Robber(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("robber", name, 8, 3, new int[] { 2, 4 }, 10, 6);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}
