package inheritance;

import java.util.LinkedList;

public interface Reviewable {

    public void addReview(Review review);

    public void updateStars();

    public String reviewtoString();

}