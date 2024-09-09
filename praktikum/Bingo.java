package praktikum;

public class Bingo {

    String lirikSatu;
    String lirikDua;
    String lirikTerakhir;

    // Konstruktor menerima nama dog
    public Bingo(String lirikSatu, String lirikDua, String lirikTerakhir) {
        this.lirikSatu = lirikSatu;
        this.lirikSatu = lirikSatu;
        this.lirikDua = lirikDua;
        this.lirikTerakhir = lirikTerakhir;
    }

    // Method untuk mencetak lirik lagu
    public void cetakLagu() {
        // Cetak setiap bagian lagu secara manual
        
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println(lirikTerakhir);
        System.out.println();
        
        // Bagian dengan satu clap
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("(clap)-I-N-G-O");
        System.out.println("(clap)-I-N-G-O");
        System.out.println("(clap)-I-N-G-O");
        System.out.println(lirikTerakhir);
        System.out.println();
        
        // Bagian dengan dua clap
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println(lirikTerakhir);
        System.out.println();

        // Bagian dengan tiga clap
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println(lirikTerakhir);
        System.out.println();
        
        // Bagian dengan empat clap
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println(lirikTerakhir);
        System.out.println();

        // Bagian dengan lima clap
        System.out.println(lirikSatu);
        System.out.println(lirikDua);
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println(lirikTerakhir);
        System.out.println();

    }
}
