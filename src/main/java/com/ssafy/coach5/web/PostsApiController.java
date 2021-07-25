package com.ssafy.coach5.web;

import com.ssafy.coach5.service.PostsService;
import com.ssafy.coach5.web.dto.PostsResponseDto;
import com.ssafy.coach5.web.dto.PostsSaveRequestDto;
import com.ssafy.coach5.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);

    }

    @PutMapping("/api/v1/posts/{id}")
    public Long udpate(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
