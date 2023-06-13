package geometri;

public class Lingkaran {

    double radius;

    public double luas(){
        return (3.14 * Math.pow(radius,2));
    }
    public double keliling(){
        return 2 * 3.14 * radius;
    }
}
