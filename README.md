# Aplikasi Penghitung Kata

## Deskripsi Program
Aplikasi ini adalah program GUI menggunakan Java Swing yang dapat menghitung jumlah kata, karakter, dan kalimat dalam teks yang diinput pengguna. Fitur utama aplikasi ini:

- Pengguna memasukkan teks menggunakan **JTextArea** yang terbungkus dalam **JScrollPane**.
- Setelah tombol "Hitung" ditekan, aplikasi menampilkan hasil perhitungan berupa jumlah kata dan karakter pada beberapa JLabel.
- Mendukung penghitungan secara **real-time** saat pengguna mengetik teks di JTextArea.

## Komponen GUI
Aplikasi ini menggunakan komponen berikut:

- `JFrame`: Jendela utama aplikasi.
- `JPanel`: Panel untuk tata letak komponen GUI.
- `JLabel`: Menampilkan hasil perhitungan (jumlah kata dan karakter).
- `JTextArea`: Input teks dari pengguna.
- `JScrollPane`: Membungkus JTextArea agar bisa di-scroll.
- `JButton`: Tombol untuk memulai perhitungan.

## Logika Program
Logika program menggunakan:

- **Manipulasi string**: Untuk menghitung jumlah kata dan karakter.
- **Ekspresi reguler**: Untuk memvalidasi teks dan menghitung jumlah kata secara lebih akurat.

## Events
Aplikasi ini menggunakan event handling sebagai berikut:

- **ActionListener**: Untuk menangani klik pada tombol "Hitung".
- **DocumentListener**: Untuk menghitung jumlah kata dan karakter secara **real-time** saat pengguna mengetik di JTextArea.

## Fitur Tambahan
- Menghitung jumlah **kalimat** dan **paragraf** dalam teks.
- Pencarian kata tertentu dalam teks (fungsi **Find**).
- Opsi untuk **menyimpan teks dan hasil perhitungan** ke dalam file.

## Cara Menggunakan
1. Masukkan atau tempelkan teks ke dalam JTextArea.
2. Klik tombol "Hitung" atau biarkan aplikasi menghitung secara real-time saat mengetik.
3. Hasil perhitungan akan ditampilkan di JLabel, termasuk jumlah kata dan karakter.
4. Gunakan fitur tambahan seperti pencarian kata atau simpan hasil ke file.

## Teknologi yang Digunakan
- **Java Swing**: Untuk antarmuka GUI.
- **Ekspresi Reguler (Regex)**: Untuk validasi dan manipulasi teks.
- **NetBeans IDE**: Pengembangan proyek dilakukan menggunakan NetBeans.

## Penulis
Muhammad Hidayat (2210010354)

## Lisensi
Tugas 5
