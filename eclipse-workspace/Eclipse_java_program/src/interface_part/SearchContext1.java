package interface_part;

public interface SearchContext1 {
	public void findElement();
	default void start() {
		System.out.println("Start method implemented");
	}
	default void drive() {
		System.out.println("Drive method implented");
	}
}
