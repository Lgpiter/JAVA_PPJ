package dodatkowe_04;

public class Arena {
    private Avatar avatar;
    private Monster monster;

    public Arena (Avatar avatar, Monster monster){
        this.avatar = avatar;
        this.monster = monster;
    }

    public void fight(){
        while (avatar.isAlive() && monster.isAlive()){
            avatar.hurt(monster.attack());
            System.out.println("After Monster attack avatar hp equals " + avatar.getHealth());
            monster.hurt(avatar.attack());
            System.out.println("After Avatar attack monster hp equals " + monster.getHealth());
        }

        if(avatar.isAlive())
            System.out.println("Avatar won this fight");
        else
            System.out.println("Monster won this fight");
    }
}
