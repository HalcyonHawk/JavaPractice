class LittleDucks {
    static void main(){
        for(int n = 5; n > 0; n--) { 
            String word = "ducks";
            if (n == 1) {
                word = "duck";
            } else {
                word = "ducks";
            }          
            System.out.println(n + " little " + word + " went swimming one day");
            System.out.println("over the hills and far away");
            System.out.println("Mother duck said, \"Quack, quack, quack, quack,\"");
            if ((n-1) == 1){
                
            } elif ((n-1) == 0) {
                n = 5;
                break;
            }
            System.out.println("But only " + (n-1) + " little " + word + " came back");
            System.out.println();
        }
    }
}