package fr.ensai.elevator;

import java.util.Random;

public class CrazyElevator extends Elevator {
    private static Random random = new Random();
    
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }
 
    @Override
    public void move() {
        if (random.nextDouble() >= 1/3 & random.nextDouble() < 2/3 & !destinationQueue.isEmpty()) {
            destinationQueue.removeFirst();
            this.currentFloor = destinationQueue.removeFirst();
        } else if (random.nextDouble() >= 2/3 & !destinationQueue.isEmpty()) {
            this.currentFloor = destinationQueue.removeFirst();
        }
            
    }
}
