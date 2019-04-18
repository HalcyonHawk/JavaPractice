
class AgeChecker {
    static void main() {
        double age = 19.5;
        
        if(age >= 18) {
            System.out.println("You're an adult");
        } else if(age >= 6) {
            System.out.println("You're a child");
        } else if(age >= 3) {
            System.out.println("You're a toddler");
        } else {
            System.out.println("You're a baby");
        }

    }
}