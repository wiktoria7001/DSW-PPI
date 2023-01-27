import java.util.*;

public interface WorkerInterface {
    void addSki(Ski ski);
    void removeSki (Ski ski);
    List<Ski> browseListOfSki();
}
