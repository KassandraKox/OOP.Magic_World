package Project_Magic_World.Magic_World_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int heroesCount = 10;
    //private static final EnumeratorNames EnumeratorSurnames = null;
    public static ArrayList<BaseHero> personList1 = new ArrayList<>();
    public static ArrayList<BaseHero> personList2 = new ArrayList<>();

    public static String getName(){
        Random random = new Random();
        return EnumeratorSurnames.values()[random.nextInt(EnumeratorSurnames.values().length)] + " " + EnumeratorNames.values()[random.nextInt(EnumeratorNames.values().length)];
    }

    public static void getEqual(String heroType, ArrayList<BaseHero> personList) {
        for (var item : personList) {
            if (item.getClass().getName().equals(heroType)) {
                System.out.print(item);
            }
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < heroesCount; i++) {
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

        /*for (int i = 0; i < heroesCount; i++) {
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
        }*/

        int turn = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("Команда 1. Количество героев: " + heroesCount + " Начало игры ");
        Collections.sort(personList1, new ComporatorByType());
        System.out.print(personList1);
        System.out.print("\nДля выхода из программы введите: 0, для продолжения: Enter ");

        while (!scanner.nextLine().equals("0")) {
            System.out.println("\n--------------------------------------------------------------------------");
            for (var item : personList1) {
                item.step(personList1);
            }
            System.out.print(personList1);
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("\nКоманда 1: завершен [" + (++turn) + "] ход");
            System.out.print("Для выхода из программы введите: 0, для продолжения: Enter ");
        }

        scanner.close();

    }

}