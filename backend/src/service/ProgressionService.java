package service;

import model.Problem;
import java.util.List;

public class ProgressionService 
{
    public static int getSolvedCount(List<Problem> problems, String topic, String difficulty) {

        int count = 0;

        for (Problem p : problems) {

            if (p.getTopic().equalsIgnoreCase(topic) && p.getDifficulty().equalsIgnoreCase(difficulty) && p.isSolved()) {
                count++;
            }
        }

        return count;
    }
}
