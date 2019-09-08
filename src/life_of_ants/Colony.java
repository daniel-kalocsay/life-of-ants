package life_of_ants;

import life_of_ants.insects.*;
import life_of_ants.insects.ants.*;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Colony {

    private ArrayList<Insect> insectsInColony = new ArrayList<>();
    private Queen queenOfColony;
    private Wasp waspInColony;
//    private Wasp asd = new Wasp();

    void simulateADay(int dayNum, int waspToAppear) throws InterruptedException {
        //should be i < 24
        for (int i = 0; i < 24; i++) {
            int hourNum = i + 1;

            simulateAnHour(dayNum, hourNum, waspToAppear);
            Thread.sleep(200);
        }
    }

    private void simulateAnHour(int dayNum, int hourNum, int waspToAppear) throws InterruptedException {
        int totalHours = ((dayNum - 1) * 24) + hourNum;

        System.out.println(String.format("Hour %s:\n", hourNum));

        if (totalHours == waspToAppear && waspInColony == null) {
            waspInColony = new Wasp();
        }

        for (Insect insect : insectsInColony) {
            printInsectStatus(insect);
        }

        if (waspInColony != null) printInsectStatus(waspInColony);


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
    public Wasp getWasp() {
        return waspInColony;}

    public ArrayList<Insect> getInsectsInColony() {
        return insectsInColony;
    }

    public void removeWasp() {
        waspInColony = null;
    }

    private void printInsectStatus(Insect insect) throws InterruptedException {
        System.out.println("id: " + insect.getId());
        insect.introduceSelf();


        System.out.println(String.format("pos: x: %s, y: %s", insect.getPosX(), insect.getPosY()));
        System.out.println("distance from queen: " + insect.calculateDistanceFromQueen(this));

        insect.spendAnHour(this);
        System.out.println("");

        Thread.sleep(50);
    }
}
