 package inheritance;
import java.util.LinkedList;

public class Theater implements Reviewable {
  private String name;
  private double stars = 0.0;
  private LinkedList<String> movies = new LinkedList<>();
  private LinkedList<Review> reviews = new LinkedList<>();

  Theater(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public double getStars() {
    return this.stars;
  }

  public void addMovie(String movieTitle) {
    this.movies.add(movieTitle);
  }

  public LinkedList<String> getMovies() {
    return this.movies;
  }

  public void removeMovie(String movieTitle) {
    this.movies.remove(movieTitle);
  }

  public String toMoviesString(LinkedList<String> movies) {
    StringBuilder movieString = new StringBuilder();
    for (int i = 0; i < movies.size() - 1; i++) {
      movieString.append(movies.get(i)).append(", ");
    }
    if (movies.size() == 0) {
      return "No Movies Available";
    }
    movieString.append(movies.get(movies.size() - 1));
    return movieString.toString();
  }

  @Override
  public void addReview(Review review) {
    if (!reviews.contains(review)) {
      // this.reviews.add(review);
      review.setReviewable(this);
      updateStars();
  }
  }

  public LinkedList<Review> getReviews() {
    return this.reviews;
  }

  @Override
  public String reviewtoString() {
    LinkedList<Review> reviews = getReviews();
    StringBuilder review = new StringBuilder();
    for (Review value : reviews) {
      review.append(value.toString());
    }
    return review.toString();
  }

  @
  public void updateStars () {
      int sum = 0;
      double avg =0.0;
      int num =getReviews().size();
      for (int i = 0; i < num; i++) {
          sum += getReviews().get(i).getStars();
      }
      avg = sum /num;
      avg = Math.round(avg * 10.0) / 10.0;
      this.setStars(avg);
  }

    @Override
    public String toString () {
      return "Restaurant{" + "name=" + this.getName() + " stars=" + this.getStars() + " Movies=" + toMoviesString(getMovies()) + " " + "reviews=" + reviews +" }";
    }
  }