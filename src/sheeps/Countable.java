/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package sheeps;

public interface Countable {
    void incrementCount();
    void resetCount();
    int getCount();
    String getCountString();
}

// An interface describes a capability
interface CanFly {
    static final int MAXIMUM_HEIGHT = 1000;
    void fly();
}

class Engine {
    void start() {}
    void stop() {}
}

class Vehicle {
    private Engine engine;
    void startEngine() {
        engine.start();
    }
    void stopEngine() {
        engine.stop();
    }
}
class Car extends Vehicle {}
class Ship extends Vehicle {}
class AirPlane extends Vehicle implements CanFly {
    public void fly() {}
}
class Lung {
    void breathe(){}
}
class Animal {
    Lung lung;
    void breathe() {
        lung.breathe();
    }
}
class Wings{}
class Bird extends Animal implements CanFly {
    Wings wings;
    public void fly(){}
}
class Fish extends Animal {}
class PersonWhoLovesToFlyThings {
    public void makeFly(CanFly thing) {
        thing.fly();
    }
}

