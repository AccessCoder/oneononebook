package de.neuefische.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OneOnOneElement {

    String date;
    String coach;
    String id = UUID.randomUUID().toString();
    String title;
    String content;
}
