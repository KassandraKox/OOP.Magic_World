

import java.util.ArrayList;

public class Spearman extends BaseWalker {
    
    public Spearman(ArrayList<BaseHero> gang, String name, int x, int y) {
        super("sman", name, 4, 5, new int[]{1, 3}, 10, 4);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}