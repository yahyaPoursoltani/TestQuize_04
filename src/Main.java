import edu.sharif.test.quize.questions.BinaryCode;
import edu.sharif.test.quize.questions.BinaryDto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        BinaryCode binaryCode = new BinaryCode();
        BinaryDto binaryDto = binaryCode.binaryCode(-4);
        System.out.println("b = " + binaryDto.getB() + "/ s =  " +binaryDto.getS());
    }
}