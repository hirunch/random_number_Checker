import java.util.Random;
import java.util.Scanner;

public class ch1 {

    public static void main(String[] args){


        System.out.println("Hello Welcome to Programme!");
        System.out.print("Enter Your Name: ");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        String username1 = userName.substring(0,1).toUpperCase() +userName.substring(1);
        System.out.println("Hello "+username1+"!");
        System.out.print(username1+" We Should Start game(Y/N): ");

        String startGame = scanner.next();
        String  startGame1 = startGame.substring(0,1).toLowerCase();
        if(startGame1.equals("y")){
            System.out.println("Start Game");
            Random random = new Random();
            int number = random.nextInt(10)+1;
            int a = 5;

            while(a<10){
                a++;
                System.out.print("Enter Positive Number(0 - 10): ");
                int userNumber = scanner.nextInt();

                if(userNumber == number){
                    System.out.println("You Win!");
                    break;

                }else if(userNumber > number){
                    System.out.println("Your Number Greater than Computer Number"+"You have "+(10-a)+"Chances Left");


                }else if(userNumber < number) {
                    System.out.println("Your number less than computer number"+"You have "+(10-a)+"Chances Left");
                }



            }if (a == 10){
                System.out.println("You Lose!");
            }

            System.out.println("Computer Number is: "+number);


        }else if(startGame1.equals("n")){

            System.out.println("Good Bye!");

        }else{
            System.out.println("Invalid Input");
        }



    }
}
