package geometri;

public class Main {

    public static void main(String[] args) {
        Lingkaran hibat1 = new Lingkaran();
        hibat1.radius = 20;
        
        PersegiPanjang hibat2 = new PersegiPanjang();
        hibat2.lebar = 5;
        hibat2.panjang = 10;
        
        
        System.out.println("Luas Lingkaran : " +hibat1.luas());
        System.out.println("Keliling Lingkaran : "+hibat1.keliling());
        System.out.println("Luas Persegi Panjang : "+hibat2.luas());
        System.out.println("Keliling Persegi Panjang : "+hibat2.keliling());
    }
    
}
