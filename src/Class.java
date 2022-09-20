import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int [] massive;

    public Class(int number, String word, int[] massive) {
        this.number = number;
        this.word = word;
        this.massive = massive;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public int[] getMassive() {
        return massive;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", massive=" + Arrays.toString(massive) +
                '}';
    }
}

