enum Color {
	RED,
	WHITE,
	BLUE
}

public class Solution {
	public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
		Color pivot = A.get(pivotIndex);
		
		/**
		Keep the following invarients during partitioning:
		bottom group: A.subList(0, smaller)
		middle group: A.sublist(smaller, equal)
		unclassified group: A.sublist(equal, larger)
		top group: A.sublist(larger, A.size())
		**/
		
		int smaller = 0, equal = 0, larger = A.size();
		
		//keep iterating as long as there is an unclassified element
		while (equal < larger) {
			//A.get(equal) is the incoming unclassified element
			if (A.get(equal).ordinal() < pivot.ordinal()) {
				Collections.swap(A, smaller, equal);
				smaller++;
				equal++;
			} else if (A.get(equal).ordinal() == pivot.ordinal()) {
				equal++;
			} else {
				//A.get(equal) > pivot
				Collections.swap(A, equal, --larger);
			}
		}
	}
}