import java.util.ArrayList;
import java.util.List;

public class MultipliersList {

	public static List<Integer> getListMultipliers(int multiplier) {
		List<Integer> multiples = new ArrayList<Integer>();
<<<<<<< HEAD
		for (int i = 0; i < 1000; i += multiplier) {
			multiples.add(new Integer(i));
=======
		for (int i = 0; i < 1000; ) {
			multiples.add(new Integer(i));
			i += multiplier;
>>>>>>> secondBranch
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
		Integer sum = new Integer(0);
		sum += getSumOfList(getListMultipliers(3));
		sum += getSumOfList(getListMultipliers(5));
<<<<<<< HEAD
		return  sum;
=======
				return  sum;
>>>>>>> secondBranch
	}
}
