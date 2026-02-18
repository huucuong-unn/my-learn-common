package com.mylearn.common.dto.course;

import com.mylearn.common.enums.CourseStatus;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CourseResponse {
  UUID id;
  String title;
  String slug;
  String description;
  String summary;
  CategoryResponse category;
  UUID instructorId;
  Integer priceCents;
  CourseStatus status;
}
