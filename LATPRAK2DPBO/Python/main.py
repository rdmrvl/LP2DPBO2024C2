# Saya Marvel Ravindra Dioputra [2200481] LatPrak2 Python dalam Mata Kuliah DPBO 
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# class parent dari class clothing
class Product:
    def __init__(self, idProduct, name, brand, price):
        self._idProduct = idProduct # inisialisasi atribut id produk
        self._name = name           # inisialisasi atribut nama produk
        self._brand = brand         # inisialisasi atribut merk produk
        self._price = price         # inisialisasi atribut harga produk

    # getter dan setter untuk atribut diatas
    def get_idProduct(self):
        return self._idProduct

    def set_idProduct(self, idProduct):
        self._idProduct = idProduct

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_brand(self):
        return self._brand

    def set_brand(self, brand):
        self._brand = brand

    def get_price(self):
        return self._price

    def set_price(self, price):
        self._price = price

# class parent dari class shirt
class Clothing(Product):
    def __init__(self, idProduct, name, brand, price, size, material, gender):
        super().__init__(idProduct, name, brand, price) # hubungan inheritance dari parent
        self._size = size           # inisialisasi atribut ukuran
        self._material = material   # inisialisasi atribut material/bahan
        self._gender = gender       # inisialisasi atribut gender

    # getter dan setter untuk atribut diatas
    def get_size(self):
        return self._size

    def set_size(self, size):
        self._size = size

    def get_material(self):
        return self._material

    def set_material(self, material):
        self._material = material

    def get_gender(self):
        return self._gender

    def set_gender(self, gender):
        self._gender = gender

# class cucu dari class product
class Shirt(Clothing):
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeveType):
        super().__init__(idProduct, name, brand, price, size, material, gender) # hubungan inheritance dari parent
        self._color = color             # inisialisasi atribut warna
        self._sleeveType = sleeveType   # inisialisasi atribut jenis/panjang lengan

    # getter dan setter untuk atribut diatas
    def get_color(self):
        return self._color

    def set_color(self, color):
        self._color = color

    def get_sleeveType(self):
        return self._sleeveType

    def set_sleeveType(self, sleeveType):
        self._sleeveType = sleeveType

# main
def main():
    shirts = [] # list untuk menampung data inputan user
    number_of_shirts = int(input("Masukan jumlah baju: "))  # masukan user untuk jumlah data yang diinginkan

    # perulangan untuk memasukan data untuk setiap objek "shirt"
    for i in range(number_of_shirts):
        print(f"Masukan Data {i + 1}:")
        id_ = input("ID: ")
        name = input("Name: ")
        brand = input("Brand: ")
        price = input("Price: ")
        size = input("Size: ")
        material = input("Material: ")
        gender = input("Gender: ")
        color = input("Color: ")
        sleeveType = input("Sleeve Type: ")

        shirt = Shirt(id_, name, brand, price, size, material, gender, color, sleeveType)
        shirts.append(shirt)

    # output data yang telah diinput dalam tabel
    print("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+")
    print("| No |      ID      |     Name     |     Brand    |    Color     |    Price     |     Size     | Gender  | Sleeve Type |")
    print("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+")

    for i, shirt in enumerate(shirts, start=1):
        print(f"| {i:>2} | {shirt.get_idProduct():>12} | {shirt.get_name():>12} | {shirt.get_brand():>12} | {shirt.get_color():>12} | {shirt.get_price():>12} | {shirt.get_size():>12} | {shirt.get_gender():>7} | {shirt.get_sleeveType():>11} |")

    print("+----+--------------+--------------+--------------+--------------+--------------+--------------+---------+-------------+")

if __name__ == "__main__":
    main()