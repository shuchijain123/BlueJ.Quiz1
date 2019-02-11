import java.lang.StringBuilder;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        
        for (int i=valueToBeReversed.length(); i>0;i--){
        
        reverse = reverse+valueToBeReversed.charAt(i-1);
    }
        
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        
        return word.charAt(word.length()/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
        char [] charr = value.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<charr.length; i++){
            if (charr[i]!=charToRemove){
                sb.append(charr[i]);
                
                
                
            }
        }
            return sb.toString();
            
        }
        
    
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String [] strarr = sentence.split(" ");
        
            
            String last = strarr[strarr.length-1];
            
            
        
        
    
     
        return last;
}
}
