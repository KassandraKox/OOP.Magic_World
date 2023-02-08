

import java.util.Comparator;

public class ComporatorBySpeed implements Comparator<BaseHero> {
    
    @Override
    public int compare(BaseHero unit1, BaseHero unit2) {
        if (unit1.getSpeed() < unit2.getSpeed()){
            return 1;
        } else if(unit1.getSpeed() == unit2.getSpeed()){
            return 0;
        } else {
            return -1;
        }
    }
}