# Computer Science 2 - Unit 5 - Lab Packet 1

This is a set of 5 methods to complete using decisions. You will do all of
your work in Decisions.java. Each method is a static method. **There are
no instance variables to work with**, just the parameters.

The Main tests each of the 5 methods, but you can work on them one at a
time in any order. Each method is set up to return empty String "" so that it
compiles and runs.

When you change the method body to perform the task, you will be able to see the test
cases in the output and check if you
wrote it properly.

The output for each method is labeled, and provides a list of test cases,
your output, a PASS indication of YES (correct) or NO (incorrect). If the
output contains any NO's in the PASS column, it is not correct.

Example:
```
Testing getDriverMessage:
TEST CASES:                    YOURS  PASS?
Limit: 035 Speed: 020 => SLOW  SLOW   YES
Limit: 035 Speed: 030 => GOOD  GOOD   YES
Limit: 035 Speed: 035 => GOOD  GOOD   YES
Limit: 035 Speed: 050 => FAST  FAST   YES
Limit: 020 Speed: 050 => FAST  FAST   YES
Limit: 020 Speed: 018 => GOOD  GOOD   YES
Limit: 020 Speed: 005 => SLOW  SLOW   YES
Limit: 020 Speed: 035 => FAST  FAST   YES
Limit: 075 Speed: 060 => SLOW  SLOW   YES
Limit: 075 Speed: 075 => GOOD  GOOD   YES
Limit: 075 Speed: 080 => GOOD  GOOD   YES
Limit: 075 Speed: 100 => FAST  FAST   YES
```

## Methods (all of this information is available in Decisions.java):

```java

/**
* Returns a message about a driver's speed status
* If the driver is going more than 10% over the limit, return FAST
* If the driver is going more than 10 mph under the limit, return SLOW
* Otherwise the driver is a good driver, return GOOD
* @param limit the speed limit
* @param speed the speed of the driver
*/
public static String getDriverMessage(int limit, int speed) {
    // TODO
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
    // TODO
}
    
/**
* Returns the generation associated with a birth year
* 1900 - 1924: Greatest Generation
* 1925 - 1945: Silent Generation
* 1946 - 1965: Baby Boom Generation
* 1966 - 1979: Generation X
* 1980 - 1994: Generation Y
* 1995 - 2016: Generation Z
* Precondition: birthYear will be between 1900 and 2016 inclusive
* @param birthYear the year of birth to check
* @return the generation
*/
public static String getGeneration(int birthYear) {
    // TODO
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
public static String checkRoom(String lastName){
    // TODO
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
    // TODO
}
```
