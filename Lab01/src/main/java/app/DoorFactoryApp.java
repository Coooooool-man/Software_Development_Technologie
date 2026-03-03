package app;

import app.api.Door;
import app.factory.DoorFactory;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class DoorFactoryApp {
    static void main(String[] args) {
        DoorFactory doorFactory = new DoorFactory();
        Door bathDoor = doorFactory.createDoor("bathroom", 12, 30);
        Door interiorDoor = doorFactory.createDoor("interior", 50, 100);

        print(bathDoor);
        println();

        print(interiorDoor);
        println();

        try {
            Door fooDoor = doorFactory.createDoor("foo", 12, 30);

        } catch (IllegalArgumentException e) {
            println(e);
        }

        try {
            Door fooDoor = doorFactory.createDoor("bath", 0, 30);

        } catch (IllegalArgumentException e) {
            println(e);
        }

        try {
            Door fooDoor = doorFactory.createDoor("bath", -12, 30);
        } catch (IllegalArgumentException e) {
            println(e);
        }

    }
}
