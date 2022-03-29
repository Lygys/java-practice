public class Practice5_4 {
    public static void main(String[] args) {
    	System.out.println("底辺10,高さ5の三角形の面積: "+calcTriangleArea(10,5));
    	System.out.println("半径5の円の面積: "+calcCircleArea(5));
    }
    public static double calcTriangleArea(double bottom, double height) {
    	double area = bottom * height / 2;
    	return area;
    }
    public static double calcCircleArea(double radius) {
    	final double PI = 3.14;
    	double area = radius * radius * PI;
    	return area;
    }
}