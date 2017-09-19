import java.io.IOException;
    import java.net.URL;
    import java.util.Scanner;
public class lab3 {
     /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {
        String testString = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int wordCount = 1;
        for (int i = 0; i < testString.length(); i++)
        {
            if (testString.charAt(i) == ' ')
            {
                wordCount++;
            }
        }
        int occurenceCount = 0;
        for (int j = 0; j < testString.length(); j++) {
            if (testString.contains("prince")) {
                occurenceCount += 1;
               
            }
        }
        System.out.println(testString);
        System.out.println(wordCount);
        System.out.println(occurenceCount);
    }
}
