## TP8 - Implementasi GUI Swing dan MVC

### 1. Screenshot Tampilan Utama
1.Screenshot 2026-10-24 170020.png
2.Screenshot 2026-10-24 174343.png

### 2. Aliran Data (MVC)
Aliran data diawali dari `Main.java` yang menginisialisasi data karakter dan menyimpannya di kelas `CharacterManager` (Model). Kelas `CharacterManager` melakukan pengolahan data serta perhitungan statistik seperti rata-rata level melalui method `getAverageLevel()`. Selanjutnya, `Main` mengambil data karakter dan hasil perhitungan tersebut, lalu meneruskannya ke kelas `MainWindow` (View) saat pembuatan objek untuk ditampilkan di GUI secara dinamis.

### 3. Daftar Karakter Baru
* **Mercy (Type: HEALER, Level: 6):** Ditambahkan untuk melengkapi keberagaman peran (*class*) dalam tim dengan tipe pendukung (*support*). Level 6 dipilih agar memiliki HP dasar yang cukup bertahan.
* **Guts (Type: WARRIOR, Level: 8):** Ditambahkan sebagai petarung garis depan berkekuatan tinggi. Level 8 memberikan statistik Attack Power dasar yang dominan dibandingkan karakter lainnya.

### 4. Link Dokumen Analisis (Google Docs)
https://docs.google.com/document/d/1syxcy1OQiJscazuqWfPLM-i-lcLtojSy9JkoJzlrMng/edit?usp=sharing