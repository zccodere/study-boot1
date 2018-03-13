-- create table PERSON
-- (
--   id NUMBER not null primary key,
--   name VARCHAR2(20),
--   age NUMBER,
--   nation VARCHAR2(20),
--   address VARCHAR2(20)
-- );
create table PERSON
(
  id          INT NOT NULL primary key AUTO_INCREMENT,
  name        VARCHAR(20),
  age         INT,
  nation      VARCHAR(20),
  address     VARCHAR(20)
);