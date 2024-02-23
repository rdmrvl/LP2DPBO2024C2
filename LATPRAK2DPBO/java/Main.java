// Saya Marvel Ravindra Dioputra [2200481] LatPrak2 Java dalam Mata Kuliah DPBO 
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.ArrayList; //library unttuk arraylist
import java.util.List;      //library untuk linkedlist
import java.util.Scanner;   //library agar dapat menerima inputan user

//class parent dari class clothing
class Product {
    String idProduct;   //atribut id produk
    String name;        //atribut nama produk
    String brand;       //atribut merk produk
    String price;       //atribut harga produk

    public Product(String idProduct, String name, String brand, String price) {
        this.idProduct = idProduct; //inisialisasi id 
        this.name = name;           //inisialisasi nama
        this.brand = brand;         //inisialisasi merk
        this.price = price;         //inisialisasi harga
    }

    //getter dan setter untuk atribut diatas
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

//Class parent dari class shirt
class Clothing extends Product {
    String size;        //atribut ukuran baju
    String material;    //atribut material/bahan baju
    String gender;      //atribut untuk jenis kelamin preferensi pada baju

    public Clothing(String idProduct, String name, String brand, String price, String size, String material, String gender) {
        super(idProduct, name, brand, price);   //inisialisasi atribut dari class parent class Product
        this.size = size;           //inisialisasi ukuran baju
        this.material = material;   //inisialisasi material baju        
        this.gender = gender;       //inisialisasi jenis untuk jenis kelamin
    }

    //getter dan setter
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

//Class cucu dar class parent
class Shirt extends Clothing {
    String color;       //atribut warna baju
    String sleeveType;  //atribut jenis/panjang lengan

    public Shirt(String idProduct, String name, String brand, String price, String size, String material, String gender, String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);   //inisialisasi atribut dari class parent
        this.color = color;             //inisialisasi warna
        this.sleeveType = sleeveType;   //inisialisasi jenis/panjang lengan
    }

    //getter dan setter
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

//main
public class Main {
    public static void main(String[] args) {
        List<Shirt> shirts = new ArrayList<>();     //list untuk menampung data object class shirt inputan user
        Scanner scanner = new Scanner(System.in);   //menyiapkan scanner agar user dapat menginputkan masukan

        System.out.print("Masukan jumlah baju: ");
        int n = scanner.nextInt();      //input jumlah data yang ingin dimasukan
        scanner.nextLine();

        //memasukan setiap data object shirt kedalam list sebanyak "n" yang telah di inputkan
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

        //menampilkan data yang telah dimasukan kedalam list dalam bentuk tabel
        System.out.println("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+");
        System.out.println("| No |      ID      |     Name     |     Brand    |    Color     |    Price     |     Size     | Gender  | Sleeve Type |");
        System.out.println("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+");
        int i = 1;
        for (Shirt shirt : shirts) {
            System.out.printf("| %-2d | %-12s | %-12s | %-12s | %-12s | %-12s | %-12s | %-7s | %-11s |\n",
                    i, shirt.getId(), shirt.getName(), shirt.getBrand(), shirt.getColor(), shirt.getPrice(), shirt.getSize(), shirt.getGender(), shirt.getSleeveType());
            i++;
        }
        System.out.println("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+");
    }
}
