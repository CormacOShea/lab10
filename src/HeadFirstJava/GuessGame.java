package HeadFirstJava;



public class GuessGame {
    Player p1;
    Player p2;              //GuessGame has three instance variables for the three Player objects
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();      //Create three player objects and assign them to the three Player instance variables
        p3 = new Player();

        int guessp1 =0;
        int guessp2 =0;         //Declare three variables to hold the three guesses the Players make
        int guessp3 =0;

        boolean p1isRight = false;
        boolean p2isRight = false;     //declare three variables to hold a true or false based on the player's answer
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);                //make a 'target' number that the players have to guess
        System.out.println("I'm thinking of a number between 0 and 9.....");

        while(true)
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();           //Each player's guess method
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);          //get each player's  guess (the result of their guess() method
                                                                         //running) by accessing the number variable of each player
            guessp3 = p3.number;
            System.out.println("Player 3 guessed " + guessp3);

            if(guessp1== targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a winner!!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
            } else{
                System.out.println("Players will have to try again,");
            }

    }

}
