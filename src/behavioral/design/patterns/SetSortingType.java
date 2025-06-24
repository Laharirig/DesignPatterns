package behavioral.design.patterns;

public class SetSortingType {
	
	private SortingStrategy sortingStrategy;

	public SetSortingType(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}
	
	public void sort(int[] array) {
		sortingStrategy.sort(array);
	}
	
}
