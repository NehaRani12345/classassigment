package basic_programs.java;

public class VovelConsonent {

	public static void main(String[] args) {
		char ch='A';
		if((ch=='a' || ch=='A')||(ch=='e' || ch=='E')||(ch=='i' || ch=='I')||(ch=='o' || ch=='O')||(ch=='u' || ch=='U')){
			System.out.println(ch+" is Vovel");
		}
		else if(ch==48){
			System.out.println(ch+ " is zero");
		}
		else{
			System.out.println(ch+ " is constant");
		}
	}

}
