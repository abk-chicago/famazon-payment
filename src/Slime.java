public class Slime {
    public static void main(String[] args) {
        String [] friends = {
                "Hana",
                "Karina",
                "Brian",
                "Dallas",
                "Miranda"
        }; // the ; is to end the statement
        // this is an array of Strings
        // aka String []
        // a list of strings
        // a collection of strings

        //loop thru every person in the array of names
        //list them in terminal

        // declare a counter (incrementer)
        // condition to evaluate to true
        // if true, do { block }
        // counter++; repeat

        for (int counter = 0; counter < friends.length; counter++) {
            System.out.println("Guess who's about to get slimed?");
            System.out.println(friends[counter] +"!");
            System.out.println("Get ready...");
            System.out.println("Go!");
            System.out.println(friends[counter] + " JUST GOT SLIMED!");
            System.out.println(" ____________________________ ");
        }
        // counter++ equals "counter+1"
        // System.out.println(friend[0]);
        // System.out.println(friend[1]);
    } // end for
}
