
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int tracker = 1;
        int x = size / 2;
        int y = 0;
        int memoryx = 0;
        int memoryy = 0;

        while (tracker <= size * size) {
            if (y < 0) {
                y = size - 1;
            }
            if (x >= size) {
                x = 0;
            }
            if (square.readValue(x, y) != 0) {
                x = memoryx;
                y = memoryy;
                y++;
            }
            square.placeValue(x, y, tracker);
            memoryx = x;
            memoryy = y;
            x++;
            y--;
            tracker++;

        }

        return square;
    }

}
