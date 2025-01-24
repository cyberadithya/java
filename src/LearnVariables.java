public class LearnVariables {
    public static void main(String[] args) {
        // A string
        String myName = "Adithya Ganesh";
        System.out.println(myName);

        // An integer
        int myAge = 18;
        System.out.println(myAge);
        // Can also update values by changing them within the variable

        // A boolean using final (cannot be changed like mentioned earlier)
        final boolean isMale = true;
        System.out.println(isMale);

        //Can combine outputs using a variable
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");

        //A condition for stating when something should occur based on something else
        if (isMale){
            System.out.println("This message is letting you know I am a male");
        }

        //Can declare multiple variables of the same type in the same line using commas
        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z);

        //Can display and add variables to using (+) symbol between variables
        //Can assign the same value to multiple variables in one line

        //Identifiers: Have good variable names and use camelcase when naming (is case-sensitive)
        //Variables can have names that already exist for something else

        //Variable types: String, int, char, boolean, float, double (Primitive meaning built in) (Non-primitive meaning not built in)
        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes
        //Integer types: Whole numbers | Floating point types: Fractional parts

        //Cast variables by either widening or narrowing (Change the type of variable into another)

        //Operators are used to perform operations like adding or conditions on variables/values
        //Operator types: Arithmetic, assignment, comparison, logical, bitwise

        //Java strings: There are many methods that can be used for strings (concat, length, indexOf)
        //Can add strings together with the + between them or using concat. Strings concat. Integers add
        //Can include single and double quotes in a string by doing \" or \'

        //There are several methods within the java math library
        //Min, max, sqrt, abs, random || Random works like this
            // int randomNum = (int)(Math.random() * 101); Gets random num from 0 to 100

        //Boolean values takes true/false and comparison operators
        //Works with conditionals to take an action in one way if something and a different way if something else

        //Java If...Else
        //If, else, else if, switch
        //if (condition) {} || else if (condition) {} || else {}

    }
}
