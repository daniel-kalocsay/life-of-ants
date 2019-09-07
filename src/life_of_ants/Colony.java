package life_of_ants;

import life_of_ants.insects.*;
import life_of_ants.insects.ants.*;

import java.util.ArrayList;

public class Colony {

    private ArrayList<Insect> insectsInColony = new ArrayList<>();
    private Queen queenOfColony;
    private Wasp asd = new Wasp();

    void simulateADay() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            simulateAnHour(i+1);
            Thread.sleep(1000);
        }
    }

    private void simulateAnHour(int hourNum) throws InterruptedException {
        System.out.println(String.format("Hour %s:\n", hourNum));

        for (Insect pleb : insectsInColony) {
            System.out.println("id: " + pleb.getId());
            pleb.introduceSelf();


            System.out.println(String.format("pos: x: %s, y: %s", pleb.getPosX(), pleb.getPosY()));
            System.out.println("distance from queen: " + pleb.calculateDistanceFromQueen(this));

            pleb.spendAnHour();
            System.out.println("");
            Thread.sleep(50);
        }

        System.out.println(String.format("Hour %s has passed", hourNum));
    }

    private void populateWithAnts(int numOfWorkers, int numOfSoldiers, int numOfDrones, Queen newQueen) {

        queenOfColony = newQueen;
        insectsInColony.add(newQueen);

        for (int i = 0; i < numOfWorkers; i++) {
            insectsInColony.add(new Worker());
        }

        for (int i = 0; i < numOfSoldiers; i++) {
            insectsInColony.add(new Soldier());
        }

        for (int i = 0; i < numOfDrones; i++) {
            insectsInColony.add(new Drone());
        }
    }

    Colony(int workers, int soldiers, int drones) {
        populateWithAnts(workers, soldiers, drones, new Queen());
    }

    public Queen getQueen() {
        return queenOfColony;
    }
}
