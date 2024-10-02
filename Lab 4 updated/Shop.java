
import java.util.Scanner;

public class Shop {


    private static Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productcount=0;

    private static double revenue;

static{
productList[productcount++]=new Product("Milk",200,17262);
productList[productcount++]=new Product("Cheese",300,102);
productList[productcount++]=new Product("Yogurt",130,16);
productList[productcount++]=new Product("Ice cream",550,2876);


}
     public void setOwner(Person on){
      this.owner=on;
}

public void setAddress(String ad){
this.address=ad;

}
public Person getOwner(){

return owner;
}

public String getaddress(){

return address;

}


    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        //this.productList = new Product[100];
    }

//generic function for id searching

public int find(String id){
for(int i=0;i<productcount;i++){

if(productList[i].getId() .equals(id)){
return i;
}}
return -1;

}

//Add product 
    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productcount++]=product;
       System.out.println(productcount);
     
        System.out.println("Product added");


    }
// Sale product

    public void sale(){
        System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID:");
        String id= scanner.nextLine();

       int index=find(id);
if (index != -1){

productList[index].setQuantity(productList[index].getQuantity()-1);
revenue+= productList[index].getPrice();
System.out.println("Successfull sale");

}

else {

System.out.println("Product not found");

}

    }


//Remove product

public void removeProduct(){
System.out.println("Remove product");
Scanner s=new Scanner(System.in);
System.out.println("Enter id:");
String id= s.nextLine();

int index=find(id);
if(index!= -1){ 

productList[index]=null;
System.out.println("Product removed");

}
else{
System.out.println("Product not found");
}

}

//Display function

public void Display(){

for(int i=0;i<productcount;i++){
if(productList[i]!=null){
System.out.println(productList[i]);
System.out.println("__________________");

}
}
}

//Modify function 

public void modifyProduct(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter id:");
String id= s1.nextLine();

int index=find(id);
if(index!= -1){
System.out.println("Enter new name:");
productList[index].setName(s1.nextLine());

System.out.println("Enter new price:");
productList[index].setPrice(s1.nextDouble());
System.out.println("Enter new quantity:");
productList[index].setQuantity(s1.nextInt());
System.out.println("successfully modified");
}
else{
System.out.println("Product not found");
}

}

//Search function 

public void searchProduct(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter id:");
String id= s1.nextLine();

int index=find(id);
if(index!= -1){
System.out.println(productList[index]);
System.out.println("Product searched");
}
else{
System.out.println("Product not found");
}

}

//revenue display

public void Showrevenue(){

System.out.println("The revenue is:"+revenue);

}

//owner display
public void ownerinfo(){

System.out.println("Owner info:"+new Person(owner.getName() ,owner.getEmail()));

}

//address display
public void address(){

System.out.println("Address:" +address);

}



}
