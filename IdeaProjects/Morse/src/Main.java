import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Character> morseAscii = new HashMap<>();

    static {
        morseAscii.put(".-", 'A');
        morseAscii.put("-...", 'B');
        morseAscii.put("-.-.", 'C');
        morseAscii.put("-..", 'D');
        morseAscii.put(".", 'E');
        morseAscii.put("..-.", 'F');
        morseAscii.put("--.", 'G');
        morseAscii.put("....", 'H');
        morseAscii.put("..", 'I');
        morseAscii.put(".---", 'J');
        morseAscii.put("-.-", 'K');
        morseAscii.put(".-..", 'L');
        morseAscii.put("--", 'M');
        morseAscii.put("-.", 'N');
        morseAscii.put("---", 'O');
        morseAscii.put(".--.", 'P');
        morseAscii.put("--.-", 'Q');
        morseAscii.put(".-.", 'R');
        morseAscii.put("...", 'S');
        morseAscii.put("-", 'T');
        morseAscii.put("..-", 'U');
        morseAscii.put("...-", 'V');
        morseAscii.put(".--", 'W');
        morseAscii.put("-..-", 'X');
        morseAscii.put("-.--", 'Y');
        morseAscii.put("--..", 'Z');
        morseAscii.put("-----", '0');
        morseAscii.put(".----", '1');
        morseAscii.put("..---", '2');
        morseAscii.put("...--", '3');
        morseAscii.put("....-", '4');
        morseAscii.put(".....", '5');
        morseAscii.put("-....", '6');
        morseAscii.put("--...", '7');
        morseAscii.put("---..", '8');
        morseAscii.put("----.", '9');
        morseAscii.put("/", ' ');
    }

    public static String paraAscii(String morseInput) {
        StringBuilder ascii = new StringBuilder();
        String[] morseascii = morseInput.split(" ");
        for (String morse : morseascii) {
            if (morseAscii.containsKey(morse)) {
                ascii.append(morseAscii.get(morse));
            }
        }
        return ascii.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el código Morse:");
        String morse = scanner.nextLine();
        String ascii = paraAscii(morse);
        System.out.println("Texto en ASCII: " + ascii);
    }
}