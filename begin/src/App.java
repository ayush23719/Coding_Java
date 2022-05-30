import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("Enter your Name");
        // String name = sc2.nextLine();
        // System.out.println(name + "\n");
        // System.out.println(age);
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        try{
            System.out.println(arr[6]);
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("Error");
        }
        System.out.println("Separate Line");
    }
}
