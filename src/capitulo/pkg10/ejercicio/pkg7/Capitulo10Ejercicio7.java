package capitulo.pkg10.ejercicio.pkg7;

import java.io.IOException;

public class Capitulo10Ejercicio7 {

    public static void main(String[] args) throws IOException {
        CarRental c1=new CarRental("Luis","68100",SizeOfCar.economy,7);
        System.out.println(c1.display());
        CarRental c2=new CarRental("Juan","68150",SizeOfCar.fullsize,7);
        System.out.println(c2.display());
        c2.setSizeOfCar(SizeOfCar.midsize);
        System.out.println(c2.display());
        LuxuaryCarRental lc1=new LuxuaryCarRental("Pablo","68100",SizeOfCar.economy,7);
        System.out.println(lc1.display());
        LuxuaryCarRental lc2=new LuxuaryCarRental("Pepe","68100",SizeOfCar.economy,7);
        System.out.println(lc2.display());
    }
    
}
