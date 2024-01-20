package ru.netology.dbdaolayer.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.netology.dbdaolayer.model.Product;
import ru.netology.dbdaolayer.processor.SqlStatement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Product> getProductList(String clientName) throws DataAccessException {

        Map<String, Object> params = new HashMap<>();
        params.put("name", clientName);


        return namedParameterJdbcTemplate.query(
                SqlStatement.read("select_product_name.sql"),
                params,
                (resultSet, rowNum) -> {
                    String productName = resultSet.getString("product_name");
                    return new Product(productName);
                });
    }
}
