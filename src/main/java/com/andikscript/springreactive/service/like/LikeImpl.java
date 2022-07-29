package com.andikscript.springreactive.service.like;

import com.andikscript.springreactive.model.Like;
import com.andikscript.springreactive.repository.LikeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LikeImpl implements LikeService {

    private final LikeRepository likeRepository;

    public LikeImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public Flux<Like> findAll() {
        return likeRepository.findAll();
    }

    @Override
    public Mono<Like> save(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public Mono<Like> findById(String id) {
        return likeRepository.findById(id);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return likeRepository.deleteById(id);
    }
}
