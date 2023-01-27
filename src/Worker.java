import java.util.List;

public class Worker implements WorkerInterface{
    private String name;
    private String password;

    public Worker(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void addSki(Ski ski) {

    }

    @Override
    public void removeSki(Ski ski) {

    }

    @Override
    public List<Ski> browseListOfSki() {
        return null;
    }

    public List<Ski> checkStockStatus(){
        return null;
    }

    public void enterCustomerDetails(Customer customer){

    }

    public void addComment(Ski ski, List<String> comments){
        ski.setComments(comments);
    }
}
