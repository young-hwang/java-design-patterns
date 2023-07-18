package io.github.younghwang.gofbasic._04_Builder._02_after;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan busanPlan() {
        return tourPlanBuilder
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
    }

    public TourPlan kankunPlan() {
        return tourPlanBuilder.title("롱비치").startDate(LocalDate.of(2023, 6, 25)).getPlan();
    }
}
