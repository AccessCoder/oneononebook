package de.neuefische.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Classbook {

    @Id
    String id = UUID.randomUUID().toString();

    HashMap<String,Student> studentlist = new HashMap<>();
    String name;

    private Student getStudent(String id){
        return studentlist.get(id);
    }

    private Student addStudent(Student student){
        return studentlist.put(student.id, student);
    }
}
