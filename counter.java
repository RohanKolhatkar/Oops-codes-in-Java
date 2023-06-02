import java.util.Collection;
import java.util.function.Predicate;

public class counter {
    public static <T> long countIf(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                         .filter(predicate)
                         .count();
    }
}