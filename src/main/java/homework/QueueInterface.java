package homework;

public interface QueueInterface <Type>{

    public void add(Type item);
    public Type remove();
    public boolean isEmpty();
}
