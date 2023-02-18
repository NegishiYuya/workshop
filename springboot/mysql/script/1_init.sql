CREATE TABLE master_category(
    id int,
    label varchar(20),
    PRIMARY KEY (id)
);

INSERT INTO
    master_category(id, label)
VALUES
    (1, 'くさ'),
    (2, 'ほのお'),
    (3, 'みず');