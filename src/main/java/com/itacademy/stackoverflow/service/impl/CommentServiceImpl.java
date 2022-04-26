package com.itacademy.stackoverflow.service.impl;

import com.itacademy.stackoverflow.dto.comment.request.CommentRequest;
import com.itacademy.stackoverflow.dto.comment.response.CommentResponse;
import com.itacademy.stackoverflow.service.CommentService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentServiceImpl implements CommentService {

    @Override
    public CommentResponse save(CommentRequest t) {
        return null;
    }

    @Override
    public List<CommentResponse> getAll() {
        return null;
    }

    @Override
    public CommentResponse findById(Long id) {
        return null;
    }
}
