package Module25.MonstersBattle;

abstract class Entity {
    private String name;
    private boolean destroyed = false;
    private int hp = 15;

    public Entity(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        } else {
            return false;
        }
    }

    public boolean isDestroyed() {
        return this.destroyed;
    }
}
