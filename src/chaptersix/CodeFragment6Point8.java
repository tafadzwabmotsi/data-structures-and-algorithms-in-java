package chaptersix;

import java.util.Stack;

public class CodeFragment6Point8 {

    /**
     * Tests if every opening tag has a matching closing tag
     * in HTML string
     * @param html - the string with the HTML to be tested
     * @return a boolean value indicating if the HTML is valid
     * */
    public static boolean isHTMLMatched(String html){
        Stack<String> buffer = new Stack<>();


        // Find the first '<' character (if any)
        int j = html.indexOf('<');

        while(j != -1){

            // Find next '>' character
            int k = html.indexOf('>', j + 1);

            // Invalid tag
            if (k == -1){
                return false;
            }

            // Strip away <>
            String tag = html.substring(j + 1, k);


            // There is an opening tag
            if (!tag.startsWith("/")){
                buffer.push(tag);
            }

            // This is a closing tag
            else{

                // No tag to match
                if (buffer.isEmpty()){
                    return false;
                }

                // Mismatched tag
                if (!tag.substring(1).equals(buffer.pop())){
                    return false;
                }
            }

            // Find the next '<' character (if any)
            j = html.indexOf('<', k + 1);
        }

        // Were all opening tags matched
        return buffer.isEmpty();
    }
}
