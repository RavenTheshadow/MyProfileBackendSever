package com.rs.rmk.profile.model;


import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class Grade {
    @Data
    @Builder
    public static class Course {
        private String id;
        private String name;
        private int credits;
        private String grade;
        private String grade_Letter;
        private String date;
    }
}
