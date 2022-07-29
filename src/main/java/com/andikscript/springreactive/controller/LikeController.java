package com.andikscript.springreactive.controller;

import com.andikscript.springreactive.model.Like;
import com.andikscript.springreactive.service.like.LikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/employee")
public class LikeController {

    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> createEmployee(@RequestBody Like like) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(likeService.save(like));
    }

//    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @GetMapping(value = "/all")
    public ResponseEntity<Flux<Like>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(likeService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<Like>> findById(@PathVariable(value = "id") String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(likeService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Mono<Void>> deleteById(@PathVariable(value = "id") String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(likeService.deleteById(id));
    }
}
