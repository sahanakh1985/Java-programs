package fruitexample;

public class Shop {
	Fruit sell(String name) {
		if (name.equals("Apple")) {
			Apple a = new Apple();

			return a;

		} else if (name.equals("Guava")) {
			Guava g = new Guava();
			return g;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		Shop s = new Shop();

		Fruit f = s.sell("Guava");// Fruit f=new Guava(); ,//up casting
		System.out.println(f);

		System.out.println(f.color);
		System.out.println(f.isSweet);
		System.out.println(f.name);

		if(f instanceof Apple a) {
	//	Apple a = (Apple) f; // down casting
		System.out.println(a);
		System.out.println(a.color);
		System.out.println(a.name);
		}else if(f instanceof Guava g) {
			System.out.println(g.color);
			System.out.println(g.name);
			System.out.println(g.isSweet);
		}

	}
}
