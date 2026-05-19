import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Problem;
import java.util.List;
import data.ProblemRepository;

public class Main {
    public static void main(String[] args) throws IOException {
        //Main method to test the Problem class, how the problem is formed and if the constructor is working properly or not.
        /*Problem p1 = new Problem(
            "Two Sum",
            "Arrays",
            "Easy",
            "https://leetcode.com/problems/two-sum"
        );

        System.out.println(p1);*/

        //Main method to test the ProblemRepository class, to check if the problems are being stored properly and if the getAllProblems method is working properly or not.
        /*List<Problem> lst = ProblemRepository.getAllProblems();

        for (Problem p : lst) {
            System.out.println(p);
        }*/

        List<Problem> lst = ProblemRepository.getAllProblems();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Taking input of topics and difficulty level from the user to recommend problems based on those criteria.
        System.out.println("Available Topics: \n 1. Arrays \n 2. Strings \n 3. Linked Lists \n 4. Recursion \n 5. Stacks \n 6. Queues");
        System.out.println("Enter topic number: ");
        int topicNum = Integer.parseInt(br.readLine());
        if(topicNum<1 || topicNum>6){
            System.out.println("Invalid topic number. Please enter a number between 1 and 6.");
            return;
        }

        String[] topics = {"Arrays", "Strings", "Linked List", "Recursion", "Stack", "Queue"};
        String topic = topics[topicNum - 1];

        System.out.println("Available Difficulty Levels: \n 1. Easy \n 2. Medium \n 3. Hard");
        System.out.println("Enter difficulty: ");
        int difficultyNum = Integer.parseInt(br.readLine());
        if(difficultyNum<1 || difficultyNum>3){
            System.out.println("Invalid difficulty number. Please enter a number between 1 and 3.");
            return;
        }

        String[] difficulties = {"Easy", "Medium", "Hard"};
        String difficulty = difficulties[difficultyNum - 1];
        
        List<Problem> recommendedList = service.RecommendationService.recommend(lst, topic, difficulty);

        System.out.println("Recommended Problems: ");
        for (Problem p : recommendedList) {
            System.out.println(p);
        }


    }
}