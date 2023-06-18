- pada package com.config
terdapat method connection() yang bertanggung jawab untuk membuat koneksi ke database menggunakan JDBC (Java Database Connectivity).


- pada config com.controller
terdapat method getDatabase() yang bertanggung jawab untuk mengambil data dari tabel tb_produk dalam database.
terdapat method insertDB(String product, Long i, Integer stok) yang bertanggung jawab untuk untuk menyisipkan (insert) data baru ke dalam tabel tb_produk.
terdapat method updateNamaDB(int id, String name), updateHargaDB(int id, Long harga), dan updateStokDB(int id, Integer stok) yang bertanggung jawab untuk memperbarui data dalam tabel tb_produk berdasarkan ID dengan mengubah nilai NAMA, HARGA, dan JUMLAH masing-masing.
terdapat method deleteDB(String nama) yang bertanggung jawab untuk menghapus data dalam tabel tb_produk berdasarkan NAMA.
terdapat method getProdukbyNama(String nama) yang bertanggung jawab untuk mengambil data produk berdasarkan NAMA dari tabel tb_produk.

- pada com.layouts
pada class DeleteData terdapat method showDeleteData() yang berfungsi untuk menghapus data.
pada class InsertData terdapat method showInsertData() yang berfungsi untuk menambahkan data baru.
pada class Menu terdapat method showMenu() yang berfungsi untuk menampilkan pilihan menu dan method SelectMenu() yang berfungsi untuk mengeksekusi angka menu yang diinput.
pada class ReadData terdapat method showReadData() yang berfungsi untuk menampilkan seluruh isi data.
pada class UpdateData terdapat method showUpdateData(String nama) yang bertanggung jawab untuk menampilkan menu pengeditan data produk dan method showEditNama(String nama), showEditHarga(String nama), dan showEditStok(String nama) ketiga metode ini bertanggung jawab untuk menampilkan menu dan menghandle pengeditan data nama, harga, dan jumlah (stok) produk.

- pada com.models
terdapat method main method yang berfungsi menjalankan program tersebut.