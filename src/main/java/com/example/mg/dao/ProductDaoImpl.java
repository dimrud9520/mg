package com.example.mg.dao;

import com.example.mg.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAllProduct() {
        return entityManager.createQuery("from Product", Product.class).getResultList();
    }
}
