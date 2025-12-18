package com.mylearn.common.dto.course;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CategoryResponse {
  UUID id;
  String name;
  String slug;
  String description;
}
