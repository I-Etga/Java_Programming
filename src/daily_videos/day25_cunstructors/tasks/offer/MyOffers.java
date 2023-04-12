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

        System.out.println("*****1");

        ArrayList<Offer> myOffers = new ArrayList<>();

        myOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));
        System.out.println(myOffers);

        System.out.println("*****2 FullTime");

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(myOffers);

        fullTimeOffers.removeIf(p -> !p.isFullTime); // it removes  offer2 offer5 and offer7
        System.out.println(fullTimeOffers);

        System.out.println("*****3 has Benefit");


        ArrayList<Offer> offerWithBenefits = new ArrayList<>();
        offerWithBenefits.addAll(myOffers);

        offerWithBenefits.removeIf(p -> !p.hasBenefit);
        System.out.println(offerWithBenefits);

        System.out.println("*****4 location");

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7, new Offer("Germany", "Apple", "Java Developer", 12000, true, true, true, true)));

        localOffers.removeIf(p -> !p.location.equals("Germany"));

        System.out.println(localOffers);
        System.out.println("*****5 no Benefit no PTO");

        ArrayList<Offer> offerNoBenefitNoPTO = new ArrayList<>();
        offerNoBenefitNoPTO.addAll(myOffers);

        offerNoBenefitNoPTO.removeIf(p -> !p.hasBenefit && !p.hasPTO);
        System.out.println(offerNoBenefitNoPTO);

        System.out.println("*****6 Developer");

        ArrayList<Offer> devOffers = new ArrayList<>();
        devOffers.addAll(myOffers);


        devOffers.removeIf(p -> !p.jobTitle.contains("Developer"));
        System.out.println(devOffers);


        System.out.println("*****7 Salary 100K");

        ArrayList<Offer> with100K = new ArrayList<>();
        with100K.addAll(myOffers);

        with100K.removeIf(p -> p.salary < 100000);
        System.out.println(with100K);
    }
}
