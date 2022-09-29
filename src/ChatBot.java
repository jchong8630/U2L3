import java.util.Scanner;

public class ChatBot {
    Scanner s = new Scanner(System.in);

    public void startChatBot()
    {
            display();
            String choice = s.nextLine();
            if (choice.equals("i") == true) {
                help();
            }
            if (choice.equals("w") == true) {
                weather();
            }
            if (choice.equals("d") == true) {
                System.out.println("Feet to Meters Conversion: ");
                double feet = s.nextDouble();
                feetToMeters(feet);
                distanceInfo();
            }
            if (choice.equals("g") == true) {
                goodbye();
            }
            if (choice.equals("f") == true) {
                System.out.println("What is your favorite number? ");
                int number = s.nextInt();
                favoriteNumber(number);
             }


    }

        public void greeting() {
        System.out.println("Hello, I am a chat bot!");
        System.out.println("How are you today?");
        System.out.println();
        System.out.println("i for info");
        System.out.println("w for weather");
        System.out.println("d for distance conversion");
        System.out.println("n for favorite number game");
        System.out.println("g for goodbye");
    }

        public void help() {
        System.out.println("You can ask me about the weather");
        System.out.println("You can tell me your favorite number");
        System.out.println("I can even convert feet to meters!");
    }

        public void weather() {
        System.out.println("I actually don't know much about the weather");
        System.out.println("But it is always warm and dry inside this computer.");
    }

        public void distanceInfo() {
        System.out.println("There are 5280 feet in a mile");
        System.out.println("There are " + feetToMeters(1) + "meters in a foot");
        System.out.println("There are " + feetToMeters(5280) + " meters in a mile");
    }

        public double feetToMeters(double feet) {
        double meters = feet * 0.3048;
        return meters;

    }

        public void goodbye() {
        System.out.println("It was nice talking with you.");
        System.out.println("Have a great day!");
    }

        public void favoriteNumber(int yourNumber) {
        System.out.println("My favorite number is 8");
        System.out.print("That is " );
        System.out.print(yourNumber - 8);
        System.out.println(" away from your number.");
    }


        public void display()
    {
        greeting();
    }
}
