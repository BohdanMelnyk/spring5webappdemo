package com.anarkn.spring5webapp.repositories;

import com.anarkn.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by jt on 5/17/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
