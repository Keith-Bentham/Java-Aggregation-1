public class Weight {

	int pound;
	int ounce;

	public Weight(int p, int o) {
		pound = p;
		ounce = o;
	}

	public String toString() {
		return pound + "LB - " + ounce + " OZ";
	}

	public void reset(int p, int o) {
		pound = p;
		ounce = o;
	}

	public int convert_to_ounce() {
		return (pound * 16) + ounce;
	}
}
