package Project_Magic_World.Magic_World_4;

import java.util.ArrayList;

public class Magician extends BaseMagic {
    
    Magician(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("magician", name, 17, 12, new int[] { -5, -5 }, 30, 9, 1);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}