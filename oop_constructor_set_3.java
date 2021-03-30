import java.lang.Math;
import java.util.Random;
import java.util.Scanner;


class game {

    public int a;
    public int x;
    public int noOfGuess;

    // constructor generate the random number
    public game() {
        Random rand = new Random();
        this.a = rand.nextInt(100);
        System.out.println(a);
    }

    // take user input of the number
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number here:");
        this.x = sc.nextInt();
    }

    // check number is correct or not
    boolean isCorrectNumber() {
        noOfGuess++;
        if (this.x == a) {
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts", x, noOfGuess);
            return true;
        } else if (this.x > a) {
            System.out.println("Too High....");
        } else if (this.x < a) {
            System.out.println("Too Low....");
        }


        return false;
    }

    //guess the number
    public int getNooFGuesses() {
        return noOfGuess;
    }

    public void setNoOfGuesses() {
        this.noOfGuess = noOfGuess;
    }

}

public class oop_constructor_set_3 {
    public static void main(String[] args) {
        game s1 = new game();
        boolean b = false;
        while (!b) {
            s1.takeUserInput();
            System.out.println(b);
            b = s1.isCorrectNumber();
        }


    }
}
