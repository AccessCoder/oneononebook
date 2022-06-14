package de.neuefische.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Student {

    HashMap<String,OneOnOneElement> oneOnOnes = new HashMap<>();
    String id = UUID.randomUUID().toString();
    String name;

    private OneOnOneElement addOneOnOne(OneOnOneElement oneOnOneElement){
        return oneOnOnes.put(oneOnOneElement.id,oneOnOneElement);
    }

    private OneOnOneElement getOneOnOneById(String id){
        return oneOnOnes.get(id);
    }
}
