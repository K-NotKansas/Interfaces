package ShortWordFilter;

public class ShortWordFilter implements Filter {
    private String word;

    public ShortWordFilter(String word) {
        this.word = word;
    }

    //@Override
    public boolean accept(Object x) {
        int wordlength = word.length();
        if (wordlength < 5){
            return true;
        }
        else {
            return false;
        }
    }
}