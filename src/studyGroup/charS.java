package studyGroup;

public class charS {
    public static void main(String[] args) {

        System.out.println(getCharacterSet("digits"));

    }

    public static String getCharacterSet(String group){

        String allCharacters = ""; // '0'+ '1'+ ... '9' 0123456789
        char start;
        char end;

        switch (group.toLowerCase()){
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digits":
            case "numbers":
                start = '0';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return "Invalid group";
        }

        // String group digits => start '0' end '9'
                        //   '0'<= '9'

        /*
                    end '9'
        for( char ch = '1'; ch <= '9'; char++){
        allCharacters += ch;

        }
         */



        for(char letter = start; letter <= end; letter++){ // 'A'  end = 'Z'
            // System.out.print ((int)letter + " ");
            allCharacters += letter;
        }

        //System.out.println();

        return allCharacters;
    }

}
