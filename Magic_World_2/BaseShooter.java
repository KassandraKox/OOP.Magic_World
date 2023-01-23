package Project_Magic_World.Magic_World_2;

public class BaseShooter extends BaseHero{
    
    private int shots;

    public BaseShooter(String type, String name, int attack, int defense,
            int[] damage, int health, int speed, int shots) {
        super(type, name, attack, defense, damage, health, speed);
        this.shots = shots;
    }

    @Override
    public String toString() {
        return super.toString() + " {Выстрелы: " + shots + "}";
    }

    public int getShots(){
        return shots;
    }

}
