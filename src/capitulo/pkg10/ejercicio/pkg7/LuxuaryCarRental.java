package capitulo.pkg10.ejercicio.pkg7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuxuaryCarRental extends CarRental{
    public LuxuaryCarRental(String rentersName, String zipCode, SizeOfCar sizeOfCar, Integer rentalDays) throws IOException{
        super(rentersName,zipCode,sizeOfCar,rentalDays);
        System.out.println("¿Desea un chofer?");
        System.out.println("1)si         2)no");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        Integer a = Integer.parseInt (br.readLine());
        if(a.equals(1)){
            super.setDialyRentalFee(279.99);
        }
        else{
            super.setDialyRentalFee(79.99);
        }
        super.setTotalRentalFee((super.getRentalDays()*super.getDialyRentalFee()));
    }

    @Override
    public String display() {
        return "Luxuary car: "
            + "\nrentersName=" + super.getRentersName() + ", "
            + "\nzipCode=" + super.getZipCode()
            + "\ndialyRentalFee=" + super.getDialyRentalFee()
            + "\nrentalDays=" + super.getRentalDays()
            + "\ntotalRentalFee=" + super.getTotalRentalFee();
    }
    
    
}
