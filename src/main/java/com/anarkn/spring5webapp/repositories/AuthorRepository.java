package com.anarkn.spring5webapp.repositories;

import com.anarkn.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
