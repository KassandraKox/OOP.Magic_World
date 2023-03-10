package Project_Magic_World.Magic_World_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 5;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            System.out.print("-----------------Ход светлых-----------------");
            whiteSide.forEach(n -> n.step(darkSide));
            System.out.print("\n---------------Ход темных------------------");
            darkSide.forEach(n -> n.step(whiteSide));
            System.out.println("\n-------------Нажми Enter-----------------");
            scanner.nextLine();
        }

    }

    public static String getName(){
        Random random = new Random();
        return EnumeratorSurnames.values()[random.nextInt(EnumeratorSurnames.values().length)] + " "
         + EnumeratorNames.values()[random.nextInt(EnumeratorNames.values().length)];
    }

    private static void init() {
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Farmer(whiteSide, getName(), x, y++));
                    break;
                case 1:
                    whiteSide.add(new Robber(whiteSide, getName(), x, y++));
                    break;
                case 2:
                    whiteSide.add(new Sniper(whiteSide, getName(), x, y++));
                    break;
                default:
                    whiteSide.add(new Monk(whiteSide, getName(), x, y++));
                    break;
            }
        }
        y = 1;
        x = 1;
        Collections.sort(whiteSide, new ComporatorByType());
        for (var item : whiteSide) {
            item.setPosition(new Vector2(x, y++));
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Farmer(darkSide, getName(), x, y++));
                    break;
                case 1:
                    darkSide.add(new Spearman(darkSide, getName(), x, y++));
                    break;
                case 2:
                    darkSide.add(new Arbalester(darkSide, getName(), x, y++));
                    break;
                default:
                    darkSide.add(new Magician(darkSide, getName(), x, y++));
                    break;
            }
        }

        y = 1;
        x = GANG_SIZE;
        Collections.sort(darkSide, new ComporatorByType());
        for (var item : darkSide) {
            item.setPosition(new Vector2(x, y++));
        }
    }

}