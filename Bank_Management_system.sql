show databases;

use bankmanagementsystem;


create table signup(formno varchar(30), name varchar(50), fname varchar(50), dob varchar(30), gender varchar(30), email varchar(30),marital varchar(30) , address varchar(50) , city varchar(30) , pin varchar(30) , state varchar(30));

ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';

drop table bank;
show tables;

select* from signup;

create table signuptwo(formno varchar(30), sreligion varchar(30), scategory varchar(30),sincome varchar(30), seducation varchar(30), soccupation varchar(30), span varchar(30), saadhar varchar(30), seniorcitizen varchar(30), sexistingaccount varchar(30));

select* from signuptwo;

create table signupthree(formno varchar(30), accountType varchar(40),cardnumber varchar(30), pinnumber varchar(30) ,facility varchar(100));

create table login (formno varchar(30), cardnumber varchar(40) , pin varchar(10));

select* from signupthree;

select* from login;

create table bank(pin varchar(10), date varchar(50), type varchar(30), amount varchar(100));

select* from bank;
