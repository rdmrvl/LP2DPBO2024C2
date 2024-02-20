
// Saya Marvel Ravindra Dioputra [2200481] LatPrak2 Java dalam Mata Kuliah DPBO 
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String idProduct;
    String name;
    String brand;
    String price;

    public Product(String idProduct, String name, String brand, String price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getId() {
        return idProduct;
    }

    public void setId(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

class Clothing extends Product {
    String size;
    String material;
    String gender;

    public Clothing(String idProduct, String name, String brand, String price, String size, String material, String gender) {
        super(idProduct, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Shirt extends Clothing {
    String color;
    String sleeveType;

    public Shirt(String idProduct, String name, String brand, String price, String size, String material, String gender, String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }
}

public class Main {
    public static void main(String[] args){
        List<Shirt> shirts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah baju: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Masukan Data " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Price: ");
            String price = scanner.nextLine();
            System.out.print("Size: ");
            String size = scanner.nextLine();
            System.out.print("Material: ");
            String material = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Sleeve Type: ");
            String sleeveType = scanner.nextLine();

            Shirt shirt = new Shirt(id, name, brand, price, size, material, gender, color, sleeveType);
            shirts.add(shirt);
        }
        
        System.out.println("+----+--------------+--------------+--------------+--------------+---------+");
        System.out.println("| No |     ID       |     Name     |    Brand     |    Price     |  Size   |");
        System.out.println("+----+--------------+--------------+--------------+--------------+---------+");
        int i = 1;
        for (Shirt shirt : shirts) {
            System.out.printf("| %-2d | %-12s | %-12s | %-12s | %-12s | %-7s |\n",
                    i, shirt.getId(), shirt.getName(), shirt.getBrand(), shirt.getPrice(), shirt.getSize());
            i++;
        }
        System.out.println("+----+--------------+--------------+--------------+--------------+---------+");        
    }
}
