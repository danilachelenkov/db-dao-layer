select o.product_name
  from netology_db.Customers c
 inner join netology_db.Orders o
  		 on c.id = o.customer_id
 where c.name = lower(:name);