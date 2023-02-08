
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HeroTeam.Init();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();
            gameStep();
            if (HeroTeam.deadTeam(HeroTeam.whiteSide) || HeroTeam.deadTeam(HeroTeam.darkSide)) {
                ConsoleView.view();
                System.out.println("End");
                break;
            }
        }

    }

    public static void gameStep() {
        ArrayList<BaseHero> allSides = new ArrayList<>();
        allSides.addAll(HeroTeam.whiteSide);
        allSides.addAll(HeroTeam.darkSide);
        Collections.sort(allSides, new ComporatorBySpeed());
        for (var item : allSides) {
            if (item.gang.equals(HeroTeam.whiteSide)) {
                System.out.print(AnsiColors.ANSI_BLUE);
                item.step(HeroTeam.darkSide);
            } else {
                System.out.print(AnsiColors.ANSI_GREEN);
                item.step(HeroTeam.whiteSide);
            }
        }
    }
}