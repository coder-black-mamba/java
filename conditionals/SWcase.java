package conditionals;

public class SWcase {
    public static void main(String args[]) {
        // ================================= switch case =================================
        // if a single value matters to multiple cases then we use switch case
        int day = 89;

        switch (day) {
            case 0:
                System.out.println("Sat");
                break;
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;

            default:
            System.out.println("Please Input Valid Number");
                break;
        }
    }
}
