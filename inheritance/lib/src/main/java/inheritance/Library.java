package inheritance;

public class Library {
    public static void main(String[] args) {

        Restaurant boneless = new Restaurant("boneless",5);

        Restaurant shawermaAlrief = new Restaurant("shawerma alrief",3);


        Review abdallah1 = new Review("abdallah","very  good resturent",5);
        Review abdallah2 = new Review("abdallah","bad resturent",3);

        Review ahmad1 = new Review("ahmad","good resturat",4);
        Review ahmad2 = new Review("ahmad","not bad resturat",3);

        boneless.addReview(abdallah1);
        boneless.addReview(ahmad1);
        System.out.println(boneless.toString());

        shawermaAlrief.addReview(ahmad2);
        shawermaAlrief.addReview(abdallah2);
        System.out.println(shawermaAlrief.toString());


    }
}