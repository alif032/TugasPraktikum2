package praktikum;

public class Matematika implements MatematikaInterface{
    
    @Override
    public void pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil Pertambahan: " + hasil);
    }
    
    @Override
    public void pengurangan(int a, int b){
        int hasil = a - b;
        System.out.println("Hasil Pengurangan: " + hasil);
    }
      
    @Override
    public void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil Perkalian: " + hasil);
    }
    @Override        
    public void pembagian(int a, int b){
        int hasil = a / b;
        System.out.println("Hasil Pembagian: " + hasil);
    }
}
