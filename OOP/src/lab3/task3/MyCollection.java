package lab3.task3;

public interface MyCollection<T> {
	public boolean isEmpty();
	public int size();
	public boolean contains(Object o);
	public boolean add(T element);
	public boolean remove(Object o);
}
