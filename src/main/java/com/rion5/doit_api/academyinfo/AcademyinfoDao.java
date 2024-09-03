package com.rion5.doit_api.academyinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AcademyinfoDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Academyinfo> getAcademyinfoList() {
        String query = """
                select *
                from academy_info
                where 연도=2023
                """;
        List<Academyinfo> academyinfoList = namedParameterJdbcTemplate.query(query, (rs, rowNum) -> new Academyinfo(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getInt(8),
                rs.getInt(9),
                rs.getInt(10),
                rs.getInt(11),
                rs.getDouble(12),
                rs.getDouble(13),
                rs.getDouble(14),
                rs.getInt(15),
                rs.getInt(16),
                rs.getInt(17),
                rs.getInt(18),
                rs.getDouble(19),
                rs.getInt(20),
                rs.getInt(21),
                rs.getInt(22),
                rs.getDouble(23),
                rs.getInt(24)));
        return academyinfoList;
    }
}
