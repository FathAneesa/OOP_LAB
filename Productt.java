import java.util.Scanner;
class Product
{
 int pcode,price;
 String pname;
 Product(int code,String name,int pr)
  {
   pcode=code;
   pname=name;
   price=pr;
  }
   
}

class Productt
 {
  public static void main(String args[])
   {
    Product product1=new Product(101,"crayons",45);
     int pcode,price;
     String pname;
     pcode=1002;
     pname="sketch pen";
     price=30;
     
      
    Product product2=new Product(pcode,pname,price);
    Scanner sc=new
    Scanner(System.in);
    System.out.println("Enter product code:");
    pcode=sc.nextInt();
    System.out.println("Enter product name:");
    pname=sc.next();
    System.out.println("Enter product price:");
    price=sc.nextInt();
    
   Product product3=new Product(pcode,pname,price);
     System.out.println("\n pcode:"+product1.pcode);
     System.out.println("\n pname:"+product1.pname);
     System.out.println("\n price:"+product1.price);
     
     System.out.println("pcode:"+product2.pcode);
     System.out.println("\n pname:"+product2.pname);
     System.out.println("\n price:"+product2.price);
    
     System.out.println("\n pcode:"+product3.pcode);
     System.out.println("\n pname:"+product3.pname);
     System.out.println("\n price:"+product3.price);
    
    System.out.println("\n Product having lowest price is:");
     
     if(product1.price<product2.price && product1.price<product3.price)
      {
       System.out.println("\n pcode:"+product1.pcode);
       System.out.println("\n pname:"+product1.pname);
       System.out.println("\n price:"+product1.price);
      }
      
     else if(product2.price<product1.price && product2.price<product3.price)
      {
        System.out.println("\n pcode:"+product2.pcode);
        System.out.println("\n pname:"+product2.pname);
        System.out.println("\n price:"+product2.price);
      }
      
      else
       {
         System.out.println("\n pcode:"+product3.pcode);
         System.out.println("\n pname:"+product3.pname);
         System.out.println("\n price:"+product3.price);
       }
    
    }
    
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
