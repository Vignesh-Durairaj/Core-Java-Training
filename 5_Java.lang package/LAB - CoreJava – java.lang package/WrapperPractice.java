package cg.javaflp.practice;

public class WrapperPractice {
	
	public static void main(String[] args) {
		
		// creating two Double object, and checking compareTo behavior
		Double firstDouble = 44.9;
		Double anotherDouble = 34.98;
		System.out.println("Double " + firstDouble.compareTo(anotherDouble));
		
		// creating two Float object, and checking compareTo behavior
		Float firstFloat = 34.1F;
		Float anotherFloat = 56.7F;
		System.out.println("Float " + firstFloat.compareTo(anotherFloat));
		
		// creating two Integer object, and checking compareTo behavior
		Integer firstInterger = 21;
		Integer anotherInteger = 12;
		System.out.println("Interger " + firstInterger.compareTo(anotherInteger));
		
		// creating two Byte object, and checking compareTo behavior
		Byte firstByte = 45;
		Byte anotherByte = 23;
		System.out.println("Byte " + firstByte.compareTo(anotherByte));
		
		// creating two Short object, and checking compareTo behavior
		Short firstShort = 67;
		Short anotherShort = 88;
		System.out.println("Short " + firstShort.compareTo(anotherShort));
		
		// creating two Long object, and checking compareTo behavior
		Long firstLong = 4568L;
		Long anotherLong = 76813L;
		System.out.println("Long " + firstLong.compareTo(anotherLong));
		
		// creating two Character object, and checking compareTo behavior
		Character c1 = 'a';
		Character c2 = 'd';
		System.out.println("Char " + c1.compareTo(c2));
		
		// creating two Boolean object, and checking compareTo behavior
		Boolean b1 = true;
		Boolean b2 = false;
		System.out.println("Boolean " + b1.compareTo(b2));
	}
}
