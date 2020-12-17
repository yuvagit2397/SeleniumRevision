package interviewPreparation1;

public class practice {
public static void main(String[] args) {
	String arr[]= {"Switch","TV","switch","tv","switch","tv"};
	int h=0;
	int j=0;
	for (int i = 0; i < arr.length; i++) {
		String s=arr[i];
		if (s.equalsIgnoreCase("switch")) {
			String swi="";
			swi=s+h;
			System.out.println(swi);
			h++;
		}
		else {
			String tv="";
			tv=s+j;
			System.out.println(tv);
			j++;
			
		}
	}
	
}
}
