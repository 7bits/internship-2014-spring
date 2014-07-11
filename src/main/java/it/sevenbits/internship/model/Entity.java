package it.sevenbits.internship.model;

import java.io.Serializable;

/**
 * Entity model
 */
public class Entity implements Serializable {

    private static final long serialVersionUID = -4785452470302405219L;

    private Long id;
    private String name;
    private String description;

    public Entity() {
    }

    public Entity(
            final Long id,
            final String name,
            final String description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
