package life_of_ants;

import life_of_ants.insects.*;
import life_of_ants.insects.ants.*;

import java.util.ArrayList;

class Colony {

    ArrayList<Insect> antsInColony = new ArrayList<>();

    void simulateADay() {
        for (int i = 0; i < 24; i++) simulateAnHour(i);
    }

    private void simulateAnHour(int hourNum) {
        System.out.println(String.format("Hour %s has passed", hourNum+1));
    }

    private void populateWithAnts(int numOfSpecificAnts) {

        for (int i = 0; i < numOfSpecificAnts; i++) {
            antsInColony.add(new Worker());
        }


    }
}
