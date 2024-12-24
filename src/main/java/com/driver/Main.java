package com.driver;

public class Main {

   
    public static class Product {
        private String name;
        private double price;
        private int quantity;

        
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

 
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

         public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

         public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

         public double calculateTotalValue() {
            return price * quantity;
        }

         public void displayProductDetails() {
            System.out.println("Product Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Value: " + calculateTotalValue());
        }

        
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y,int z){
          return x*y*z;          
        }
        public double product(double x, double y){
          return x*y;
        }
    }

  
    public static void main(String[] args) {
        Product p = new Product("Smartphone", 699.99, 3);
        p.displayProductDetails();
        int result = p.product(4, 7);
        int result2 = p.product(3,20,8);
        double result3 = p.product(3.5,8.9);
     }
}
