class User {
private String nama;

    // Konstruktor untuk inisialisasi nama
    public User(String nama){
        this.nama = nama;
    }

    // Getter untuk mendapatkan nama
    public String getNama(){
        return nama;
    }

    // Setter untuk mengubah nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Tampilan output program
    public void show(){
        System.out.println("Selamat pagi "+nama);
    }
}
