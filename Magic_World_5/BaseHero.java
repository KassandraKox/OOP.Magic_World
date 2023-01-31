package Project_Magic_World.Magic_World_5;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Random;

public abstract class BaseHero implements Interface1 {

    private String type;
    private String name;
    private int attack;
    private int defense;
    private int[] damage;
    private int maxHealth;
    public float health;
    private int speed;

    protected String status;

    protected ArrayList<BaseHero> gang;
    protected Vector2 position;

    public BaseHero(String type, String name, int attack, int defense,
            int[] damage, int maxHealth, int speed) {

        this.type = type;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.speed = speed;
        status = "alive";
    }

    @Override
    public void step(ArrayList<BaseHero> list) {
    };

    @Override
    public String getInfo() {
        String outStr = String.format("%21s %10s ⚔%-2d \uD83D\uDEE1%-2d ♥%-5.2f/%-2d ☠%-2d/%-2d \uD83D\uDD57%-2d    ", name, type, attack, defense, health,
                maxHealth, damage[0], damage[1], speed);
        return outStr;
    }

    @Override
    public String toString() {
        return String.format(
                "\n{Роль: %10s} {Имя: %23s} {Атака: %3d} {Защита: %3d} {Урон %9s} {Здоровье: %3d%%} {Скорость: %3d}",
                type, name, attack, defense, Arrays.toString(damage), health, maxHealth, speed);
    }

    public void hasDamage(int hurt) {
        health -= hurt;
        if (health <= 0) {
            health = 0;
            status = "dead";
        }
    }

    public int attackCalculation(ArrayList<BaseHero> list, float minDistance, int indexPlayer) {
        int hurt = 0;
        if (minDistance > 4) {
            if (list.get(indexPlayer).defense < attack) {
                hurt = damage[0] + 1;
            } else {
                hurt = damage[0] - 1;
            }
        } else {
            if (list.get(indexPlayer).defense < attack) {
                hurt = damage[1] + 1;
            } else {
                hurt = damage[1] - 1;
            }
        }
        return hurt;
    }
    
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public float getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHealth(float health) {
        this.health = health;
    }
    
    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

}
