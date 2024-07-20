package com.luccas71.dscatalog.services;

import com.luccas71.dscatalog.entities.Category;
import com.luccas71.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//permite a injeçao de dependencia automatica
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
