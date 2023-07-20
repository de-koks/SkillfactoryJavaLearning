package Module25.MonstersBattle;

public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
        System.out.println("Human " + name + " was created");
    }

    @Override
    public void attack(Entity m){
        m.damage(1);
        System.out.println("Attacking!");
    }
}
