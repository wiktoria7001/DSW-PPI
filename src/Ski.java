import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ski {
    private String brand;
    private String model;
    private int pricePerDay;
    private List<String> comments;
    private String status = "available";
    private Customer rentalCustomer;
    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;

    public Ski(String brand, String model, int pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.comments = new ArrayList<String>();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    boolean isAvailable() {
        return true;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getRentalCustomer() {
        return rentalCustomer;
    }

    public void setRentalCustomer(Customer rentalCustomer) {
        this.rentalCustomer = rentalCustomer;
    }

    public LocalDate getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(LocalDate rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public LocalDate getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDate rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

}
