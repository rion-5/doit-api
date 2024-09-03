package com.rion5.doit_api.academyinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademyinfoController {
    @Autowired
    private AcademyinfoDao academyinfoDao;

    @GetMapping(value = "academyinfo")
    public ResponseEntity<List<Academyinfo>> getFacultyList() {
        return ResponseEntity.ok(academyinfoDao.getAcademyinfoList());
    }
}
