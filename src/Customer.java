import java.util.*;

public class Customer implements CustomerInterface{
    private String name;
    private String email;
    private long phone;
    private Ski ski;

    public Customer(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Ski getSki() {
        return ski;
    }

    public void setSki(Ski ski) {
        this.ski = ski;
    }

    @Override
    public List<Ski> browseListOfSki() {
        return null;
    }

    @Override
    public List<String> rentHistory() {
        return null;
    }

    @Override
    public String displayConfirmation() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
