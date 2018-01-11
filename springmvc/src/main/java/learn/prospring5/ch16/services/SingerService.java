package learn.prospring5.ch16.services;

import learn.prospring5.ch16.entities.Singer;

import java.util.List;

public interface SingerService {
    List<Singer> findAll();

    Singer findById(Long id);

    Singer save(Singer singer);
}
