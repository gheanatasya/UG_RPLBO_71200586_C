package com.ug8.dota;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String name, int damage, int health, int armor){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.armor = armor;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
    }

    public void attacked(int damage){
        int kesehatan = health - damage;
        int kerusakan = damage - armor;
    }
}
