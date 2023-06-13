package geometri;

public class Lingkaran {

    private double radius;

    public double Luas(){
        return (3.14 * Math.pow(radius,2));
    }
    public double Keliling(){
        return 2 * 3.14 * radius;
    }
}
