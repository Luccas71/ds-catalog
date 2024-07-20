package com.luccas71.dscatalog.services;

import com.luccas71.dscatalog.dto.CategoryDTO;
import com.luccas71.dscatalog.entities.Category;
import com.luccas71.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

//permite a injeçao de dependencia automatica
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //garante que a op é uma transação com db e readonly não trava o banco melhorando a performance
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> list = categoryRepository.findAll();
        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
