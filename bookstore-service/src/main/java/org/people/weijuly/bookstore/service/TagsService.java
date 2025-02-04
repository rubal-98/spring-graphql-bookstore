package org.people.weijuly.bookstore.service;

import org.people.weijuly.bookstore.data.BookTagEntity;
import org.people.weijuly.bookstore.data.BookTagRepository;
import org.people.weijuly.bookstore.model.TagModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TagsService {

    @Autowired
    BookTagRepository bookTagRepository;

    public List<TagModel> build(String bookId) {
        return bookTagRepository
                .findByBookId(bookId)
                .stream()
                .map(BookTagEntity::getTag)
                .map(TagModel::valueOf)
                .collect(Collectors.toList());
    }

    public List<String> searchBooksByTag(TagModel tag) {
        return bookTagRepository
                .findByTag(tag.name())
                .stream()
                .map(BookTagEntity::getBookId)
                .collect(Collectors.toList());
    }
}
