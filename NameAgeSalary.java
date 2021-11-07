import java.util.Scanner;

public class NameAgeSalary
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);

        String name;
        int age;
        double salary;
        
        System.out.println("Hello. What is your name?");
        name = Keyboard.next();

        System.out.println(" ");
        System.out.println("Hi, " + name + "! How old are you?");
        age = Keyboard.nextInt();

        if (age >= 18)
        {
            System.out.println(" ");
            System.out.println("So you're " + age + ", eh? That's not old at all!");
            System.out.println("How much do you make, " + name + "?");
            salary = Keyboard.nextDouble();
        
            System.out.println(" ");
            System.out.println(salary + "! I hope that's per hour and not per year!");
        } else
        {
            System.out.println("Sorry, I think you can't have official job");
        }

        Keyboard.close();

        

    }
}