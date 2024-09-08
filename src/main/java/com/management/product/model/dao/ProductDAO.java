package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {

    public List<ProductDTO> selectAllProductList();
    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);
    public int insertProduct(ProductDTO product);
    public int updateProduct(ProductDTO product);
    public int deleteProduct(String product_code);

}
