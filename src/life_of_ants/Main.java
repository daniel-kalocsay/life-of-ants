package life_of_ants;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numOfWorkers = 0;
        int numOfSoldiers = 0;
        int numOfDrones = 3;

        Colony antColony = new Colony(numOfWorkers, numOfSoldiers, numOfDrones);
        antColony.simulateADay();

    }
}
