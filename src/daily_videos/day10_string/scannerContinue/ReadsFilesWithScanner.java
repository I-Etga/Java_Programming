package daily_videos.day10_string.scannerContinue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadsFilesWithScanner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("src/daily_videos/day10_string/scannerContinue/Text.txt"));

        /*
                first step = click right and select copy path
                normally we use the absolute Path for any file
         BUT if the file which we want to make it read is in intelliJ, path from content root is enough !!
         */



            /*
            The more lines you want to read, the more you need to use that expression !!
             */
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());


        /*
            If I want to read the file word by word I use scanner.next() method
            It doesn't matter how many words and how many lines there are. They will be read IN ORDER !
                The more words you want to read, the more you need to use that expression -next()- !.
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
         */

        // System.out.println(scanner.hasNext()); --> returns boolean !! We'll see that later
        scanner.close();
    }
}
