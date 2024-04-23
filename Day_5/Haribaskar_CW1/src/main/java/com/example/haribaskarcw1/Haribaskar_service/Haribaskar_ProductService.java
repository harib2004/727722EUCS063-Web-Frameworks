package com.example.haribaskarcw1.Haribaskar_service;

import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Product;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_ProductRepo;

@Service
public class Haribaskar_ProductService {
    public Haribaskar_ProductRepo productRepo;
    public Haribaskar_ProductService(Haribaskar_ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(Haribaskar_Product product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Haribaskar_Product product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public Haribaskar_Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
