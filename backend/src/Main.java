import model.Problem;
import data.ProblemRepository;

public class Main {
    public static void main(String[] args) {
        Problem p1 = new Problem(
            "Two Sum",
            "Arrays",
            "Easy",
            "https://leetcode.com/problems/two-sum"
        );

        System.out.println(p1);
    }
}