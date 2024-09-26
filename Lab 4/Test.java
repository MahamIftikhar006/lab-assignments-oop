
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Shop shop= new Shop(new Person("Maham", "email"),"Lahore");
        System.out.println("Enter 1 to add product, 2 for sale, 3 to delete and 4 to modify");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;
                case 0:
                   System.exit(0);
                   break;
                default:
            }



        }



    }
}
