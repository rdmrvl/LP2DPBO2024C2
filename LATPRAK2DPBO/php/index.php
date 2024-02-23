<!-- Saya Marvel Ravindra Dioputra [2200481] LatPrak2 PhP dalam Mata Kuliah DPBO 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php

// class parent dari class clothing
class Product {
    private $_idProduct; // inisialisasi atribut id produk
    private $_name;      // inisialisasi atribut nama produk
    private $_brand;     // inisialisasi atribut merk produk
    private $_price;     // inisialisasi atribut harga produk

    // konstruktor
    public function __construct($idProduct, $name, $brand, $price) {
        $this->_idProduct = $idProduct;
        $this->_name = $name;
        $this->_brand = $brand;
        $this->_price = $price;
    }

    // getter dan setter
    public function get_idProduct() {
        return $this->_idProduct;
    }

    public function set_idProduct($idProduct) {
        $this->_idProduct = $idProduct;
    }

    public function get_name() {
        return $this->_name;
    }

    public function set_name($name) {
        $this->_name = $name;
    }

    public function get_brand() {
        return $this->_brand;
    }

    public function set_brand($brand) {
        $this->_brand = $brand;
    }

    public function get_price() {
        return $this->_price;
    }

    public function set_price($price) {
        $this->_price = $price;
    }
}

// class parent dari class shirt
class Clothing extends Product {
    private $_size;     // inisialisasi atribut ukuran
    private $_material; // inisialisasi atribut material/bahan
    private $_gender;   // inisialisasi atribut gender

    // konstruktor
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender) {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->_size = $size;
        $this->_material = $material;
        $this->_gender = $gender;
    }

    // getter dan setter
    public function get_size() {
        return $this->_size;
    }

    public function set_size($size) {
        $this->_size = $size;
    }

    public function get_material() {
        return $this->_material;
    }

    public function set_material($material) {
        $this->_material = $material;
    }

    public function get_gender() {
        return $this->_gender;
    }

    public function set_gender($gender) {
        $this->_gender = $gender;
    }
}

// class cucu dari class product
class Shirt extends Clothing {
    private $_color;      // inisialisasi atribut warna
    private $_sleeveType; // inisialisasi atribut jenis/panjang lengan

    // konstruktor
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType) {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->_color = $color;
        $this->_sleeveType = $sleeveType;
    }

    // getter dan setter
    public function get_color() {
        return $this->_color;
    }

    public function set_color($color) {
        $this->_color = $color;
    }

    public function get_sleeveType() {
        return $this->_sleeveType;
    }

    public function set_sleeveType($sleeveType) {
        $this->_sleeveType = $sleeveType;
    }
}

// inisialisasi objek-objek shirt
$shirt1 = new Shirt("111", "T-Shirt", "Nike", "100000", "M", "Cotton", "Male", "Red", "Short");
$shirt2 = new Shirt("112", "Polo Shirt", "Adidas", "150000", "L", "Polyester", "Female", "Blue", "Long");
$shirt3 = new Shirt("113", "Dress Shirt", "Puma", "120000", "S", "Silk", "Male", "White", "Long");

echo "<table border='1'>";
echo "<tr><th>No</th><th>ID</th><th>Name</th><th>Brand</th><th>Color</th><th>Price</th><th>Size</th><th>Gender</th><th>Sleeve Type</th></tr>";
echo "<tr><td>1</td><td>" . $shirt1->get_idProduct() . "</td><td>" . $shirt1->get_name() . "</td><td>" . $shirt1->get_brand() . "</td><td>" . $shirt1->get_color() . "</td><td>" . $shirt1->get_price() . "</td><td>" . $shirt1->get_size() . "</td><td>" . $shirt1->get_gender() . "</td><td>" . $shirt1->get_sleeveType() . "</td></tr>";
echo "<tr><td>2</td><td>" . $shirt2->get_idProduct() . "</td><td>" . $shirt2->get_name() . "</td><td>" . $shirt2->get_brand() . "</td><td>" . $shirt2->get_color() . "</td><td>" . $shirt2->get_price() . "</td><td>" . $shirt2->get_size() . "</td><td>" . $shirt2->get_gender() . "</td><td>" . $shirt2->get_sleeveType() . "</td></tr>";
echo "<tr><td>3</td><td>" . $shirt3->get_idProduct() . "</td><td>" . $shirt3->get_name() . "</td><td>" . $shirt3->get_brand() . "</td><td>" . $shirt3->get_color() . "</td><td>" . $shirt3->get_price() . "</td><td>" . $shirt3->get_size() . "</td><td>" . $shirt3->get_gender() . "</td><td>" . $shirt3->get_sleeveType() . "</td></tr>";
echo "</table>";

?>
