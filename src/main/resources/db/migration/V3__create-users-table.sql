create table users_table
(
    id       BIGINT       NOT NULL auto_increment,
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(255) NOT NULL,

    primary key (id)
);