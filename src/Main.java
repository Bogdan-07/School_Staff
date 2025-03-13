import java.util.Scanner;

public class Main {
    public static void main(String []Args) {

        Scanner scanner = new Scanner(System.in);
        StaffManager staffList = new StaffManager();

        boolean x = true;

        while(x) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("1. Add a staff member\n2. Get the staff member at the current index\n3. Remove the staff member at the current index\n4. Get all the staff members\n5. Go to the next staff member\n6. Go to the previous staff member\n7. Exit the code\n\n What do you want to do?: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.print("1. Add a Student\n2. Add a Janitor\n3. Add a Teacher\n4. Go back\n\n What do you want to do?: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            //Student sTemp = new Student();
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Valore non valido!");
                            break;

                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    x = false;
                    break;
                default:
                    System.out.println("Valore non valido!");
                    break;
            }
        }
    }
}