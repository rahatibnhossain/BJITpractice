package co.bjit.task;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface Highlight {
    String ser(String str);
    public static void go(){
        System.out.println("dffd");
    }
}
class Product{
     int  price, amount;
     String name, description;
     Product(String name, int price, int amount, String description){
         this.name=name;
         this.price=price;
         this.amount=amount;
         this.description=description;
     }
     public void show(){
         System.out.printf("Product Name : %s Price: %d Amount: %d Description: %s",name,price,amount,description);
         System.out.println();
     }
}
public class Cart {

    Scanner sc = new Scanner(System.in);
    static List<Product> ProductInCart = new ArrayList<Product>();
    public void search(){

        //Lambda Expression
        Highlight ref = (str) -> {
            String s =str.toUpperCase();
            return s;
        };


        System.out.println("Enter the name to search");
        String searchValue= sc.nextLine();

        //Lambda Stream
        ProductInCart.stream().filter((p) -> p.name.startsWith(searchValue))
                .forEach((p) -> {
                    String theName = p.name;
                    String highlightedName = ref.ser(searchValue)+ theName.substring(searchValue.length(),theName.length());

                    System.out.printf("Product Name : %s Price: %d Amount: %d Description: %s",highlightedName,p.price,p.amount, p.description);
                    System.out.println();
                });

    }


    public void addProducts(){
        List abc= addProduct();
        showProduct();
    }
    public static void showProduct() {
        for (Product p : ProductInCart){
            p.show();
        }
    }

    public static  List addProduct() {

        Scanner sc = new Scanner(System.in);

        int  price, amount;
        String name, description;

        System.out.println();
        System.out.println("Enter the number of product you want to add");
        int numbers =sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numbers; i++){

            System.out.println();
            System.out.print("Enter Product Name :");
            name = sc.nextLine();
            System.out.print("Enter Product Price :");
            price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Amount :");
            amount = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Description :");
            description = sc.nextLine();

            System.out.println();
            ProductInCart.add(new Product( name, price,  amount,  description));

        }

        return ProductInCart;

    }

    public void start(){

        int x;
        for (; ; ) {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("1 Add Products");
            System.out.println("2 Show Products");
            System.out.println("3 Search Product");
            System.out.println("0 Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter the option: ");

            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    addProducts();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    search();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String args[]){
        Cart cr = new Cart();
        cr.start();
    }

}
