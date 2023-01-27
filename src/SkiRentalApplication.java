import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class SkiRentalApplication {
    private List<Ski> skis;
    private List<Customer> customers;
    private List<Worker> workers;

    public SkiRentalApplication() {
        skis = new ArrayList<Ski>();
        customers = new ArrayList<Customer>();
        workers = new ArrayList<Worker>();
    }

    public List<Ski> getSkis() {
        return skis;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addSki(Ski ski) {
        skis.add(ski);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentSki(Customer customer, Ski ski, LocalDate startDate, LocalDate endDate) {
        for (Ski s : skis) {
            if (s.equals(ski) && s.getStatus().equals("available")) {
                s.setStatus("rented");
                s.setRentalStartDate(startDate);
                s.setRentalEndDate(endDate);
                s.setRentalCustomer(customer);
                break;
            }
        }
    }

    public void returnSki(Customer customer, Ski ski) {
        for (Ski s : skis) {
            if (s.equals(ski) && s.getRentalCustomer().equals(customer)) {
                LocalDate returnDate = LocalDate.now();
                s.setRentalEndDate(returnDate);
                calculateRentalFee(customer, s.getRentalStartDate(), returnDate);
                s.setStatus("available");
                s.setRentalCustomer(null);
                break;
            }
        }
    }

    public double calculateRentalFee(Customer customer, LocalDate startDate, LocalDate endDate) {
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        double rentalFee = daysBetween * customer.getSki().getPricePerDay();
        return rentalFee;
    }
}



