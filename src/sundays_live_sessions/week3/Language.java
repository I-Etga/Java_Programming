package sundays_live_sessions.week3;

public class Language {
    /*
    Language [switch]

	Declare and assign a language variable
	Based on the language selected print the related message:

	English: hello, thank for your call
	Spanish: hola, gracias para llamar
	Turkish: merhaba, aradiginiz icin tesekkurler
	Russian: privet, spasibo za vash zvonok
	French: Merci, pour votre appel
	Any other input: sorry, $given_language not supported

	Extra: add more languages support
     */
    public static void main(String[] args) {

        String language= "Spanish";

        switch (language){
            case "English":
                System.out.println("hello, thank for your call");
                break;
            case "Spanish":
                System.out.println("hola, gracias para llamar");
                break;
            case "Turkish":
                System.out.println("merhaba, aradiginiz icin tesekkurler");
                break;
            case "Russian":
                System.out.println("privet, spasibo za vash zvonok");
                break;
            case "French":
                System.out.println("Merci, pour votre appel");
                break;
            default:
                System.out.println("sorry " + language + " not supported");
        }

    }
}
