CREATE TABLE user (
    id INT,
    name VARCHAR(20),
    category_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES master_category (id)
);

INSERT INTO
    user(id, name, category_id)
VALUES
    (1, 'ニャオハ', 1),
    (2, 'ニャローテ', 1),
    (3, 'マスカーニャ', 1),
    (4, 'ホゲータ', 2);