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
public class CategoryResponse {
  UUID id;
  String name;
  String slug;
  String description;
}
