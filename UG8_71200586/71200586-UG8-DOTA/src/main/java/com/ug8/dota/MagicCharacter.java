package com.ug8.dota;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String name, int damage, int health, int mana){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.mana = mana;
    }

    public void attacked(int damage){
        int kesehatan = health - damage;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
    }




}
