
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Shop shop= new Shop(new Person("Maham", "mahamiffi2002@gmail.com"),"Lahore");
         shop.ownerinfo();
         shop.address();

       
        Scanner sc = new Scanner(System.in);
        while(true) {
 System.out.println(" Enter 1 to add product\n Enter 2 for sale\n Enter 3 to remove product\n Enter 4 to Display\n Enter 5 to modify product\n Enter 6 to Search product\n Enter 7 to display Revenue\n");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;
                 case 3:
                  shop.removeProduct();
                 break;
                 case 4:
                 shop.Display();
                 break;
                 case 5:
                 shop.modifyProduct();
                break;
                 case 6:
                 shop.searchProduct();
                 break;
                 case 7:
                 shop.Showrevenue();
                 break;
                case 0:
                   System.exit(0);
                   break;
                default:
            }



        }



    }
}
