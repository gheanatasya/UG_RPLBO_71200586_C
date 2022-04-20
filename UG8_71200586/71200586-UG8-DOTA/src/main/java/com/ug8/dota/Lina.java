package com.ug8.dota;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(){
        String name = "Lina";
        int health = 800;
        int damage = 70;
        int mana = 120;
    }

    public boolean skill(Character){
        boolean melawan = false;
        if (damage >= 600 && mana >= 60){
            melawan = true;
            System.out.println("Berhasil menyerang");
        } else {
            System.out.println("Tidak bisa menyerang");
        }
    }
    public void attack(Character){

    }
}
