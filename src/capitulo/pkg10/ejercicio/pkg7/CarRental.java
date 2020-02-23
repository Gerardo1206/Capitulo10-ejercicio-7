package capitulo.pkg10.ejercicio.pkg7;

public class CarRental {
    private String rentersName;
    private String zipCode;
    private SizeOfCar sizeOfCar;
    private Double dialyRentalFee;
    private Integer rentalDays;
    private Double totalRentalFee;

    public CarRental(String rentersName, String zipCode, SizeOfCar sizeOfCar, Integer rentalDays) {
        this.rentersName = rentersName;
        this.zipCode = zipCode;
        this.sizeOfCar = sizeOfCar;
        this.rentalDays = rentalDays;
        switch(sizeOfCar){
            case economy:
                this.dialyRentalFee=29.99;
                break;
            case midsize:
                this.dialyRentalFee=38.99;
                break;
            case fullsize:
                this.dialyRentalFee=43.50;
                break;
        }
        this.totalRentalFee=this.dialyRentalFee*this.rentalDays;
        }
    public String display(){
    return "Car rental: "
            + "\nrentersName=" + rentersName
            + "\nzipCode=" + zipCode 
            + "\nsizeOfCar=" + sizeOfCar 
            + "\ndialyRentalFee=" + dialyRentalFee 
            + "\nrentalDays=" + rentalDays 
            + "\ntotalRentalFee=" + totalRentalFee;
    }

    public String getRentersName() {
        return rentersName;
    }

    public void setRentersName(String rentersName) {
        this.rentersName = rentersName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public SizeOfCar getSizeOfCar() {
        return sizeOfCar;
    }

    public void setSizeOfCar(SizeOfCar sizeOfCar) {
        this.sizeOfCar = sizeOfCar;
        switch(sizeOfCar){
            case economy:
                this.dialyRentalFee=29.99;
                break;
            case midsize:
                this.dialyRentalFee=38.99;
                break;
            case fullsize:
                this.dialyRentalFee=43.50;
                break;
        }
        this.totalRentalFee=this.dialyRentalFee*this.rentalDays;
    }

    public Double getDialyRentalFee() {
        return dialyRentalFee;
    }

    public void setDialyRentalFee(Double dialyRentalFee) {
        this.dialyRentalFee = dialyRentalFee;
    }

    public Integer getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(Integer rentalDays) {
        this.rentalDays = rentalDays;
    }

    public Double getTotalRentalFee() {
        return totalRentalFee;
    }

    public void setTotalRentalFee(Double totalRentalFee) {
        this.totalRentalFee = totalRentalFee;
    }


}