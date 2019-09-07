package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.insects.Insect;

abstract class Ant extends Insect {
    private int distanceFromQueen;

    private void setDistanceFromQueen(int distance) {
        distanceFromQueen = distance;
    }

}
