/**
 *
 * @author mmcintyr
 */
public class Main {

    public static void main(String[] args) {

        testGetDriverMessage();
        testCheckZip();
        testGetGeneration();
    }

    public static void testCheckZip(){
        System.out.println("Testing checkZip");

        System.out.println(Decisions.checkZip(79212));
    }

    public static void testGetDriverMessage() {
        //*** Driver Message
        System.out.println("\nTesting getDriverMessage:");
        System.out.printf("%-31s%4s  %s%n", "TEST CASES:", "YOURS", "PASS?");
        int[] limit = {35, 35, 35, 35, 20, 20, 20, 20, 75, 75, 75, 75};
        int[] speed = {20, 30, 35, 50, 50, 18, 5, 35, 60, 75, 80, 100};
        String[] ans = {
                "SLOW", "GOOD", "GOOD", "FAST", "FAST", "GOOD",
                "SLOW", "FAST", "SLOW", "GOOD", "GOOD", "FAST"};
        int x, y;
        String a, b, c;
        for (int i = 0; i < limit.length; i++) {
            x = limit[i];
            y = speed[i];
            a = ans[i];
            b = Decisions.getDriverMessage(x, y);
            c = a.equals(b) ? "YES" : "NO";
            System.out.printf("Limit: %03d Speed: %03d => %s  %4s   %s%n", x, y, a, b, c);
        }
    }

    public static void testGetGeneration() {
        int[] years = {1900,1915,1924,1925,1930,1950,1970,1990,2000,2024};
        String[] answer = {
                "Greatest Generation", "Greatest Generation",
                "Greatest Generation", "Silent Generation",
                "Silent Generation", "Baby Boom Generation",
                "Generation X", "Generation Y",
                "Generation Z", "Invalid birth year. Must be between 1900 and 2016"
        };

        int birthYear;
        String actualResult, expectedResult, result;
        for (int i = 0; i < years.length; i++){
            birthYear = years[i];
            expectedResult = answer[i];
            actualResult = Decisions.getGeneration(birthYear);
            result = expectedResult.equals(actualResult) ? "YES" : "NO";

            System.out.printf("Year: %04d, Expected: %s, Actual: %s  Result: %s\n", birthYear, expectedResult, actualResult, result);
        }
    }
}