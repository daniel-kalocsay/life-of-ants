package life_of_ants.insects;

import life_of_ants.Colony;
import life_of_ants.Util;
import life_of_ants.insects.ants.Queen;

public abstract class Insect {
    static int nextId = 0;
    int id;

    private boolean isFrozen = false;
    protected boolean isFrozen() {
        return isFrozen;
    }
    protected String imFrozen = "I'm frozen";

    protected int posX;
    protected int posY;

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public void getYeeted() {
        int randomNum1 = Util.getIntegerBetween(1, 50);
        int randomNum2 = 50-randomNum1;

        posX = randomNum1;
        posY = randomNum2;
    }

    protected void moveTo(int x, int y) {
        setPosition(x, y);
    }

    public abstract void spendAnHour(Colony colony);
    public abstract void introduceSelf();

    protected void decideNextDirection(int direction) {
        switch (direction) {
            case 0:
                moveTo(this.posX, this.posY + 1); // up
                break;
            case 1:
                moveTo(this.posX + 1, this.posY); // right
                break;
            case 2:
                moveTo(this.posX, this.posY - 1); // down
                break;
            case 3:
                moveTo(this.posX - 1, this.posY); // left
                break;
        }
    }

    public void communicate(String message) {
        System.out.println(message);
    }

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

    public void unfreeze() {
        isFrozen = false;
    }

    protected Insect() {
        id = nextId++;

        posX = Util.getIntegerBetween(-50, 50);
        posY = Util.getIntegerBetween(-50, 50);
    }

}
