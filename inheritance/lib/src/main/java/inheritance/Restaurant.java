package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Reviewable {
    private int stars;
    private int priceCategory;
    private String name;
    private List<Review> List<Review> reviews = new ArrayList<Review>();

    public Restaurant(int priceCategory, String name) {
        if(this.priceCategory >= 0){
            this.priceCategory = Math.min(priceCategory, 5);
        }else{
            this.priceCategory = Math.max(priceCategory, 0);
        }
        this.name = name;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getStars () {
            return stars;
        }

        public void setStars ( int stars){
            this.stars = stars;
        }

        public int getPriceCategory () {
            return priceCategory;
        }

        public void setPriceCategory ( int priceCategory){
            this.priceCategory = priceCategory;
        }

        public List<Review> getReviews () {
            return reviews;
        }

        public void setReviews (List < Review > reviews) {
            this.reviews = reviews;
        }

        public String dollarSign ( int numChars){
            String dollar = "$";
            String dollarSign = dollar.repeat(this.getPriceCategory());
            return dollarSign;
        }

        @Override
        public void addReview (Review review){
            if (!reviews.contains(review)) {
                reviews.add(review);
                updateStars();
            }
        } 

         @Override
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
        public String reviewtoString () {
            LinkedList<Review> reviews = getReviews();
            StringBuilder review = new StringBuilder();
            for (Review value : reviews) {
                review.append(value.toString());
                // review +=value.toString();
            }
            return review.toString();
        }

        @Override
        public String toString () {
            return "Restaurant{" + "name='" + this.getName() + '\'' + ", stars=" + this.getStars() + ", priceCategory=" + dollarSign(getPriceCategory()) + ", " +
                    "reviews=" + reviews + '}';
        }
  }
