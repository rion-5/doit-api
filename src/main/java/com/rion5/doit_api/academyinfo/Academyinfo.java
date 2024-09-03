package com.rion5.doit_api.academyinfo;

public record Academyinfo(
        int year,
        String 학교명,
        String 본분교명,
        String 학교종류,
        String 학교유형,
        String 설립유형,
        String 지역명,
        int 입학정원,
        int 졸업생수,
        int 전임교원수,
        int 재학생,
        double 신입생경쟁률,
        double 신입생충원률,
        double 취업률,
        int 외국인학생수,
        int 전임교원1인당학생수,
        int 전임교원확보율_학생정원기준,
        int 전임교원확보율_재학생기준,
        double 전임교원강의담당비율,
        int 학생1인당연간장학금,
        int 연평균등록금,
        int 학생1인당교육비,
        double 기숙사수용율,
        int 학생1인당도서자료수) {
}
