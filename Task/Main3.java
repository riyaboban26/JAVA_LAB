// Task 3 - Emergency Rescue Robot
// Demonstration of Abstract Class and Interfaces

// ================= INTERFACES =================

// Flyable Interface
interface Flyable {
    void fly();
}

// Swimmable Interface
interface Swimmable {
    void swim();
}

// Climbable Interface
interface Climbable {
    void climb();
}

// ================= ABSTRACT CLASS =================

abstract class RescueRobot {

    protected int robotId;
    protected String robotName;

    // Constructor
    public RescueRobot(int robotId, String robotName) {
        this.robotId = robotId;
        this.robotName = robotName;
    }

    // Concrete Method
    public void displayRobot() {
        System.out.println("----------------------------------------");
        System.out.println("Robot ID   : " + robotId);
        System.out.println("Robot Name : " + robotName);
    }

    // Concrete Method
    public void startMission() {
        System.out.println("Mission Started...");
    }

    // Abstract Method
    public abstract void performMission();
}

// ================= ROBOT CLASSES =================

// Drone Robot
class DroneRobot extends RescueRobot implements Flyable {

    public DroneRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying over the disaster area.");
    }

    public void performMission() {
        System.out.println("Mission : Air Surveillance and Victim Detection.");
    }
}

// Water Robot
class WaterRobot extends RescueRobot implements Swimmable {

    public WaterRobot(int id, String name) {
        super(id, name);
    }

    public void swim() {
        System.out.println("Swimming through flooded areas.");
    }

    public void performMission() {
        System.out.println("Mission : Water Rescue Operations.");
    }
}

// Mountain Robot
class MountainRobot extends RescueRobot implements Climbable {

    public MountainRobot(int id, String name) {
        super(id, name);
    }

    public void climb() {
        System.out.println("Climbing rocky mountains.");
    }

    public void performMission() {
        System.out.println("Mission : Mountain Rescue.");
    }
}

// Multi Rescue Robot
class MultiRescueRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    public MultiRescueRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying to reach inaccessible locations.");
    }

    public void swim() {
        System.out.println("Swimming across rivers.");
    }

    public void climb() {
        System.out.println("Climbing damaged buildings.");
    }

    public void performMission() {
        System.out.println("Mission : Earthquake Rescue and Multi-Purpose Rescue.");
    }
}

// ================= MAIN CLASS =================

public class Main3 {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      EMERGENCY RESCUE ROBOT SYSTEM");
        System.out.println("=========================================");

        // Abstract Class References

        RescueRobot robots[] = {

                new DroneRobot(101, "Sky Eye"),

                new WaterRobot(102, "River Guard"),

                new MountainRobot(103, "Rock Climber"),

                new MultiRescueRobot(104, "Ultimate Rescue")
        };

        for (RescueRobot robot : robots) {

            robot.displayRobot();
            robot.startMission();
            robot.performMission();

            if (robot instanceof Flyable) {
                ((Flyable) robot).fly();
            }

            if (robot instanceof Swimmable) {
                ((Swimmable) robot).swim();
            }

            if (robot instanceof Climbable) {
                ((Climbable) robot).climb();
            }

            System.out.println();
        }

        // Interface References

        System.out.println("=========================================");
        System.out.println("INTERFACE REFERENCE DEMONSTRATION");
        System.out.println("=========================================");

        Flyable flyRobot = new DroneRobot(201, "Air Scout");
        flyRobot.fly();

        Swimmable swimRobot = new WaterRobot(202, "Water Hero");
        swimRobot.swim();

        Climbable climbRobot = new MountainRobot(203, "Hill Master");
        climbRobot.climb();

        Flyable multiFly = new MultiRescueRobot(204, "Rescue One");
        multiFly.fly();

        Swimmable multiSwim = new MultiRescueRobot(204, "Rescue One");
        multiSwim.swim();

        Climbable multiClimb = new MultiRescueRobot(204, "Rescue One");
        multiClimb.climb();

        System.out.println("\nAll Rescue Robots Demonstrated Successfully.");
    }
}