package life_of_ants;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numOfWorkers = 10;
        int numOfSoldiers = 4;
        int numOfDrones = 3;

        Colony antColony = new Colony(numOfWorkers, numOfSoldiers, numOfDrones);
        antColony.simulateADay();

    }
}
