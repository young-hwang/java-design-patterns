package me._04_Builder.gof._02_after;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder
                .title("부산 여행")
                .nightsAndDays(3, 2)
                .whereToStay("모텔")
                .startDate(LocalDate.of(2023, 6, 23))
                .addPlan(0, "체크인")
                .addPlan(0, "저녁 식사")
                .addPlan(1, "아침 식사")
                .addPlan(1, "점심 식사")
                .addPlan(1, "저녁 식사")
                .addPlan(2, "아침 식사")
                .addPlan(2, "점심 식사")
                .getPlan();

        System.out.println(plan);

        TourPlan plan1 = builder.title("롱비치").startDate(LocalDate.of(2023, 6, 25)).getPlan();
        System.out.println(plan1);

        TourDirector tourDirector = new TourDirector(builder);
        TourPlan tourPlan = tourDirector.busanPlan();
        TourPlan tourPlan1 = tourDirector.kankunPlan();
        System.out.println(tourPlan);
        System.out.println(tourPlan1);
    }
}
