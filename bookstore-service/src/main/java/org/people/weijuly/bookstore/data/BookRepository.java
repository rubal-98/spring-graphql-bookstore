package org.people.weijuly.bookstore.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<BookEntity, String> {

    Optional<BookEntity> findByName(String name);

    List<BookEntity> findByAuthorId(String authorId);

    List<BookEntity> findByNameContaining(String name);

    List<BookEntity> findByYear(Integer year);

}
