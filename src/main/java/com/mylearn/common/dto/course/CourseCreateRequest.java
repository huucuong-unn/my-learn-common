package com.mylearn.common.dto.course;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CourseCreateRequest {
  String title;
  String description;
  String summary;
  UUID categoryId;
  Integer priceCents;
}
