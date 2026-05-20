package service;

import model.Problem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RecommendationService {

    // Method to recommend problems based on topic and difficulty. It takes a list of problems, a topic, and a difficulty level as input and returns a list of recommended problems that match the criteria. The method iterates through the list of problems and checks if the topic and difficulty match the input parameters. If they do, the problem is added to the result list. The method returns a maximum of 5 recommended problems.
    public static List<Problem> recommend(List<Problem> Problems, String topic, String difficulty) 
    {
        List<Problem> result = new ArrayList<>();

        for (Problem p : Problems) {
            if (p.getTopic().equalsIgnoreCase(topic)
                    && p.getDifficulty().equalsIgnoreCase(difficulty) && !p.isSolved()) {

                result.add(p);

                if (result.size() == 5) break;
            }
        }
        // Shuffle the result list to provide a random selection of problems that match the criteria, instead of always returning the same set of problems in the same order.
        Collections.shuffle(result); 

        return result;
    }
}