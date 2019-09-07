package life_of_ants.insects.ants;

public class Worker extends Ant {

    protected int calculateNextX() {
        return (int) (Math.random() * 20);
    }

    protected int calculateNextY() {
        return (int) (Math.random() * 20);
    }

    public void communicate(String message) {
        System.out.println(message);
    }

    public void announceSelf() {
        System.out.println("I'm a Worker!");
    }


    public void spendAnHour() {

        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveTo(calculateNextX(), calculateNextY());
    }


    public Worker() {
        posX = 5;
        posY = -5;
    }
}
