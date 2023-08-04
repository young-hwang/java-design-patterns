package io.github.younghwang.hfdesignpattern.homesweethometheater.leastknowledge;

// method call 가능한 경우
// Least Knowledge
// - The object itself
// - Objects passed in as a parameter to the method
// - Any object the method creates or instantiates
// - Any components of the object
public class Car {
    Engine engine;

    public Car() {
    }

    public void start(Key key) {
        Doors doors = new Doors();
        // object passed as a parameter
        boolean authorized = key.turns();
        if (authorized) {
            // component of the object
            engine.start();
            // local method within the object
            updateDashboardDisplay();
            // object you create or instantiate
            doors.lock();
        }
    }

    private void updateDashboardDisplay() {

    }
}
