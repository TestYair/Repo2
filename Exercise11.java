import java.util.Scanner;

/**
 * Created by yaird on 15/03/2017.
 */
public class Exercise11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the psychometric grade:");
        int x = s.nextInt();

        System.out.println("please enter the bagrut grade:");
        int y = s.nextInt();

        if (x >= 600 && y>=90) {
            System.out.println("Good for you have been accepted to the university!!!");
        }

        else if (x >= 600 && y<90){
            System.out.println("You need to improve your grade points in bagrut!!!");
        }

        else if (x < 600 && y>=90){
            System.out.println("You need to retake those tests!!!");
        }

        else {
            System.out.println("Sorry, you are not accepted to the university!!!");
        }

    }
}
