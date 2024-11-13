// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	  String name1, name2, name3;
      name1= args[0];
      name2= args[1];
      name3= args[2];
      String num= args[3];
      double total=  Double.parseDouble(num);
      total=Math.ceil(total/3);
     System.out.println("Dear "+ name3 + ", "+ name2 +", and "+ name1 + ": pay "+ total +" Shekels each");
	}
}
