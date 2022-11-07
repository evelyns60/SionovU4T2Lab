public class StringLoops
{
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int idx = 0; idx < searchString.length(); idx ++) {
            if (character.equalsIgnoreCase(searchString.substring(idx, idx + 1))) {
                count ++;
            }
        }
        return count;
    }

    public String reverseString(String origString) {
        String reverseString = "";
        for (int idx = origString.length() - 1; idx >= 0; idx --) {
            reverseString += origString.substring(idx, idx + 1);
        }
        return reverseString;
    }

}
