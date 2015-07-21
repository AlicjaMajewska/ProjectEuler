import java.util.ArrayList;
import java.util.List;

public class MultipliersList {

	public static List<Integer> getListMultipliers(int multiplier) {
		List<Integer> multiples = new ArrayList<Integer>();
		for (int i = 0; i < 5000; ) {
			multiples.add(new Integer(i));
			i += multiplier;
		}
		return multiples;
	}

	public static int getSumOfList(List<Integer> integerList) {
		Integer sum = new Integer(0);
		for (Integer integer : integerList) {
			sum += integer;
		}
		return sum;
	}
	public static long  calculateListOfMultipliesOf3or5(){
		return getSumOfList(getListMultipliers(3)) + getSumOfList(getListMultipliers(5));
	}
}
