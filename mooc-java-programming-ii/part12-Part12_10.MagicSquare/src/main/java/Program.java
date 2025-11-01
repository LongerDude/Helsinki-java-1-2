
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        //MagicSquareFactory msFactory = new MagicSquareFactory();
        //System.out.println(msFactory.createMagicSquare(5));
        MagicSquare square = new MagicSquare(3);
        square.giveAllNumbers();
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());
    }
}
