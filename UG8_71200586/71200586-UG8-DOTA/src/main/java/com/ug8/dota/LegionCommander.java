package com.ug8.dota;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    private int kill;

    public LegionCommander(){
        String name = "Legion Commander";
        int health = 1200;
        int damage = 120;
        int armor = 30;
    }

    public void attack(Character){

    }

    public boolean skill(Character){
        while Character.isDie() == false;
    }
}
