
public class constants {
public static final int CM_TP_MTRS =100;
public static void main(String args[]) {
	int length_in_meters = 500;
	int width_in_meters = 400;
	int perimeter = 2*(length_in_meters + width_in_meters);
	System.out.println("The perimeter of the rectangle in CM = "+ perimeter/CM_TP_MTRS);
}
}
