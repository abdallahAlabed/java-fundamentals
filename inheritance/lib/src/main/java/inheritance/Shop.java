
import java.util.*;

public class Shop implements Reviewable {
  private String name;
  private String description;
  private double stars;
  private int priceCategory;
  private List<Review> reviews;

  Shop(String name, String description, int priceCategory) {
    if (this.priceCategory >= 0) {
      this.priceCategory = Math.min(priceCategory, 5);
    } else {
      this.priceCategory = Math.max(priceCategory, 0);
    }
    this.name = name;
    this.description = description;
    this.reviews = new LinkedList<>();

  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public double getStars() {
    return this.stars;
  }

  public int getPriceCategory() {
    return this.priceCategory;
  }

  private String dollarSign(int numChars) {
    String dollar = "$";
    String dollarSign = dollar.repeat(this.getPriceCategory());
    return dollarSign;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  @Override
  public void addReview(Review review) {
    if (!reviews.contains(review)) {
      reviews.add(review);
      updateStars();
    }
  }

  public List<Review> getReviews() {
    return this.reviews;
  }

  @Override
  public String reviewtoString() {
    List<Review> reviews = getReviews();
    StringBuilder review = new StringBuilder();
    for (Review value : reviews) {
      review.append(value.toString());
    }
    return review.toString();
  }

  @Override
  public void updateStars() {
    int sum = 0;
    double avg = 0.0;
    int num = getReviews().size();
    for (int i = 0; i < num; i++) {
      sum += getReviews().get(i).getStars();
    }
    avg = sum / num;
    avg = Math.round(avg * 10.0) / 10.0;
    this.setStars((int) avg);
  }

  @Override
  public String toString() {
    return "Restaurant{" + "name=" + this.getName() + " description=" + this.getDescription() + " stars="
        + this.getStars() + " priceCategory=" + dollarSign(getPriceCategory()) + " " + "reviews=" + reviews + " }";
  }
}
