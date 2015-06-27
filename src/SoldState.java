/**
 * Created by alex on 26.06.2015.
 *
 */

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, machine already giving you agumball");
    }

    public void ejectQuarter() {
        System.out.println("Can't return your quarter, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumball!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    public String toString() {
        return "Dispensing a gumball";
    }
}
