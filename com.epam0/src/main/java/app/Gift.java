package app;


	import java.util.ArrayList;

	import com.epam0.Production;
	import app1.Main;

	public class Gift {

		public static void getGift() {
			Gift gift = new Gift();
			ArrayList<Production> list = Main.setGift();
			gift.showGift(list);
			double sum = gift.getTotalCost(list);
			int heft = gift.getTotalWeight(list);
			double sSuga = gift.getTotalConSuga(list);

			System.out.printf("%37s %8s %8s %8s \t \n", "TOTAL" + "|", sum + "|", heft + "|",
					String.format("%.2f", sSuga) + "|");
			System.out.println("----------------------------------------------------------------");

			System.out.println();
			System.out.println("You were looking for sweets with a sugar content from " + Main.CONST_BY_SUGAR_1 + " to "
					+ Main.CONST_BY_SUGAR_2 + ".");
			System.out.println("The sweets found are marked with a \">\".");
			System.out.println();
			System.out.println("CAUTION:");
			System.out.println(
					"If you want to sort the table by other parameters, select them \nin the main class of the program.");

		}

		private void showGift(ArrayList<Production> list) {
			System.out.println();
			System.out.println("                        HEW YEAR'S GIFT                         ");
			System.out.println("----------------------------------------------------------------");
			System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", " No" + "|", "NAME" + "|", "TYPE" + "|", "COST" + "|",
					"WEIGHT" + "|", "CONTENT" + "|");
			System.out.println("----------------------------------------------------------------");
			int i = 1;
			for (Production value : list) {
				if (Main.CONST_BY_SUGAR_1 > value.getConsSuga() || Main.CONST_BY_SUGAR_2 < value.getConsSuga()) {
					System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", i + "|", value.getName() + "|",
							value.getType() + "|", value.getCost() + "|", value.getWeight() + "|",
							value.getConsSuga() + "|");
				} else {
					System.out.printf("%5s %15s %15s %8s %8s %8s \t \n", i + "|", value.getName() + "|",
							value.getType() + "|", value.getCost() + "|", value.getWeight() + "|",
							">" + value.getConsSuga() + "|");
				}
				i++;
			}
			System.out.println("----------------------------------------------------------------");
		}

		public double getTotalConSuga(ArrayList<Production> list) {
			double sumConSuga = 0;
			for (Production value : list) {
				sumConSuga += value.getConsSuga();
			}
			return sumConSuga;
		}

		public double getTotalCost(ArrayList<Production> list) {
			double sum = 0;
			for (Production value : list) {
				sum += value.getCost();
			}
			return sum;

		}

		private int getTotalWeight(ArrayList<Production> list) {
			int heft = 0;
			for (Production value : list) {
				heft += value.getWeight();
			}
			return heft;
		}
	}


