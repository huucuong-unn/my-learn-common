package com.mylearn.common.dto.course;

import com.mylearn.common.enums.CourseStatus;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
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
