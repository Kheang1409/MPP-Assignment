package assignment08.pack5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
//	String word;
//	@SuppressWarnings("unused")
//	ForEachExample(String word) {
//		this.word = word;
//	}
	public static void main(String[] args) {

	}

	public ForEachExample(String s) {
		System.out.println(s.toUpperCase());
	}
	private static void staticPrintUpper(String s){
		System.out.println(s.toUpperCase());
	}
	private void objectPrintUpper(String s){
		System.out.println(s.toUpperCase());
	}
	//implement a Consumer
	private static class UpperCase implements Consumer<String> {
		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}


	private void test(){
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
				"Away", "On Vacation", "Everywhere you want to be");
		List<MyClass> listMy = new ArrayList<>();
		listMy.add(new MyClass("B*****"));

		//print each element of the list in upper case format
		System.out.println("**Using Custom Consumer:**");

//		list.forEach(new UpperCase());

		ForEachExample f  = new ForEachExample("");

		list.forEach(ForEachExample::staticPrintUpper);
		list.forEach(f::objectPrintUpper);
		list.forEach(ForEachExample::new);
		list.forEach(String::toUpperCase);
	}
}