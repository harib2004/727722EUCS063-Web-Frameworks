package com.example.haribaskarcw3.Haribaskar_service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw3.Haribaskar_model.Haribaskar_Product;
import com.example.haribaskarcw3.Haribaskar_repository.Haribaskar_ProductRepo;

@Service
public class Haribaskar_ProductService {
    public Haribaskar_ProductRepo productRepo;
    public Haribaskar_ProductService(Haribaskar_ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(Haribaskar_Product product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Haribaskar_Product> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<Haribaskar_Product> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public Haribaskar_Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
