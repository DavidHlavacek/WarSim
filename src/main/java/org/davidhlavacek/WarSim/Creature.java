package org.davidhlavacek.WarSim;

import java.util.*;

public class Creature {

    private String name;
    private int max_health;
    private int health;
    private int base_damage;
    private int speed;
    private int special;
    private Army army;
    private int type;
    private Random random;
    private Creature enemy; // Add a field to store the enemy

    // Constructor
    public Creature(String name, int health, int base_damage, int speed, int special) {
        this.name = name;
        this.max_health = health;
        this.health = health;
        this.base_damage = base_damage;
        this.speed = speed;
        this.special = special;
        this.army = null;
        this.type = Simulation.type++;
        this.random = new Random(System.currentTimeMillis());
    }

    public Creature(String name, int health, int base_damage, int speed, int special, int type) {
        this.name = name;
        this.max_health = health;
        this.health = health;
        this.base_damage = base_damage;
        this.speed = speed;
        this.special = special;
        this.army = null;
        this.type = type;
        this.random = new Random(System.currentTimeMillis());
    }

    // Getters
    public Creature getEnemy() {
        return enemy;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMaxHealth() {
        return this.max_health;
    }

    public int getBaseDamage() {
        return this.base_damage;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getSpecial() {
        return this.special;
    }

    public Army getArmy() {
        return this.army;
    }

    public int getType() {
        return type;
    }

    // Setter
    public void setEnemy(Creature enemy) {
        this.enemy = enemy;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setHealth(int health) {
        if (health <= this.max_health) {
            this.health = health;
            return true;
        }
        return false;
    }

    public void setBaseDamage(int base_damage) {
        this.base_damage = base_damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    // Methods

    private int calculateDamage() {
        if (this.base_damage > 10) {
            return base_damage + random.nextInt((base_damage / 10) * 2 + 1) - (base_damage / 10);
        } else {
            return base_damage + random.nextInt(5) - 2; // Adjust this range as needed
        }
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public void attackEnemyCreature(Creature enemyCreature, int specialChange) {
        enemyCreature.takeDamage(this.calculateDamage() + specialChange);
    }

    public void die() {
        this.army.getCreatures().remove(this);
    }
}
