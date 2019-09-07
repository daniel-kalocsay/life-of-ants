package life_of_ants.insects;

import life_of_ants.Colony;
import life_of_ants.insects.ants.Queen;

public abstract class Insect {
    static int nextId = 0;
    int id;

    private boolean isFrozen = false;
    protected boolean isFrozen() {
        return isFrozen;
    }

    protected int posX;

    public int getPosX() {
        return posX;
    }

    protected int posY;

    public int getPosY() {
        return posY;
    }

    protected void moveTo(int x, int y) {
        setPosition(x, y);
    }

    public abstract void spendAnHour();
    public abstract void announceSelf();

    protected abstract int calculateNextX();
    protected abstract int calculateNextY();

    public abstract void communicate(String message);

    public int getId() {
        return id;
    }


    public int calculateDistanceFromQueen(Colony colony) {
        Queen queen = colony.getQueen();
        return Math.abs(posX - queen.getPosX()) + Math.abs(posY - queen.getPosY());
    }

    private void setPosition(int x, int y) {
        posX = x;
        posY = y;
    }

    protected void freeze() {
        isFrozen = true;
    };

    protected void unfreeze() {
        isFrozen = false;
    }

    protected Insect() {
        id = nextId++;
    }

}
