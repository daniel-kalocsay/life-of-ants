package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.insects.Insect;

public class Queen extends Ant {
    boolean inTheMood = true;

    private boolean currentlyMating = false;
    private int matingDuration = 2;
    private Insect matingWith;

    public boolean isMating() {
        return currentlyMating;
    }

    public boolean isInTheMood() {
        return inTheMood;
    }

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a lazy ass Queen!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen() ) communicate(imFrozen);
        else {
            if (currentlyMating) keepMating();
            else sitAndDoNothing();
        }
    }

    private void sitAndDoNothing() {
        System.out.println("Just here sitting on my lazy ass doing absolutely nothing at all");;
    }

    void startMating(Insect insect) {
        System.out.println("queen started mating with a filthy pleb");
        currentlyMating = true;
        matingWith = insect;
    }

    private void stopMating() {
        currentlyMating = false;
        inTheMood = false;
        matingDuration = 2;

        yeet(matingWith);
        matingWith = null;
    }

    private void keepMating() {
        if (matingDuration > 0) {
            System.out.println("still mating");
            matingDuration--;
        }

        else stopMating();
    }

    private void yeet(Insect poorInsect) {
        poorInsect.getYeeted();
        System.out.println("i yeeted a pleb");
    }

    public Queen() {
        posX = 0;
        posY = 0;
    }
}
