package geotzinos.crowdgaming.Model;

/**
 * Created by George on 2016-05-29.
 */
public class Question {
    private int id;
    private String text;
    private double weight;
    private String creationDate;
    private double timeToAnswer;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public double getTimeToAnswer() {
        return timeToAnswer;
    }

    public void setTimeToAnswer(double timeToAnswer) {
        this.timeToAnswer = timeToAnswer;
    }

    public Question(int id, String text, double weight, String creationDate){
        this.id = id;
        this.text = text;
        this.weight = weight;
        this.creationDate = creationDate;
    }

}
