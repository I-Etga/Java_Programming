package daily_videos.day25_cunstructors.tasks.offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer("Germany", "Apple", "Java Developer", 90000, true, true, true, true);
        Offer offer2 = new Offer("Germany", "Samsung", "Java Developer", 190000, false, true, false, true);
        Offer offer3 = new Offer("UK", "Huawei", "QA Tester", 100000, true, true, true, true);
        Offer offer4 = new Offer("UK", "Dyson", "Web Designer", 80000, false, true, false, true);
        Offer offer5 = new Offer("France", "Tesla", "Web Developer", 110000, true, true, true, false);
        Offer offer6 = new Offer("France", "Bank of America", "Java Developer", 70000, false, true, true, true);
        Offer offer7 = new Offer("Belgium", "General Motors", "QA Tester", 50000, false, true, false, false);

        System.out.println("*****");

        ArrayList<Offer> myOffers = new ArrayList<>();

        myOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));
        System.out.println(myOffers);

        System.out.println("*****");

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers);

        System.out.println("*****");


        ArrayList<Offer> offerWithBenefits = new ArrayList<>();
        offerWithBenefits.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        offerWithBenefits.removeIf(p -> !p.isFullTime);
        System.out.println(offerWithBenefits);

        System.out.println("*****");

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        localOffers.removeIf(p -> !p.location.equals("Germany"));

        System.out.println(localOffers);
        System.out.println("*****");

        ArrayList<Offer> offerNoBenefitNoPTO = new ArrayList<>();
        offerNoBenefitNoPTO.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        offerNoBenefitNoPTO.removeIf(p -> !p.hasBenefit && !p.hasPTO);
        System.out.println(offerNoBenefitNoPTO);
        System.out.println("*****");

        ArrayList<Offer> devOffers = new ArrayList<>();
        devOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        devOffers.removeIf(p -> !p.jobTitle.equals("Java Developer"));
        System.out.println(devOffers);


        System.out.println("*****");

        ArrayList<Offer> with100K = new ArrayList<>();
        with100K.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        with100K.removeIf(p -> p.salary < 100000);
        System.out.println(with100K);
        System.out.println(with100K);
    }
}

