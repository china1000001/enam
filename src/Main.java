import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println(region.NARYN);
                break;
            case 2:
                System.out.println(region.OSH);
                break;
            case 3:
                System.out.println(region.JALALABAD);
                break;
            case 4:
                System.out.println(region.BATKEN);
                break;
            case 5:
                System.out.println(region.ISSYKKUL);
                break;
            case 6:
                System.out.println(region.CHUY);
                break;
            case 7:
                System.out.println(region.BISHKEK);
                break;
            default:
            if (a >= 8) {
                System.out.println("no");
            }else ;
        }
    }
}