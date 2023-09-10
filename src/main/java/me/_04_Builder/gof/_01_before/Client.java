package me._04_Builder.gof._01_before;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("부산 여행");
        tourPlan.setWhereToStay("모텔");
        tourPlan.setDays(3);
        tourPlan.setNights(2);
        tourPlan.setStartDate(LocalDate.of(2023, 6, 23));
        tourPlan.addPlan(0, "체크인");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "아침 식사");
        tourPlan.addPlan(1, "점심 식사");
        tourPlan.addPlan(1, "저녁 식사");
        tourPlan.addPlan(2, "아침 식사");
        tourPlan.addPlan(2, "점심 식사");
    }
}
