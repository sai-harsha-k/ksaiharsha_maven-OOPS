package app1;
import java.util.ArrayList;
import com.epam0.Chocolate;
import com.epam0.Cookies;
import com.epam0.Marshmallow;
import com.epam0.Production;
import app.ChoisToSort;
import app.Gift;


public class Main {
	public static final int CONST_BY_SUGAR_1 = 20;
	public static final int CONST_BY_SUGAR_2 = 50;

	public static ArrayList<Production> list = new ArrayList<Production>();

	public static void main(String[] args) {
		Gift.getGift();
	}

	
	public static ArrayList<Production> setGift() {
		list.add(new Chocolate("Mars", "Chocolate", 0.99, 50, 29.58));
		list.add(new Chocolate("Snickers", "Chocolate", 1.55, 95, 44.32));
		list.add(new Cookies("Mulinelli", "Cookies", 1.95, 300, 201.21));
		list.add(new Cookies("Bonomi", "Cookies", 7.99, 500, 71.12));
		list.add(new Marshmallow("Zefirelle", "Marshmallow", 1.95, 230, 30.59));

		String typeOfSort_1 = "price"; 
		String typeOfSort_2="weight";
		String typeOfSort_3 = "content sugar";

		ChoisToSort.getSort(typeOfSort_1);

		return list;
	}


}
