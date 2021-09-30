package com.globallabs.springwebmvc.repository;

import com.globallabs.springwebmvc.model.Jedi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class JediRepository {

    public List<Jedi> getAllJedi(){
        final List<Jedi> jedi = new ArrayList<>();

        jedi.add(new Jedi("Luke", "SkyWalker"));
        return jedi;
    }
}
