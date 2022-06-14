package de.neuefische.backend.controller;

import de.neuefische.backend.model.Classbook;
import de.neuefische.backend.service.OneOnOneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class OneOnOneController {

    private final OneOnOneService oneOnOneService;

    @GetMapping
    public List<Classbook> getAllClassbooks(){
        return oneOnOneService.getAllClassbooks();
    }

    @PostMapping
    public Classbook postNewClassbook(@RequestBody Classbook classbook){
        return oneOnOneService.postNewClassbook(classbook);
    }
}
