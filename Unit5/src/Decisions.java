
/*
 * Name:
 * Teacher:
 * Period:
 */
/**
 * A class for practicing using decisions structures in Java
 */
public class Decisions {

    /**
     * Returns a message about a driver's speed status If the driver is going
     * more than 10 mph over the limit, return FAST If the driver is going more
     * than 10 mph under the limit, return SLOW Otherwise the driver is a good
     * driver, return GOOD
     *
     * @param limit the speed limit
     * @param speed the speed of the driver
     */
    public static String getDriverMessage(int limit, int speed) {
        int deltaSpeed = limit - speed;

        if (deltaSpeed < 10 && deltaSpeed >= -10)
            return "GOOD";
        if (deltaSpeed >= 10)
            return "SLOW";
        else
            return "FAST";
    }

    /** Returns the Texas major metropolitan area represented by a specified
     zip
     * code, using the first two digits of the zip
     * 75--- returns Dallas
     * 76--- returns Fort Worth
     * 77--- returns Houston
     * 78--- returns Austin
     * 79--- returns Amarillo
     * any other returns NONE (Not a Texas metropolitan area)
     * @param zipCode the zip code that is processed
     * @return the major metropolitan area that zip code represents
     */
    public static String checkZip(int zipCode) {
        /* TIPS: You can simplify the problem by considering only the first 2
         * digits of the zip code. If you like this idea, you need to first
         * isolate those digits.
         * You can either use integer division and store the first two as an int
         * OR you can use String.valueOf(zipCode) to turn it into a String,
         * then substring to get the first two as a String.
         * OR if you'd rather, you can use the entire number to determine
         * the metropolitan area
         */
        int zipCodePrefix = Integer.parseInt(Integer.toString(zipCode).substring(0,2));

        return switch (zipCodePrefix) {
            case 75 -> "Dallas";
            case 76 -> "Fort Worth";
            case 77 -> "Houston";
            case 78 -> "Austin";
            case 79 -> "Amarillo";
            default -> "NONE";
        };
    }

    /**
     * Returns the generation associated with a birth year
     * 1900 - 1924: Greatest Generation
     * 1925 - 1945: Silent Generation
     * 1946 - 1965: Baby Boom Generation
     * 1966 - 1979: Generation X
     * 1980 - 1994: Generation Y
     * 1995 - 2016: Generation Z
     * Precondition: birthYear will be between 1900 and 2016
     * inclusive
     *
     * @param birthYear the year of birth to check
     * @return the generation
     */
    public static String getGeneration(int birthYear) {
        //Check to see if we even have a valid birthYear before proceeding
        if (!isValidBirthYear(birthYear))
            return "Invalid birth year. Must be between 1900 and 2016";
        else {
            if (birthYear >= 1900 && birthYear <= 1924)
                return "Greatest Generation";
            else if (birthYear >= 1925 && birthYear <= 1945)
                return "Silent Generation";
            else if (birthYear >= 1946 && birthYear <= 1965)
                return "Baby Boom Generation";
            else if (birthYear >= 1966 && birthYear <= 1979)
                return "Generation X";
            else if (birthYear >= 1980 && birthYear <= 1994)
                return "Generation Y";
            else if (birthYear >= 1995 && birthYear <= 2016)
                return "Generation Z";
            else
                return "";
        }

    }

    /**
     *
     * @return true or false depending upon whether the birthYear is
     * between 1900 - 2016 (inclusive)
     */
    private static boolean isValidBirthYear(int birthYear) {

        return birthYear >= 1900 && birthYear <= 2016;
    }

    /**
     * Returns the testing room assignment based on a student's last name
     * A - D : B260A
     * E - Ma : B260B
     * Mc - Shah: B262
     * Shar - Z : B264
     * @param lastName the student's last name
     * @return the room assignment
     */
    public static String checkRoom(String lastName) {
        // Ensure that the string actually has a value
        if (!lastName.isEmpty() && !lastName.isBlank())
        {
            String firstCharacters = (lastName.length() >= 4 ? lastName.substring(0, 4) : lastName).toUpperCase();

            // Perform lexicographical (alphabetic) comparison for each range
            if (firstCharacters.compareTo("A") >= 0 && firstCharacters.compareTo("E") < 0)
                return "B260A";
            else if (firstCharacters.compareTo("E") >= 0 && firstCharacters.compareTo("MC") < 0)
                return "B260B";
            else if (firstCharacters.compareTo("MC") >= 0 && firstCharacters.compareTo("SHAH") <= 0)
                return "B262";
            else if (firstCharacters.compareTo("SHAR") >= 0 && firstCharacters.compareTo("Z") <= 0)
                return "B264";
            else
                return "UNKNOWN";
        }
        else return "Invalid input. Last name should have at least 1 character";
    }

    /**
     * Returns a String descriptor of an adult's weight status based on their
     * body mass index:
     * below 18.5: underweight
     * 18.5 to 24.9: normal
     * 25.0 - 29.9: overweight
     * 30.0 and above: obese
     * @param index the body mass index
     * @return a description of the weight status
     */

    public static String getWeightStatus(double index) {
        return "";

    }
}
