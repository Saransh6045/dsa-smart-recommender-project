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
        System.out.println("Enter topic: ");
        String topic = br.readLine();
        System.out.println("Enter difficulty: ");
        String difficulty = br.readLine();
        List<Problem> recommendedList = service.RecommendationService.recommend(lst, topic, difficulty);

        System.out.println("Recommended Problems: ");
        for (Problem p : recommendedList) {
            System.out.println(p);
        }


    }
}