package life_of_ants;

import java.util.ConcurrentModificationException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numOfWorkers = 4;
        int numOfSoldiers = 4;
        int numOfDrones = 2;
        int roundWhereWaspAppears = 14;

        Colony antColony = new Colony(numOfWorkers, numOfSoldiers, numOfDrones);
        simulateDays(antColony, 2, roundWhereWaspAppears);

    }

    public static void simulateDays(Colony colony, int days, int waspToAppear) throws InterruptedException {
        for (int i = 0; i < days; i++) {
            int dayNum = i + 1;

            colony.simulateADay(dayNum, waspToAppear);
            System.out.println(String.format("Day %s has passed", dayNum));
        }

    }
}
