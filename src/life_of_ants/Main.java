package life_of_ants;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numOfWorkers = 3;
        int numOfSoldiers = 5;
        int numOfDrones = 2;

        Colony antColony = new Colony(numOfWorkers, numOfSoldiers, numOfDrones);
        simulateDays(antColony, 3);

    }

    public static void simulateDays(Colony colony, int days) throws InterruptedException {
        for (int i = 0; i < days; i++) {
            int dayNum = i+1;

            colony.simulateADay();
            System.out.println(String.format("Hour %s has passed", dayNum));
        }

    }
}
