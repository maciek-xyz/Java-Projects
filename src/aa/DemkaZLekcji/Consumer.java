package aa.DemkaZLekcji;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
