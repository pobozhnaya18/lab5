import java.util.Collection;
import java.util.NoSuchElementException;

public class Calculator {
    public double calculateAverage(Collection<Integer> collection)throws NoSuchElementException {
        return collection.stream().reduce((sum,value)->sum+value).get()/collection.size();
    }
}
