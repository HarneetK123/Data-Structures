package ds.stack;

public class App {

	public static void main(String[] args) {
		//Stack s= new Stack(5);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		s.push(60);
//		s.push(70);
		
//		
//		while(!s.isEmpty()){
//			long value = s.pop();
//			System.out.println(value);
//		}

		System.out.println(reverse("123456789"));
	}
	
	public static String reverse(String str){
		Stack s= new Stack(str.length());
		for(int i=0; i< str.length();i++){
			s.push(str.charAt(i));
		}
		
		String strRev="";
		
		while(!s.isEmpty()){
			strRev += s.pop();
		}
		return strRev;
	}

}
