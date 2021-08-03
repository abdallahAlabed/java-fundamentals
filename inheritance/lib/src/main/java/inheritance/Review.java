package inheritance;

public class Review {
  private String body;
  private String author;
  private double stars;
  private Reviewable reviewable;
  private String movie;

  Review(String body, String author, double stars) {
    this.body = body;
    this.author = author;
    this.stars = Math.min(stars, 5.0);
  }

  Review(String body, String author, double stars, Reviewable reviewable) {
    this(body, author, stars);
    this.reviewable = reviewable;
  }

  Review(String body, String author, double stars, Reviewable reviewable, String movie) {
    this(body, author, stars, reviewable);
    this.movie = movie;
    ((Theater)this.reviewable).addMovie(movie);
  }

  public String getBody() {
    return this.body;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getStars() {
    return this.stars;
  }

  public String getMovie() {
    return this.movie;
  }

  void setReviewable(Reviewable reviewable) {
    this.reviewable = reviewable;
  }

  public Reviewable getReviewable() {
    return this.reviewable;
  }

  @Override
  public String toString() {
    if (this.getMovie() != null)
    return "Review{" + "author='" +this.getAuthor() + '\'' + ", body='" + this.getBody() + '\'' + ", Movie=" + this.getMovie()+ ", stars=" + this.getStars() + '}\n';
    return "Review{" + "author='" +this.getAuthor() + '\'' + ", body='" + this.getBody() + '\'' + ", stars=" + this.getStars() + '}\n';
  }
}

