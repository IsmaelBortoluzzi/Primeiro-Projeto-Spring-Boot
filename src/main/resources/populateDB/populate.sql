INSERT INTO "user_entity" (name, email, phone, password)
VALUES
    ('Erika', 'erika@gmail.com', '49 98298422', 'erika123'),
    ('Andressa', 'andressa@gmail.com', '49 92784243', 'andressa123'),
    ('Pedro', 'pedro@gmail.com', '49 98298422', 'pedro123'),
    ('Luis', 'luis@gmail.com', '49 98298422', 'luis123'),
    ('Carlos', 'carlos@gmail.com', '49 98298422', 'carlos123');


INSERT INTO "order_entity" (date, order_status, client_id)
VALUES
    ('2019-06-20T19:53:07Z', 3, 2),
    ('2019-07-21T05:34:10Z', 4, 2),
    ('2019-07-21T16:54:10Z', 4, 1),
    ('2019-07-21T13:55:10Z', 4, 2),
    ('2019-07-21T05:25:10Z', 1, 3),
    ('2019-07-22T15:21:22Z', 2, 3);



INSERT INTO "category_entity" (name)
VALUES
    ('Electronics'),
    ('Books'),
    ('Computers');


INSERT INTO "product_entity" (name, description, price, img_url)
VALUES
    ('The Lord of the Rings', 'Lorem ipsum dolor sit amet, consectetur', 90.5, ''),
    ('mart TV', 'Nulla eu imperdiet purus. Maecenas ante.', 2190.0, ''),
    ('acbook Pro', 'Nam eleifend maximus tortor, at mollis.', 1250.0, ''),
    ('PC Gamer', 'Donec aliquet odio ac rhoncus cursus.', 1200.0, ''),
    ('Rails for Dummies', 'Cras fringilla convallis sem vel faucibus.', 100.99, '');


INSERT INTO "tb_product_category" (product_id, category_id)
VALUES
    (3, 3),
    (2, 3),
    (4, 3),
    (5, 1),
    (5, 3),
    (2, 1),
    (3, 2),
    (1, 3),
    (1, 2),
    (3, 1),
    (5, 2);


INSERT INTO "tb_order_item" (price, quantity, product_id, order_id)
VALUES
    (92.21, 3, 1, 3),
    (91.33, 7, 3, 3),
    (644.55, 1, 4, 4),
    (434.43, 9, 1, 4),
    (354.55, 21, 2, 2),
    (21.76, 1, 3, 2);


INSERT INTO "payment_entity" (moment, order_id)
VALUES
    ('2019-06-20T22:53:07Z', 1),
    ('2019-07-21T18:55:10Z', 3);