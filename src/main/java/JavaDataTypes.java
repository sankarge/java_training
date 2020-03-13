
public class JavaDataTypes {

    //primitives/keyword
    int x = 10;
    double y = 10d;
    float aFloat = 10;
    boolean aBoolean = false;
    short aShort = 1;
    byte aByte = 10;

    //Objects
    Object object = new Object();

    Integer integer = new Integer(10);
    Double aDouble = new Double(10);
    Float aFloatObject = new Float(10);
    String string = "123";
    Character character = 'a';
    Short aShortNumber = new Short("1");

    //String
    String string1 = "123";
    String string2 = new String("123");

    //Array
    int[] intArray = new int[] { 1, 2, 3, 4, 5 };
    Object[] objectArray = new Object[] { 1, '2', "", 1d, 1f, true };


//coding-convention
    //class-name
    // Starts with Capital + camel-case
    // noun
    //ex: Calculator, ScientificCalculator, Operator

    //method
    // starts small, camel-case
    // action, verb
    // doCalculation(), assert(), validate()

    // filed-name/variables
    // starts small, camel-case
    // result, value, score

    //getter/setters
    // filed-name/variables
    //getResult(), setResult()
    //getValue(), setScore()
    //boolean- isValid(), isEnabled()

    // Constants/static final
    // full-caps with underscores
    // private static final int NO_OF_ITERATIONS = 10;

}
