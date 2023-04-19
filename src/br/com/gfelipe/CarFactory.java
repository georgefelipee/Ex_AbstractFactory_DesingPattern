package br.com.gfelipe;

public class CarFactory extends Factory {

    Car retrieveCar(String requestGrade){
        switch (requestGrade){
            case "A":
                return new Volkswagen(500,"full","White");
            case "B":
                return new Toyota(350,"Full","Black");
            default:
                System.out.println("The requested car was unfortunately not available. ");
                return null;

        }
    }
}
