package loops;

// import java.util.Scanner;

public class All_Lopps {
    public static void main(String args[]) {
        // Code for basic heart symbole
        int heartCodePoint = 0x2764;

        // Creating a string with the heart symbol using Unicode escape sequence
        String heartSymbol = new String(Character.toChars(heartCodePoint));

        // code for sad symbole
        // Unicode code point for the sad face emoji
        int sadFaceCodePoint = 0x1F622;

        // Creating a string with the sad face emoji using Unicode escape sequence
        String sadEmoji = new String(Character.toChars(sadFaceCodePoint));
        // ================================= Basic While Loops
        // =================================
        // Mostly Used For File Reading And Operations that where we
        // don't know ending of the loop .basically how many time i have to have run the
        // loop . Ex: File-Reading ,writting , database-operation
        // initializer for while loop

        // int i = 1;
        // while (i < 1001) {
        // System.out.println(" Sorry " + sadEmoji + " " + heartSymbol + " " + i + "
        // bar");
        // i++;
        // }
        // ================================= For Loop
        // ================================================
        // for (int i=0;i<5;i++){
        // System.out.println("Helllo");
        // }
        // ================================= Do While Loop
        // ================================================

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

    }
}
