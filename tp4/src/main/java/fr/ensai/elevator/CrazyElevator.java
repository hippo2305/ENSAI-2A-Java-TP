package fr.ensai.elevator;

import java.util.Random;

public class CrazyElevator extends Elevator {
    private static Random random = new Random();
    
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }
 
    @Override
    public void move() {
        double randomDouble = random.nextDouble();
        if (randomDouble >= 1/3 & randomDouble < 2/3 & !destinationQueue.isEmpty()) {
            destinationQueue.removeFirst();
            this.currentFloor = destinationQueue.removeFirst();
        } else if (randomDouble >= 2/3 & !destinationQueue.isEmpty()) {
            this.currentFloor = destinationQueue.removeFirst();
        }
            
    }
}
