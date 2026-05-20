package model;

//problem class to represent a coding problem with its title, topic, difficulty, and link
public class Problem {

    private String title;
    private String topic;
    private String difficulty;
    private String link;
    private boolean solved;

    // Constructor
    public Problem(String title, String topic, String difficulty, String link) {
        this.title = title;
        this.topic = topic;
        this.difficulty = difficulty;
        this.link = link;
        this.solved = false; 
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLink() {
        return link;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    // For printing
    public String toString() {
        return title + " | " + topic + " | " + difficulty;
    }
}