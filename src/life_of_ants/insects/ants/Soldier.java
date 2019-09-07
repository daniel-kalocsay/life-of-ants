package life_of_ants.insects.ants;

public class Soldier extends Ant {
    private int counter = 0;

    protected int calculateNextX() {
        return 0;
    }

    protected int calculateNextY() {
        return 0;
    }

    public void communicate(String message) {
        System.out.println(message);
    }

    public void introduceSelf() {
        System.out.println("I'm a Soldier!");
    }

    public void spendAnHour() {
        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveInNextDirection();

        counter++;
    }

    private void moveInNextDirection() {
        int currentRound = counter % 4;
        switch (currentRound) {
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

}
