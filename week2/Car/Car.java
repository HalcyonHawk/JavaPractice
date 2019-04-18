
class Car {
    String brand;
    String registration;
    String colour;
    int regYear;

    Car(String brand, String registration, String colour, int regYear){
        this.brand = brand;
        this.registration = registration;
        this.colour = colour;
        this. regYear = regYear;
    }

    //get
    String getBrand() {
        return brand;
    }

    String getRegistration() {
        return registration;
    }

    String getColour() {
        return colour;
    }

    int getRegYear() {
        return regYear;
    }

    //set
    void setBrand(String brand){
        this.brand = brand;
    }

    void setRegistration(String registration){
        this.registration = registration;
    }

    void setColour(String colour){
        this.colour = colour;
    }

    void setRegYear(int regYear){
        this.regYear = regYear;
    }
    
    //registration time of car- 3 years 
    //checks if car is currently registered
    boolean isCurrentlyRegistered(int currentYear){
        return currentYear >= regYear && currentYear <= regYear + 3;
    }
    
    //returns number of years car is registered for. meaningless if car is not registered 
    int yearsRegisteredFor(int currentYear){
        return currentYear - regYear;
    }
}
