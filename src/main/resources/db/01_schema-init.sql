DROP SCHEMA IF EXISTS otus_highload CASCADE;
CREATE SCHEMA otus_highload;
set search_path to otus_highload;

CREATE TABLE person
(
    id          uuid PRIMARY KEY,
    first_name  varchar(1024) NOT NULL,
    second_name varchar(1024) NOT NULL,
    birthdate   date,
    biography   TEXT,
    city        varchar(1024),
    password    varchar,
    created_at  timestamp without time zone,
    updated_at  timestamp without time zone
);
