package app;

public class ChoisToSort {
	public static void getSort(String value) {
		if (value == "price") {
			Compare.sortByCost();
		} else if (value == "weight") {
			Compare.sortByWeight();
		} else if (value == "content sugar") {
			Compare.sortByConsSuga();
		} else {

		}
		System.out.println("\n*The table is sorted by " + value + ".");
	}

}


