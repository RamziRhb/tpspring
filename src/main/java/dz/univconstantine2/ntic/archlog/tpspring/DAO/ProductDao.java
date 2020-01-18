package dz.univconstantine2.ntic.archlog.tpspring.DAO;


import dz.univconstantine2.ntic.archlog.tpspring.model.Product;

import java.util.List;

public interface ProductDao {

        public List<Product> findAll();
        public Product findById(int id);
        public Product save(Product product);
    }