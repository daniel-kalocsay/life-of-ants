package life_of_ants;

import life_of_ants.insects.Insect;
import life_of_ants.insects.ants.Drone;
import life_of_ants.insects.ants.Queen;
import life_of_ants.insects.ants.Soldier;
import life_of_ants.insects.ants.Worker;

import java.util.ArrayList;

public class Colony {

    private ArrayList<Insect> insectsInColony = new ArrayList<>();
    private Queen queenOfColony;
//    private Wasp asd = new Wasp();

    void simulateADay() {
        for (int i = 0; i < 1; i++) simulateAnHour(i);
    }

    private void simulateAnHour(int hourNum) {
        for (Insect pleb : insectsInColony) {
            System.out.println("id: " + pleb.getId());
            pleb.announceSelf();

            System.out.println("distance from queen: " + pleb.calculateDistanceFromQueen(this));
            pleb.spendAnHour();
            System.out.println("");
        }

        System.out.println(String.format("Hour %s has passed", hourNum+1));
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
