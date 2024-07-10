package oop;

// Polymorphism - many/multiple | forms -> uses inheritance
// Makes child classes more flexible

// Overriding
// Overriding allows you to grab the method which is the same concept but different function
// If you want to start a car, it will do so differently based on the car
// Makes everything more organized and easier to understand than having to create a different method name everytime

//Overloading -> multiple methods same name different arguments in the same class

import java.util.ArrayList;

// Covariance -> the ability of one class to substitute for another class in its inheritance chain
public class Main {
    public static void main(String[] args) {
        HondaCivic myCivic = new HondaCivic();
        ToyotaCorrola myToy = new ToyotaCorrola();

        myCivic.lockDoors(1);

        // Covariance -> can use the different subclasses as long as it is in the same chain
        ArrayList<Car> autos = new ArrayList<>();
        autos.add(myCivic);
        autos.add(myToy);

        // Can use a different type of Automobile as long as it is higher up in the chain
        Automobile myOtherCivc = new HondaCivic();
    }
}

class Automobile {
    public void start() {
        System.out.println("Automobile has started");
    }
}

class Car extends Automobile {
    @Override
    public void start() {
        System.out.println("Car has started");
    }
}

class HondaCivic extends Car{
    private boolean areDoorsLocked;

    //Overloading
    public void lockDoors(int doorContorlNumber) {
        this.areDoorsLocked = true;
        System.out.println("Honda Civic has locked doors " + doorContorlNumber);
    }

    // Overloading
    public void lockDoors(String doorContorlNumber) {
        this.areDoorsLocked = true;
        System.out.println("Honda Civic has locked doors " + doorContorlNumber);
    }

    public void start() {
        System.out.println("Honda has started using the key");
    }
}

class ToyotaCorrola extends Car {
    public void start() {
        System.out.println("Toyota has started using push to start");
    }
}

