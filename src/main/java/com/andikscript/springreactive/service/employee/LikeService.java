package com.andikscript.springreactive.service.employee;

import com.andikscript.springreactive.model.Like;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LikeService {

    Flux<Like> findAll();

    Mono<Like> save(Like like);

    Mono<Like> findById(String id);

    void deleteById(String id);

    // Flux<> digunakan untuk menghandle object yang banyak
    // Mono<> digunakan untuk menghandle satu object
}
