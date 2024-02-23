// Saya Marvel Ravindra Dioputra [2200481] LatPrak2 Python dalam Mata Kuliah DPBO 
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

#include <iostream> // library input output
#include <iomanip>  // library untuk setw (panjang pada tabel)
#include <vector>   // library untuk vector/list penampung
#include <string>   // library untuk tipe data strng

using namespace std;

// class parent dari class Product
class Product {
protected:
    string idProduct;   // inisialisasi atribut id produk
    string name;        // inisialisasi atribut nama produk
    string brand;       // inisialisasi merk produk
    string price;       // inisialisasi harga produk

public:
    Product(string id, string n, string b, string p) : idProduct(id), name(n), brand(b), price(p) {}

    // getter dan setter
    string getIdProduct() { return idProduct; }
    void setIdProduct(string id) { idProduct = id; }

    string getName() { return name; }
    void setName(string n) { name = n; }

    string getBrand() { return brand; }
    void setBrand(string b) { brand = b; }

    string getPrice() { return price; }
    void setPrice(string p) { price = p; }
};

// class parent dari class Clothing
class Clothing : public Product {
protected:
    string size;        // inisialisasi atribut ukuran
    string material;    // inisialisasi atribut bahan
    string gender;      // inisialisasi atribut gender

public:
    Clothing(string id, string n, string b, string p, string s, string m, string g) : Product(id, n, b, p), size(s), material(m), gender(g) {}

    //getter dan setter
    string getSize() { return size; }
    void setSize(string s) { size = s; }

    string getMaterial() { return material; }
    void setMaterial(string m) { material = m; }

    string getGender() { return gender; }
    void setGender(string g) { gender = g; }
};

// class cucu dari class Product
class Shirt : public Clothing {
protected:
    string color;       // inisialisasi atribut warna
    string sleeveType;  // inisialisasi atribut panjang/jenis lengan

public:
    Shirt(string id, string n, string b, string p, string s, string m, string g, string c, string st) : Clothing(id, n, b, p, s, m, g), color(c), sleeveType(st) {}

    //getter dan setter
    string getColor() { return color; }
    void setColor(string c) { color = c; }

    string getSleeveType() { return sleeveType; }
    void setSleeveType(string st) { sleeveType = st; }
};

// main
int main() {
    vector<Shirt> shirts;
    int jumlah;
    cout << "Masukan jumlah baju: ";
    cin >> jumlah;

    //input data produk
    for (int i = 0; i < jumlah; i++) {
        cout << "Masukan Data " << i + 1 << ":" << endl;
        string id, name, brand, size, material, gender, color, sleeveType, price;

        cout << "ID: "; cin >> id;
        cout << "Name: "; cin >> name;
        cout << "Brand: "; cin >> brand;
        cout << "Price: "; cin >> price;
        cout << "Size: "; cin >> size;
        cout << "Material: "; cin >> material;
        cout << "Gender: "; cin >> gender;
        cout << "Color: "; cin >> color;
        cout << "Sleeve Type: "; cin >> sleeveType;

        Shirt shirt(id, name, brand, price, size, material, gender, color, sleeveType);
        shirts.push_back(shirt);
    }

    //output data pada list dalam tabel
    cout << "+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+" << endl;
    cout << "| No |      ID      |     Name     |     Brand    |    Color     |    Price     |     Size     | Gender  | Sleeve Type |" << endl;
    cout << "+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+" << endl;

    for (int i = 0; i < shirts.size(); i++) {
        Shirt shirt = shirts[i];
        cout << "| " << setw(2) << i + 1 << " | " << setw(12) << shirt.getIdProduct() << " | " << setw(12) << shirt.getName() << " | " << setw(12) << shirt.getBrand() << " | " << setw(12) << shirt.getColor() << " | " << setw(12) << shirt.getPrice() << " | " << setw(12) << shirt.getSize() << " | " << setw(7) << shirt.getGender() << " | " << setw(11) << shirt.getSleeveType() << " |" << endl;
    }

    cout << "+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+" << endl;

    return 0;
}
