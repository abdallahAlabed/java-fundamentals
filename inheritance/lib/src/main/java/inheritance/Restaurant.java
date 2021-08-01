package inheritance;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private int stars;
    private int priceCategory;
    private String name;
    private List<Review> reviews = new ArrayList<Review>();

    public Restaurant(int priceCategory, String name) {
        this.priceCategory = priceCategory;
        this.name = name;

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

        public void addReview (Review review){
            if (!reviews.contains(review)) {
                reviews.add(review);
                updateStars();
            }
        }
        @Override
        public void updateStars () {
            double current = 0.0;
            for (int i = 0; i < getReviews().size(); i++) {
                current += getReviews().get(i).getStars();
            }
            current /= (getReviews().size());
            current = Math.round(current * 10.0) / 10.0;
            this.setStars(current);
        }
        @Override
        public String toString () {
            String dollar = "$";
            String dollarSign = dollar.repeat(this.getPriceCategory());

            return "Restaurant{" + "name='" + this.getName() + '\'' + ", stars=" + this.getStars() + ", priceCategory=" + dollarSign + ", " +
                    "reviews=" + reviews + '}';
        }

    }