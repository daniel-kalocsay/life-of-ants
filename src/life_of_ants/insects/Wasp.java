package life_of_ants.insects;

import life_of_ants.Colony;
import life_of_ants.Util;

public class Wasp extends Insect{

    public void introduceSelf() {
        communicate("I'm a Wasp hurr durr!");
    }

    public void spendAnHour(Colony colony) {
        wreakHavoc(colony);
    }

    private void wreakHavoc(Colony colony) {
        communicate("REEEEEEEEEEEEEEEEEEEEEEE");

        for (Insect pleb : colony.getInsectsInColony()) {
            pleb.freeze();
        }
    }

    public Wasp() {
        posX = Util.getIntegerBetween(10, 20);
        posY = Util.getIntegerBetween(5, 10);
    }
}
