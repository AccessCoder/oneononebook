package de.neuefische.backend.service;

import de.neuefische.backend.model.Classbook;
import de.neuefische.backend.repository.OneOnOneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OneOnOneService {

    private final OneOnOneRepository oneOnOneRepository;

    public List<Classbook> getAllClassbooks() {
        return oneOnOneRepository.getAllClassbooks();
    }

    public Classbook postNewClassbook(Classbook classbook) {
        return (Classbook) oneOnOneRepository.save(classbook);
    }
}
