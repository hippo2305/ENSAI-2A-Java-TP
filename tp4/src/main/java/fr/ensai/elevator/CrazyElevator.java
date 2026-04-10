package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrazyElevator extends Elevator {
    private static Random random = new Random();
    
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }
 
    @Override
    /**
     * Moves the elevator to the next floor in its destination queue.
     * Because the elevator is  crazy, makes that the elevators moves only at a 1/3 probability.
     * 1 times out of 3, the elevator will also skip a floor and go directly to the next in the destinationQueue.
     */
    public void move() {
        double randomDouble = random.nextDouble();

        if (randomDouble < 0.33) {
            destinationQueue.removeFirst();
            super.move();
        } else if (randomDouble >= 0.66) {
            super.move();
        }
    }

    @Override
    /**
     * Makes that this method works only 1 time out of 2.
     */
    public int unloadPassengers(Floor floor) {
        double randomDouble = random.nextDouble();

        if(randomDouble < 0.5) {
            return super.unloadPassengers(floor);
        } else {
            return 0;
        }
    }

    @Override
    /**
     * Clear the passengers list if the elevator is full.
     */
    public void loadPassengers(Floor floor) {
        super.loadPassengers(floor);
        if (this.isFull()) {
            this.passengers.clear();
        }
    }
}
