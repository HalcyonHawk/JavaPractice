
class TenGreenBottles {
    static void main() {
        for(int n = 10; n > 0; n--) {
            String word = "bottles";
            if (n == 1) {
                word = "bottle";
            } else {
                word = "bottles";
            } 
            System.out.println(n + " green " + word + ", hanging on the wall");
            System.out.println(n + " green " + word + ", hanging on the wall");
            if ((n - 1) == 1){
                word = "bottle";
            } else {
                word = "bottles";
            }            
            System.out.println("And if one green bottle ");
            System.out.println("should accidentally fall");
            System.out.println("There'll be " + (n-1) + " green " + word);
            System.out.println("hanging on the wall");
            System.out.println();
        }
    }
}