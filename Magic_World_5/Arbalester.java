package Project_Magic_World.Magic_World_5;

import java.util.ArrayList;

public class Arbalester extends BaseShooter {
    
    public Arbalester(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("arbalester", name, 6, 3, new int[] { 2, 3 }, 10, 4, 16);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}
