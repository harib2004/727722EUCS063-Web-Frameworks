package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Children;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_ChildrenRepo;

@Service
public class Haribaskar_ChildrenService {

     @Autowired
     public Haribaskar_ChildrenRepo childrenRepo;

     public List<Haribaskar_Children> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public Haribaskar_Children save(Haribaskar_Children children) {
          return childrenRepo.save(children);

     }

     public List<Haribaskar_Children> sortedPage(int offset, int pagesize, String field) {
          Page<Haribaskar_Children> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<Haribaskar_Children> pagination(int offset, int pagesize) {
          Page<Haribaskar_Children> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
