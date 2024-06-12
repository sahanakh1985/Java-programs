
public class WaterBottle {
	// instance(object)variable
	String color;// default value is null
	int sizeInLiters = 1;
	String brand = "Milton";

	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		System.out.println(w1.color);// null
		System.out.println(w1.sizeInLiters);// 1
		System.out.println(w1.brand);// Milton
		w1.color = "Green";
		System.out.println(w1.color);// Green
		System.out.println(w1);// we got hexadecimal address of an object

	}

}
