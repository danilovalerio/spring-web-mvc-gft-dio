package com.globallabs.springwebmvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Jedi {

    @NotBlank
    @NotEmpty
    @Size(min = 3)
    private String lastName;

    @NotBlank
    @NotEmpty
    @Size(min = 3)
    private String name;

    public Jedi(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
