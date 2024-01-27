package ru.netology.dbdaolayer.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.dao.DataAccessException;
import ru.netology.dbdaolayer.model.Product;
import java.util.List;

public class ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Product> getProductList(String clientName) throws DataAccessException {
        String jpql = "select o.productName from Customers c\n" +
                " inner join Orders o " +
                "  on c.id = o.customerId " +
                " where c.name = lower(:name)";
        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        query.setParameter("name", clientName);

        return query.getResultList();
    }
}
