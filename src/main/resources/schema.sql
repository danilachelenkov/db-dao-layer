create table netology_db.Customers (
                                       id serial primary key ,
                                       name varchar(30) not null,
                                       surname varchar(30) not null,
                                       age int not null,
                                       phone_number varchar(25)
);

delete from netology_db.Customers;

insert into netology_db.Customers (name, surname, age, phone_number) values ('alexey','ivanov',20,'+79260213344');
insert into netology_db.Customers (name, surname, age, phone_number) values ('sergey','petrov',50,'+79266672345');
insert into netology_db.Customers (name, surname, age, phone_number) values ('ivan','sergeev',30,'+79255472345');

create table netology_db.Orders (
                                    id serial primary key,
                                    date date not null,
                                    customer_id integer REFERENCES netology_db.Customers (id),
                                    product_name varchar(50) not null,
                                    amount money not null
);

delete from netology_db.Orders;

insert into netology_db.Orders (date, customer_id,product_name, amount) values (cast ('20.01.2024' as date),1,'Iphone', 55000.23);
insert into netology_db.Orders (date, customer_id,product_name, amount) values (cast ('23.02.2024' as date),1,'Ipad', 105001);
insert into netology_db.Orders (date, customer_id,product_name, amount) values (cast ('01.01.2024' as date),2,'Xiaomi', 10000.56);
insert into netology_db.Orders (date, customer_id,product_name, amount) values (cast ('23.02.2024' as date),3,'Ipad', 1051);
insert into netology_db.Orders (date, customer_id,product_name, amount) values (cast ('01.01.2024' as date),3,'Xiaomi', 100.56);