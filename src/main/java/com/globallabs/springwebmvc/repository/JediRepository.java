package com.globallabs.springwebmvc.repository;

import com.globallabs.springwebmvc.model.Jedi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "SkyWalker"));
    }

    public List<Jedi> getAllJedi() {
        return this.jedi;
    }

    public void add(final Jedi jedi) {
        if (jedi.getName().isEmpty()) {
            Error error = new Error("Campo em branco");
        } else {
            this.jedi.add(jedi);
        }
    }
}
