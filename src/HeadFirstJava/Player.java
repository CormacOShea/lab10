package HeadFirstJava;

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Im guessing " + number);
    }
    public class GameLauncher {
        public static void main(String[] args) {
            GuessGame game = new GuessGame();
            game.startGame();
        }

    }
}



