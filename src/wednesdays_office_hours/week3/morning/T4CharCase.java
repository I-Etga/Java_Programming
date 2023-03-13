package wednesdays_office_hours.week3.morning;

public class T4CharCase {
    /*
    T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase
     */
    public static void main(String[] args) {

        char letter = '$';

        if(letter >= 'A' && letter <= 'Z'){ //if(letter >= 65 && letter <= 90)
            System.out.println(letter + " is uppercase");
        }

        if(letter >= 'a' && letter <= 'z'){ //if(letter >= 97 && letter <= 122)
            System.out.println(letter + " is lowercase");
        }

        System.out.println("----------------------------");

        char charLetter = '*';
        boolean isUpper = charLetter >= 'A' && charLetter <= 'Z';
        boolean isLower = charLetter >= 'a' && charLetter <= 'z';
        String result = charLetter + " is ";

        if(isUpper){
            result += "uppercase"; //result = result + "uppercase"
            // result = letter + " is uppercase";
        }

        if(isLower){
            result += "lowercase";
        }

        // !true -> false
        if(!isUpper && !isLower){   //!false && !false -> true && true -> true
            // this is for when the character is not a letter
            result += "not a valid letter";
        }

//        if(isUpper || isLower){
//            System.out.println(result);
//        } else {
//            System.out.println(charLetter + " is not a valid letter");
//        }

        System.out.println(result);

    }
}
