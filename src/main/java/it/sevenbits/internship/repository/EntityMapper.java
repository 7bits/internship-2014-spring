package it.sevenbits.internship.repository;

import it.sevenbits.internship.model.Entity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MyBatis Database Mapper for Entity
 */
public interface EntityMapper {

    @Insert("INSERT INTO entities (name, description) " +
            "VALUES (#{name}, #{description})")
    void create(final Entity entity);

    @Select("Select * from entities;")
    List<Entity> findAll() ;
}