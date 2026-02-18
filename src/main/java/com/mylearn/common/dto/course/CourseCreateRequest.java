package com.mylearn.common.dto.course;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CourseCreateRequest {
  String title;
  String description;
  String summary;
  UUID categoryId;
  Integer priceCents;
}
