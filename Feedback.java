public class Feedback {
    private String feedbackID;
    private String studentID;
    private String comments;
    private int rating;

    public Feedback(String feedbackID, String studentID, String comments, int rating) {
        this.feedbackID = feedbackID;
        this.studentID = studentID;
        this.comments = comments;
        this.rating = rating;
    }

    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

