package Project_Magic_World.Magic_World_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final EnumeratorNames EnumeratorSurnames = null;
    public static ArrayList<BaseHero> personList1 = new ArrayList<>();
    public static ArrayList<BaseHero> personList2 = new ArrayList<>();

    public static String getName(){
        Random random = new Random();
        return EnumeratorNames.values()[random.nextInt(EnumeratorSurnames.values().length)] + " " + EnumeratorNames.values()[random.nextInt(EnumeratorNames.values().length)];
    }

    public static void getEqual(String unitType, ArrayList<BaseHero> personList) {
        for (var item : personList) {
            if (item.getClass().getName().equals(unitType)) {
                System.out.print(item);
            }
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    personList1.add(new Farmer(getName()));
                    break;
                case 1:
                    personList1.add(new Robber(getName()));
                    break;
                case 2:
                    personList1.add(new Sniper(getName()));
                    break;
                case 3:
                    personList1.add(new Magician(getName()));
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    personList2.add(new Farmer(getName()));
                    break;
                case 1:
                    personList2.add(new Spearman(getName()));
                    break;
                case 2:
                    personList2.add(new Arbalester(getName()));
                    break;
                case 3:
                    personList2.add(new Monk(getName()));
                    break;
            }
        }

        System.out.println("\n--------------------");
        System.out.println("Список1:");
        System.out.print(personList1);
        Magician mag1 = new Magician("Маг 1");
        mag1.step(personList1);

        System.out.println("\n--------------------");
        System.out.println("Список2:");
        System.out.print(personList2);
        Monk monk1 = new Monk("Дьякон 1");
        monk1.step(personList2);
    }

}