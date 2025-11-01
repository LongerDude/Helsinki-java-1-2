
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(79));
        System.out.println(msFactory.createMagicSquare(79).sumsOfColumns());
        System.out.println(msFactory.createMagicSquare(79).sumsOfDiagonals());
        System.out.println(msFactory.createMagicSquare(79).sumsOfRows());
    }
}
