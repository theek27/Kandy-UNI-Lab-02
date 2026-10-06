public class IT26102560Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;

        // width is 3/4 of length
        double length = (perimeter * 2.0) / 7.0;
        double width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}