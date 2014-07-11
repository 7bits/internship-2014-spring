package it.sevenbits.internship.web.form;

import it.sevenbits.internship.model.Entity;

/**
 */
public class EntityForm {

    private Long id;
    private String name;
    private String description;

    public EntityForm() {
    }

    public EntityForm(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Entity fillModel() {
        Entity entity = new Entity();
        entity.setName(this.name);
        entity.setDescription(this.description);

        return entity;
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
