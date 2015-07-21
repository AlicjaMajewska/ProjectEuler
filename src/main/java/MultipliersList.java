import java.util.ArrayList;
import java.util.List;

public class MultipliersList {

	public static List<Integer> getListMultipliers(int multiplier) {
		List<Integer> multiplies = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i += multiplier) {
			multiplies.add(new Integer(i));
		}
		return multiplies;
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
