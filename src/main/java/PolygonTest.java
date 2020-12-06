import java.util.Scanner;

public class PolygonTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter number of sides N and their length L : ");
		int N = input.nextInt();		
		double L = input.nextDouble();		

	
		System.out.print("Enter a color: ");
		String color = input.next();

		
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		
		RegularPolygon regularPolygon1 = new RegularPolygon(N,L); // default values
		regularPolygon1.setColor(color);
		regularPolygon1.setFilled(filled);

		System.out.println(regularPolygon1.toString());
		System.out.println("Area: " + regularPolygon1.getArea());
		System.out.println("Perimeter: " + regularPolygon1.getPerimeter());
		System.out.println("Color: " + regularPolygon1.getColor());
		System.out.println("Triangle is" + (regularPolygon1.isFilled() ? "" : " not ") 
			+ "filled");
		RegularPolygon regularPolygon2 = new RegularPolygon(6,4,0,0);
		RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
		
				System.out.println(regularPolygon2.toString());
		System.out.println("Area: " + regularPolygon2.getArea());
		System.out.println("Perimeter: " + regularPolygon2.getPerimeter());
		System.out.println("Color: " + regularPolygon2.getColor());
		System.out.println("Triangle is" + (regularPolygon2.isFilled() ? "" : " not ") 
			+ "filled");
		
				System.out.println(regularPolygon3.toString());
		System.out.println("Area: " + regularPolygon3.getArea());
		System.out.println("Perimeter: " + regularPolygon3.getPerimeter());
		System.out.println("Color: " + regularPolygon3.getColor());
		System.out.println("Triangle is" + (regularPolygon3.isFilled() ? "" : " not ") 
			+ "filled");

	
	}
}
