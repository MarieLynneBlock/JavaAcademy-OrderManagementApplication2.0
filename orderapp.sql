CREATE USER ORDERAPP IDENTIFIED BY SYSTEM;
GRANT CREATE SESSION TO ORDERAPP;
GRANT CREATE TABLE TO ORDERAPP;
GRANT CREATE SEQUENCE TO ORDERAPP;
ALTER DATABASE DEFAULT TABLESPACE users;
GRANT UNLIMITED TABLESPACE TO ORDERAPP;


-- Customers
CREATE TABLE CUSTOMERS
(
CUSTOMER_ID NUMBER(6,0) NOT NULL,
FIRST_NAME VARCHAR2(50),
LAST_NAME VARCHAR2(50),
-- location
STREET VARCHAR2(50),
HOUSENUMBER VARCHAR(50),
ZIPCODE VARCHAR(50) NOT NULL,
CITY VARCHAR2(50),
COUNTRY VARCHAR(50),
-- Contact Information
PHONE_NUMBER VARCHAR2(50) NOT NULL,
EMAIL VARCHAR2(50) NOT NULL,
-- primary key
CONSTRAINT customer_pk PRIMARY KEY (customer_id)
);

-- Customers Sequence
CREATE SEQUENCE member_id_seq
START WITH 1
INCREMENT BY 1;



drop table customer;

















