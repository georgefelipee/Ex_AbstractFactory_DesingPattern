package br.com.gfelipe;

public class CompanyCarFactory extends Factory {

    @Override
    Car retrieveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
            return new Tesla(1000,"full","black");
            case "B":
                return new Audi(700,"mid Fuel", "blue");
            default:
                System.out.println("The requested car was unfortunately not available");
                return null;
        }
    }

}
