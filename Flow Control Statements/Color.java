import java.util.Scanner;

class Color {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a color code: ");
        char code = in.next().trim().charAt(0);

        switch(code) {
            case 'R': System.out.println("Red"); break;
            case 'G': System.out.println("Green"); break;
            case 'B': System.out.println("Blue"); break;
            case 'O': System.out.println("Orange"); break;
            case 'Y': System.out.println("Yellow"); break;
            case 'W': System.out.println("White"); break;
            default: System.out.println("Invalid Code");
        }
    }
}
