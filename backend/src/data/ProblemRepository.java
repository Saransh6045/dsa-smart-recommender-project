package data;

import model.Problem;
import java.util.*;

public class ProblemRepository {
    public static List<Problem> getAllProblems(){
        //Making a list a store all the Problems currently available in the dataset.
        List<Problem> ProblemsList = new ArrayList<>();

        //Array Problems
        ProblemsList.add(new Problem("Two Sum", "Arrays", "Easy", "https://leetcode.com/problems/two-sum"));
        ProblemsList.add(new Problem("Best Time to Buy and Sell Stock", "Arrays", "Easy", "https://leetcode.com/problems/best-time-to-buy-and-sell-stock"));
        ProblemsList.add(new Problem("Contains Duplicate", "Arrays", "Easy", "https://leetcode.com/problems/contains-duplicate"));
        ProblemsList.add(new Problem("Move Zeroes", "Arrays", "Easy", "https://leetcode.com/problems/move-zeroes"));
        ProblemsList.add(new Problem("Maximum Subarray", "Arrays", "Medium", "https://leetcode.com/problems/maximum-subarray"));
        ProblemsList.add(new Problem("Product of Array Except Self", "Arrays", "Medium", "https://leetcode.com/problems/product-of-array-except-self"));
        ProblemsList.add(new Problem("Subarray Sum Equals K", "Arrays", "Medium", "https://leetcode.com/problems/subarray-sum-equals-k"));
        ProblemsList.add(new Problem("Container With Most Water", "Arrays", "Medium", "https://leetcode.com/problems/container-with-most-water"));
        ProblemsList.add(new Problem("3Sum", "Arrays", "Medium", "https://leetcode.com/problems/3sum"));
        ProblemsList.add(new Problem("Maximum Product Subarray", "Arrays", "Medium", "https://leetcode.com/problems/maximum-product-subarray"));
        ProblemsList.add(new Problem("Spiral Matrix", "Arrays", "Medium", "https://leetcode.com/problems/spiral-matrix"));
        ProblemsList.add(new Problem("Median of Two Sorted Arrays", "Arrays", "Hard", "https://leetcode.com/problems/median-of-two-sorted-arrays"));
        ProblemsList.add(new Problem("Longest Consecutive Sequence", "Arrays", "Hard", "https://leetcode.com/problems/longest-consecutive-sequence"));
        ProblemsList.add(new Problem("Trapping Rain Water", "Arrays", "Hard", "https://leetcode.com/problems/trapping-rain-water"));
        ProblemsList.add(new Problem("Sliding Window Maximum", "Arrays", "Hard", "https://leetcode.com/problems/sliding-window-maximum"));


        //String problems
        ProblemsList.add(new Problem("Minimum Window Substring", "Strings", "Hard", "https://leetcode.com/problems/minimum-window-substring"));
        ProblemsList.add(new Problem("Valid Palindrome", "Strings", "Easy", "https://leetcode.com/problems/valid-palindrome"));
        ProblemsList.add(new Problem("Valid Anagram", "Strings", "Easy", "https://leetcode.com/problems/valid-anagram"));
        ProblemsList.add(new Problem("Implement strStr()", "Strings", "Easy", "https://leetcode.com/problems/implement-strstr"));
        ProblemsList.add(new Problem("Longest Common Prefix", "Strings", "Easy", "https://leetcode.com/problems/longest-common-prefix"));
        ProblemsList.add(new Problem("Longest Substring Without Repeating Characters", "Strings", "Medium", "https://leetcode.com/problems/longest-substring-without-repeating-characters"));
        ProblemsList.add(new Problem("Group Anagrams", "Strings", "Medium", "https://leetcode.com/problems/group-anagrams"));
        ProblemsList.add(new Problem("Longest Palindromic Substring", "Strings", "Medium", "https://leetcode.com/problems/longest-palindromic-substring"));
        ProblemsList.add(new Problem("String to Integer (atoi)", "Strings", "Medium", "https://leetcode.com/problems/string-to-integer-atoi"));
        ProblemsList.add(new Problem("Decode String", "Strings", "Medium", "https://leetcode.com/problems/decode-string"));
        ProblemsList.add(new Problem("Minimum Window Substring", "Strings", "Hard", "https://leetcode.com/problems/minimum-window-substring"));
        ProblemsList.add(new Problem("Edit Distance", "Strings", "Hard", "https://leetcode.com/problems/edit-distance"));
        ProblemsList.add(new Problem("Regular Expression Matching", "Strings", "Hard", "https://leetcode.com/problems/regular-expression-matching"));
        ProblemsList.add(new Problem("Longest Valid Parentheses", "Strings", "Hard", "https://leetcode.com/problems/longest-valid-parentheses"));
        ProblemsList.add(new Problem("Distinct Subsequences", "Strings", "Hard", "https://leetcode.com/problems/distinct-subsequences"));
        

        //Recursion problems
        ProblemsList.add(new Problem("Fibonacci Number", "Recursion", "Easy", "https://leetcode.com/problems/fibonacci-number"));
        ProblemsList.add(new Problem("Climbing Stairs", "Recursion", "Easy", "https://leetcode.com/problems/climbing-stairs"));
        ProblemsList.add(new Problem("Power of Two", "Recursion", "Easy", "https://leetcode.com/problems/power-of-two"));
        ProblemsList.add(new Problem("Reverse String", "Recursion", "Easy", "https://leetcode.com/problems/reverse-string"));
        ProblemsList.add(new Problem("Subsets", "Recursion", "Medium", "https://leetcode.com/problems/subsets"));
        ProblemsList.add(new Problem("Permutations", "Recursion", "Medium", "https://leetcode.com/problems/permutations"));
        ProblemsList.add(new Problem("Combination Sum", "Recursion", "Medium", "https://leetcode.com/problems/combination-sum"));
        ProblemsList.add(new Problem("Generate Parentheses", "Recursion", "Medium", "https://leetcode.com/problems/generate-parentheses"));
        ProblemsList.add(new Problem("Letter Combinations of a Phone Number", "Recursion", "Medium", "https://leetcode.com/problems/letter-combinations-of-a-phone-number"));
        ProblemsList.add(new Problem("Word Search", "Recursion", "Medium", "https://leetcode.com/problems/word-search"));
        ProblemsList.add(new Problem("Restore IP Addresses", "Recursion", "Medium", "https://leetcode.com/problems/restore-ip-addresses"));
        ProblemsList.add(new Problem("N-Queens", "Recursion", "Hard", "https://leetcode.com/problems/n-queens"));
        ProblemsList.add(new Problem("Sudoku Solver", "Recursion", "Hard", "https://leetcode.com/problems/sudoku-solver"));
        ProblemsList.add(new Problem("Expression Add Operators", "Recursion", "Hard", "https://leetcode.com/problems/expression-add-operators"));
        ProblemsList.add(new Problem("Palindrome Partitioning", "Recursion", "Hard", "https://leetcode.com/problems/palindrome-partitioning"));
        
        
        //Linked List problems
        ProblemsList.add(new Problem("Reverse Linked List", "Linked List", "Easy", "https://leetcode.com/problems/reverse-linked-list"));
        ProblemsList.add(new Problem("Merge Two Sorted Lists", "Linked List", "Easy", "https://leetcode.com/problems/merge-two-sorted-lists"));
        ProblemsList.add(new Problem("Linked List Cycle", "Linked List", "Easy", "https://leetcode.com/problems/linked-list-cycle"));
        ProblemsList.add(new Problem("Remove Duplicates from Sorted List", "Linked List", "Easy", "https://leetcode.com/problems/remove-duplicates-from-sorted-list"));
        ProblemsList.add(new Problem("Intersection of Two Linked Lists", "Linked List", "Easy", "https://leetcode.com/problems/intersection-of-two-linked-lists"));
        ProblemsList.add(new Problem("Add Two Numbers", "Linked List", "Medium", "https://leetcode.com/problems/add-two-numbers"));
        ProblemsList.add(new Problem("Remove Nth Node From End of List", "Linked List", "Medium", "https://leetcode.com/problems/remove-nth-node-from-end-of-list"));
        ProblemsList.add(new Problem("Copy List with Random Pointer", "Linked List", "Medium", "https://leetcode.com/problems/copy-list-with-random-pointer"));
        ProblemsList.add(new Problem("Sort List", "Linked List", "Medium", "https://leetcode.com/problems/sort-list"));
        ProblemsList.add(new Problem("Reverse Nodes in k-Group", "Linked List", "Medium", "https://leetcode.com/problems/reverse-nodes-in-k-group"));
        ProblemsList.add(new Problem("Merge k Sorted Lists", "Linked List", "Hard", "https://leetcode.com/problems/merge-k-sorted-lists"));
        ProblemsList.add(new Problem("Reverse Linked List II", "Linked List", "Hard",   "https://leetcode.com/problems/reverse-linked-list-ii"));                               
        ProblemsList.add(new Problem("Split Linked List in Parts", "Linked List", "Hard", "https://leetcode.com/problems/split-linked-list-in-parts"));
        ProblemsList.add(new Problem("Merge k Sorted Lists", "Linked List", "Hard", "https://leetcode.com/problems/merge-k-sorted-lists"));
        ProblemsList.add(new Problem("Reorder List", "Linked List", "Hard", "https://leetcode.com/problems/reorder-list")); 

        //Stack Problems
        ProblemsList.add(new Problem("Valid Parentheses", "Stack", "Easy", "https://leetcode.com/problems/valid-parentheses"));
        ProblemsList.add(new Problem("Min Stack", "Stack", "Easy", "https://leetcode.com/problems/min-stack"));
        ProblemsList.add(new Problem("Implement Queue using Stacks", "Stack", "Easy", "https://leetcode.com/problems/implement-queue-using-stacks"));
        ProblemsList.add(new Problem("Baseball Game", "Stack", "Easy", "https://leetcode.com/problems/baseball-game"));
        ProblemsList.add(new Problem("Evaluate Reverse Polish Notation", "Stack", "Medium", "https://leetcode.com/problems/evaluate-reverse-polish-notation"));
        ProblemsList.add(new Problem("Daily Temperatures", "Stack", "Medium", "https://leetcode.com/problems/daily-temperatures"));
        ProblemsList.add(new Problem("Next Greater Element I", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-i"));
        ProblemsList.add(new Problem("Next Greater Element II", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-ii"));
        ProblemsList.add(new Problem("Next Greater Element III", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-iii"));
        ProblemsList.add(new Problem("Daily Temperatures", "Stack", "Medium", "https://leetcode.com/problems/daily-temperatures"));
        ProblemsList.add(new Problem("Asteroid Collision", "Stack", "Medium", "https://leetcode.com/problems/asteroid-collision"));
        ProblemsList.add(new Problem("Reverse Polish Notation", "Stack", "Medium", "https://leetcode.com/problems/reverse-polish-notation"));
        ProblemsList.add(new Problem("Largest Rectangle in Histogram", "Stack", "Hard", "https://leetcode.com/problems/largest-rectangle-in-histogram"));
        ProblemsList.add(new Problem("Trapping Rain Water", "Stack", "Hard", "https://leetcode.com/problems/trapping-rain-water"));
        ProblemsList.add(new Problem("Basic Calculator", "Stack", "Hard", "https://leetcode.com/problems/basic-calculator"));

        //Queue Problems
        ProblemsList.add(new Problem("Implement Queue using Stacks", "Queue", "Easy", "https://leetcode.com/problems/implement-queue-using-stacks"));
        ProblemsList.add(new Problem("Number of Recent Calls", "Queue", "Easy", "https://leetcode.com/problems/number-of-recent-calls"));
        ProblemsList.add(new Problem("Recent Counter", "Queue", "Easy", "https://leetcode.com/problems/recent-counter"));
        ProblemsList.add(new Problem("Time Needed to Buy Tickets", "Queue", "Easy", "https://leetcode.com/problems/time-needed-to-buy-tickets"));
        ProblemsList.add(new Problem("Design Circular Queue", "Queue", "Medium", "https://leetcode.com/problems/design-circular-queue"));
        ProblemsList.add(new Problem("Design Circular Deque", "Queue", "Medium", "https://leetcode.com/problems/design-circular-deque"));
        ProblemsList.add(new Problem("Binary Tree Level Order Traversal", "Queue", "Medium", "https://leetcode.com/problems/binary-tree-level-order-traversal"));
        ProblemsList.add(new Problem("Course Schedule", "Queue", "Medium", "https://leetcode.com/problems/course-schedule"));
        ProblemsList.add(new Problem("Design Snake Game", "Queue", "Medium", "https://leetcode.com/problems/design-snake-game"));
        ProblemsList.add(new Problem("Task Scheduler", "Queue", "Medium", "https://leetcode.com/problems/task-scheduler"));
        ProblemsList.add(new Problem("Open the Lock", "Queue", "Medium", "https://leetcode.com/problems/open-the-lock"));
        ProblemsList.add(new Problem("Rotten Oranges", "Queue", "Medium", "https://leetcode.com/problems/rotten-oranges"));
        ProblemsList.add(new Problem("Minimum Number of Refueling Stops", "Queue", "Hard", "https://leetcode.com/problems/minimum-number-of-refueling-stops"));
        ProblemsList.add(new Problem("Design Twitter", "Queue", "Hard", "https://leetcode.com/problems/design-twitter"));
        ProblemsList.add(new Problem("Design Underground System", "Queue", "Hard", "https://leetcode.com/problems/design-underground-system"));
        
        return ProblemsList;
    }
}