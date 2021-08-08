
    Restaurant boneless = new Restaurant("boneless", 5);
    Restaurant shawermaAlrief = new Restaurant("shawerma alrief", 3);

    Review abdallah1 = new Review("abdallah", "very  good resturent", 5);
    Review abdallah2 = new Review("abdallah", "bad resturent", 3);
    Review ahmad1 = new Review("ahmad", "good resturat", 4);
    Review ahmad2 = new Review("ahmad", "not bad resturat", 3);

    shawermaAlrief.addReview(ahmad2);
    shawermaAlrief.addReview(abdallah2);
    boneless.addReview(abdallah1);
    boneless.addReview(ahmad1);

    System.out.println(boneless.toString());
    System.out.println(shawermaAlrief.toString());

    Shop dokan = new Shop("dokan", "Borrowing is prohibited ", 5);
    Review abdallah = new Review("abdallah", "bad shop", 3);
    Review ahmad = new Review("ahmad", "good shop", 4);
    dokan.addReview(abdallah);
    dokan.addReview(ahmad);

    System.out.println(dokan.toString());


    Theater lincoln = new Theater("Lincoln Center for the Performing Arts");
    lincoln.addMovie("the fault in our stars");
        System.out.println(lincoln.toString());

    lincoln.removeMovie("the fault in our stars");
    Review abdallah3 = new Review("abdallah", "bad Theater", 3);
    Review ahmad3 = new Review("ahmad", "good Theater", 4);
    lincoln.addReview(abdallah3);
    lincoln.addReview(ahmad3);

    System.out.println(lincoln.toString());




  }
