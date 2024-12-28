CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(255)
);

INSERT INTO product (name, price, category) VALUES ('Product A', 100.0, 'Test');
INSERT INTO product (name, price, category) VALUES ('Product B', 200.0, 'Test');
