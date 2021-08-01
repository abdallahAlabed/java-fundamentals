package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testRestaurantToStringMethod() {
        Restaurant boneless = new Restaurant("boneless", 5);
        String str = "Restaurant{name='boneless', stars=0, priceCategory=$$$$$, reviews=[]}";
        assertEquals(str, boneless.toString(), "create an instance of Restaurant and ensure that its toString is working properly");
    }

    @Test
    public void testReviewToStringMethod() {
        Review abdallah1 = new Review("abdallah", "very good resturent", 5);
        String str = "Review{author='abdallah', body='very good resturent', stars=5}";
        assertEquals(str, abdallah1.toString(), "create an instance of Review and ensure that its toString is working properly.");
    }

    @Test
    public void testAddReviewMethod() {
        Restaurant boneless = new Restaurant("boneless", 5);
        Review abdallah1 = new Review("abdallah", "very good resturent", 5);
        boneless.addReview(abdallah1);
        String str = "Restaurant{name='boneless', stars=5, priceCategory=$$$$$, reviews=[Review{author='abdallah', body='very good resturent', stars=5}]}";
        assertEquals(str, boneless.toString(), "call addReview, the association is created between the Restaurant and the Review");
    }
}