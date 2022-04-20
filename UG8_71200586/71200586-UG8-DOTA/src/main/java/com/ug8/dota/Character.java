package com.ug8.dota;

public abstract class Character implements ObjectAttack{
    protected int damage;
    protected String name;
    protected int health;

    public Character(String name, int damage, int health){
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void showCharacterInfo(){
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
    }

    public boolean isDie(){
        boolean status = false;
        if (health <= 0){
            status = true;
        } else {
            return status;
        };
    }

    public void attacked(int damage){}
}
