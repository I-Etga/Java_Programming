package daily_videos.day38_exceptions;

class CustomCheckedException extends Exception { // checked

}

class CustomUncheckedException extends RuntimeException { //unchecked

}


public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException(); // this is checked exception.It has to be handled !!
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");

        throw new CustomUncheckedException();

    }
}
