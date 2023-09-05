import java.util.Random;
import java.util.Scanner;

public class Class_Test {
    public static void main(String[] args) {

        int programmes;
        Scanner sc = new Scanner(System.in);

        String Username = "Cat";
        String Password = "meoww";
        System.out.print("Enter your username: ");
        String username = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println(" Welcome to the system" + Username);

            System.out.println("Choose a program ");

            System.out.println("1. Calculator");
            System.out.println("2. Guessing Game");
            System.out.println("3. SI calculator");
            System.out.println("4. Vowel and Consonant");

            programmes = sc.nextInt();

            switch (programmes) {
                case 1 -> {    //Here I clicked on the suggestion and changed my switch to enhanced switch
                    System.out.print("Enter any Operations from here(+,-,*,/): ");
                    String operation = sc.next();
                    System.out.print("Enter First Number: ");
                    double first_num = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    double second_num = sc.nextDouble();
                    if (operation.equals("+")) {
                        System.out.println("The sum is:" + (first_num + second_num));
                    } else if (operation.equals("-")) {
                        System.out.println("The difference is:" + (first_num - second_num));
                    } else if (operation.equals("*")) {
                        System.out.println("The result is:" + (first_num * second_num));
                    } else if (operation.equals("/")) {
                        System.out.println("The division is:" + (first_num / second_num));
                    } else {
                        System.out.println("Operation Not Found");

                    }
                }
                case 2 -> {
                    Random random = new Random();
                    int number_Guess = random.nextInt(77) + 1;
                    System.out.println("Hello and Welcome to the Guessing Game!!!");
                    while (true) {
                        System.out.print("Guess the number (1-77): ");
                        int userGuess = sc.nextInt();

                        if (userGuess == number_Guess) {
                            System.out.println("Congratulations! You guessed the correct number.");
                            break;
                        } else if (userGuess < number_Guess) {
                            System.out.println("Try higher .");
                        } else {
                            System.out.println("Try lower");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Simple Interest Calculator");
                    System.out.println("Enter Principle: ");
                    double Principle = sc.nextDouble();
                    System.out.println("Enter Time");
                    double Time = sc.nextDouble();
                    System.out.println("Enter Rate");
                    double Rate = sc.nextDouble();
                    double Simple_interest = (Principle * Rate * Time) / 100;
                }
                case 4 -> {
                    System.out.println("Check to see if vowel or consonant");
                    System.out.println("Enter a character");
                    String chara = sc.next();
                    if (chara.length() == 1) {

                        switch (chara) {
                            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                                System.out.println("It is a Vowel ");
                                break;
                            default:
                                System.out.println("It is a Consonant");
                                break;

                        }


                    }else{
                        System.out.println("Enter only one valid character");
                    }

                }

                default -> System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Invalid Login!!! ... Try Again");
        }
    }
}





