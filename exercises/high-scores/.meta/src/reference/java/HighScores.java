import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;

class HighScores {
    private int[] highScores;
    public HighScores(int[] highScores) {
        this.highScores = highScores.clone();
    }

    int[] scores() {
        return highScores.clone();
    }

    int latest() {
        return highScores[highScores.length - 1];
    }

    int personalBest() {
        OptionalInt personalBest = Arrays.stream(highScores).max();
        return personalBest.orElse(0);
    }

    Integer[] personalTopThree() {
        Integer[] highestScores = Arrays.stream(highScores).boxed().toArray(Integer[]::new);
        sort(highestScores, Collections.reverseOrder());
        return copyOf(highestScores, Math.min(highScores.length, 3));
    }
}
