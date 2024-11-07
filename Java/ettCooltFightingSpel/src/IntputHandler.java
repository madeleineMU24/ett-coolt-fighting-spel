import java.util.Scanner;

public class IntputHandler {


    public static int getIntFromInput(){
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            System.out.println("Choose a number");
            scanner.nextLine();
        }

        int i = scanner.nextInt();
        scanner.nextLine();
        return i;

    }




}
