package com.example.demo.service.impl;

import com.example.demo.model.Category;


import com.example.demo.model.User;
import com.example.demo.repository.ICateRepository;
import com.example.demo.security.userprincal.UserDetailService;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CategoryService implements ICategoryService {
    @Autowired
    ICateRepository cateRepository;
    @Autowired
    UserDetailService userDetailService;


    @Override
    public Page<Category> findAll(Pageable pageable) {
        return cateRepository.findAll(pageable);
    }

    @Override
    public Category save(Category category) {
        User user = userDetailService.getCurrentUser();


        return null;
    }
}
