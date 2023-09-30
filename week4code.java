// Coding project for week 4 written by Liam Andrus

import java.util.*;

public class week4code {
	
	//13. Method that takes a int base and int power and returns the
	// the value of the base raised to that power.
	public static int exponentiator(int base, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		return result;
	}
	
	
	//12. Method that returns a boolean true if another bool is true and a double is sufficient
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	
	//10. Method that takes the average of an array of doubles
	public static double averageDbl(List<Double> list) {
		double total = 0;
		for (double n : list) {
			total += n;
		}
		return (total /= list.size());
	}
	
	
	/*11. Method that takes two arrays of double and returns true if the average
	 * of the elements in the first array is greater than the average of the elements 
	 * in the second array.
	 */
	public static boolean foobar (List<Double> arr1, List<Double> arr2) {
		double avg1 = averageDbl(arr1);
		double avg2 = averageDbl(arr2);
		return avg1 > avg2;
	}
	
	
	//9. Method that sums a list of integers and returns whether the sum is more than 100.
	public static boolean moreThanHundred(List<Integer> list) {
		int total = 0;
		for (int n : list) {
			total += n;
		}
		return total > 100;
	}
	
	//8. Method that takes two strings and combines them into a single string with a space between them.
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//7. method that takes a string and an int and returns 
	//   a new string that is the original string n number of times.
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

	
	
	
	public static void main(String[] args) {
		// Step 1a: create an array of ints and add the following values
		List<Integer> ages = new ArrayList<>();
	
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
	
		//subtract first element from last element and print
		System.out.println("the first element subtracted from the last elements is: " + (ages.get(ages.size() - 1) - ages.get(0)));
		System.out.println(ages + "\n");
		
		//Step 1b: repeat previous steps but for a new array with 9 elements
		List<Integer> numArr = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			numArr.add(i);
		}
		System.out.println("the first subtracted from minus the last elements is: " + (numArr.get(numArr.size() - 1) - numArr.get(0)));
		System.out.println(numArr + "\n");
		
		//Step 1c: iterate through new array and find average
		int average = 0;
		for (int age : numArr) {
			average += age;
		}
		average /= numArr.size();
		System.out.println("The average age of the new array is: " + average + "\n");
		
		//----------------------------------------------------------------------------
		
		//Step 2
		List<String> names = new ArrayList<>();
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
		
		//2a: iterate through names array and find average name length
		int nameAvg = 0;
		for (String name : names) {
			nameAvg += name.length();
		}
		nameAvg /= names.size();
		System.out.println(names);
		System.out.println("The average number of letters per name is: " + nameAvg + "\n");
		
		//2b: iterate through array and concat all names with spaces between
		String allNames = "";
		for (String name : names) {
			allNames += (name + " ");
		}
		System.out.println("All the names is the list are the following: " + allNames);
		
		//3. To access the last element of an array, access the index at (array.size() - 1)
		System.out.println("Accessing the last element of array example: names.get(array.size() - 1) == " + names.get(names.size() - 1) );
		
		//4. To access the first element in an array, simple access the 0 index
		System.out.println("Accessing the first element of array example: names.get(0) == " + names.get(0) + "\n");
		
		//5. create array of ints where each int is the length of a name in 
		List<Integer> nameLengths = new ArrayList<>();
		for (String n : names) {
			nameLengths.add(n.length());
		}
		
		//6. add all elements in nameLengths and print to console
		int nameTotal = 0;
		for (int n : nameLengths) {
			nameTotal += n;
		}
		System.out.println("The summ of the lengths of all the names is: " + nameTotal + "\n");
		
		System.out.println("The word Hello multiplied 3 times is: " + (multiplyString("Hello", 3)) + "\n");
		
		System.out.println("-------------- tests for methods --------------- \n");
		
		String tempName = fullName("Andrew", "Johnson");
		
		System.out.println("fullName() test: \n first name = Andrew, last name = Johnson, full name = " + tempName + "\n");
		
		List<Integer> testArr = new ArrayList<>();
		testArr.add(3);
		testArr.add(94);
		testArr.add(4);
		
		System.out.println("moreThanHundred() test: \n array = " + 
							testArr + " result: " + moreThanHundred(testArr) + "\n");
		
		List<Double> testDblArr = new ArrayList<Double>();
		testDblArr.add(3.71);
		testDblArr.add(2.42);
		testDblArr.add(0.93);
		System.out.println("averageDbl() test: \n array = " + 
				testDblArr + " result: " + averageDbl(testDblArr)+ "\n");
		
		List<Double> testDbl2 = new ArrayList<>();
		testDbl2.add(1.17);
		testDbl2.add(10.50);
		testDbl2.add(3.33);
		
		
		System.out.println("foobar() test: \n array 1 = " + 
				testDblArr + "\n array 2 = " + testDbl2 + "\n result: " + foobar(testDblArr, testDbl2)+ "\n");
		
		boolean isHot = true;
		System.out.println("willBuyDrink() test: \n money = " + 
				testDbl2.get(2) + "\n isHotOutside = " + isHot + "\n result: " + willBuyDrink(isHot, testDbl2.get(2))+ "\n");
		
		int base = 3;
		int power = 3;
		
		System.out.println("exponentiator() test: \n base = " + 
				base + "\n power = " + power + "\n result: " + exponentiator(base, power));
		
		
		
		
	}
}