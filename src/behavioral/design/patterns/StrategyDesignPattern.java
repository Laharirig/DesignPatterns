package behavioral.design.patterns;


public class StrategyDesignPattern {

	public static void main(String[] args) {

		SetSortingType s = new SetSortingType(new BubbleSort());
		s.sort(new int[]{12,23,43});
		SetSortingType s1 = new SetSortingType(new MergeSorting());
		s1.sort(new int[]{12,23,43});
		SetSortingType s2 = new SetSortingType(new QuickSorting());
		s2.sort(new int[]{12,23,43});
	}

}
