package models;

public class GameHistory {
    private long id;
    private String userName;
    private int countOfRight;
    private int countOfLeft;
    private int getCountOfQuestions;
    private String level;

    public GameHistory(long id, String userName, int countOfRight, int countOfLeft, int getCountOfQuestions, String level) {
        this.id = id;
        this.userName = userName;
        this.countOfRight = countOfRight;
        this.countOfLeft = countOfLeft;
        this.getCountOfQuestions = getCountOfQuestions;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCountOfRight() {
        return countOfRight;
    }

    public void setCountOfRight(int countOfRight) {
        this.countOfRight = countOfRight;
    }

    public int getCountOfLeft() {
        return countOfLeft;
    }

    public void setCountOfLeft(int countOfLeft) {
        this.countOfLeft = countOfLeft;
    }

    public int getGetCountOfQuestions() {
        return getCountOfQuestions;
    }

    public void setGetCountOfQuestions(int getCountOfQuestions) {
        this.getCountOfQuestions = getCountOfQuestions;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "GameHistory{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", countOfRight=" + countOfRight +
                ", countOfLeft=" + countOfLeft +
                ", getCountOfQuestions=" + getCountOfQuestions +
                ", level='" + level + '\'' +
                '}';
    }
}
