

import java.util.Comparator;

public class ComporatorByType implements Comparator<BaseHero> {
    
    // сортировка компараторм: первые монахи и колдуны, последние крестьяне,
    // остальные по алфавиту в середине
    @Override
    public int compare(BaseHero hero1, BaseHero hero2) {
        if (hero1 instanceof BaseMagic) {
            return -1;
        } else if (hero2 instanceof BaseMagic) {
            return 1;
        } else if (hero1.getType().equals("farmer")) {
            return 1;
        } else if (hero2.getType().equals("farmer")) {
            return -1;
        } else {
            return hero1.getType().compareTo(hero2.getType());
        }

    }
}