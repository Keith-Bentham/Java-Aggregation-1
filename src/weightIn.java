public class weightIn {
	public static void main(String[] args) {
		Weight w = new Weight(3, 8);
		System.out.println("Original Amount: " + w.toString());
		w.reset(5, 6);
		System.out.println("New Amount:      " + w.toString());
		System.out.println("Total Amount in Ounces: " + w.convert_to_ounce());
	}
}
