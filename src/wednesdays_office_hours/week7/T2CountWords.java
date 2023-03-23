package wednesdays_office_hours.week7;

public class T2CountWords {
    /*
    T2CountWords [String, loop]
    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space
    Ex:
        input: "today is monday"
        output: 3
     */

            // #1 approach

    public static int countWords(String str){
        int spaces = 0; // int words = 1;
        str = str.trim();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                spaces++;
            }
        }
        return spaces + 1; // return words;
    }


                // #2 approach
    public static int countWords2(String str){ // "todayismonday"
        int words = 1;

        str = str.trim();

        while(str.contains(" ")){
            words++;
            str = str.replaceFirst(" ", ""); // delete the first space
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(countWords("hello world"));
        System.out.println(countWords("today's is java office hours"));
        System.out.println(countWords("word"));

        System.out.println();
        System.out.println(countWords2("hello world"));
        System.out.println(countWords2("today's is java office hours"));
        System.out.println(countWords2("word"));
    }

}
