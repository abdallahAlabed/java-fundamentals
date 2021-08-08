
import java.util.*;
public class Review {
  private String body;
  private String author;
  private double stars;
  private Reviewable reviewable;
  private String movie;

 Review( ) {
    this.body = "body";
    this.author = "author";
    this.stars = Math.min(stars, 5.0);
  }

  Review( String author,String body, double stars) {
    this();
    this.body = body;
    this.author = author;
    this.stars = Math.min(stars, 5.0);
  }

  Review(String author,String body, double stars, Reviewable reviewable) {
    this(body, author, stars);
    this.reviewable = reviewable;
  }

  Review(String author,String body , double stars, Reviewable reviewable, String movie) {
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
  public void setBody(String body) {
    this.body = body;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public void setMovie(String movie) {
    this.movie = movie;
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
    return "Review{" + "author=" +this.getAuthor() + " body=" + this.getBody() + " Movie=" + this.getMovie()+ " stars=" + this.getStars() +" }\n";
    return "Review{" + "author=" +this.getAuthor() +  " body=" + this.getBody() +  " stars=" + this.getStars() +" }\n";
  }
}

