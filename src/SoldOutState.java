/**
 * Created by alex on 26.06.2015.
 *
 */

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void turnCrank() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void dispense() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public String toString() {
        return "Sold out";
    }
}
