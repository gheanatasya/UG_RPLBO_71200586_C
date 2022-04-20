package com.ug8.dota;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;

    public DragonKnight(){
        String name = "Dragon Knight";
        int health = 1800;
        int damage = 95;
        int armor = 50;
    }

    public void skill(){
        this.dragonFormAttack = 2;
    }

    public void attack(Character){
        if (dragonFormAttack > 0){
            damage = damage + 90;
            dragonFormAttack = dragonFormAttack - 1;
        }
    }
}
