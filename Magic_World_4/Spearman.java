package Project_Magic_World.Magic_World_4;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    
    public Spearman(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("spearman", name, 4, 5, new int[] { 1, 3 }, 10, 4);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}