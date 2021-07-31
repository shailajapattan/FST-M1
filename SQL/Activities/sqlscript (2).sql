REM   Script: Session 02
REM   self join

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

select * from orders;

 insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert all 
    into customers values (3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from dual;

insert all 
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001), into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006), into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007), into customers values(3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from dual;

insert all 
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001) 
into customers values(3007, 'Brad Davis', 'New York', 200, 5001) 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values(3008, 'Julian Green', 'London', 300, 5002) 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
into customers values(3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from dual;

  CREATE TABLE salesman  
( salesman int,  
salesman_name varchar2(20),  
salesman_city varchar2(20),  
commission int);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
    SELECT 1 FROM DUAL;

 create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select c.customer_name, s.salesman_id from customers c 
inner join salesman s 
on c.saleman_id=s.salesman_id;

select * from salesman;

select c.customer_name, s.salesman_id from customers c 
inner join salesman s 
on c.saleman_id=s.salesman;

select c.customer_name, s.salesman_id from customers c 
inner join salesman s 
on c.salesman_id=s.salesman;

select c.customer_name, s.salesman from customers c 
inner join salesman s 
on c.salesman_id=s.salesman;

select c.customer_name, s.salesman_name from customers c 
inner join salesman s 
on c.salesman_id=s.salesman;

commit


select c.customer_name,c.cty,c.grade, s.saleman_name,s.commission from customers c 
left outer join salesman s 
on c.salesman_id = s.salesman 
where c.grade<300 
order by c.customer_id;

select c.customer_name,c.cty,c.grade, s.salesman_name,s.commission from customers c 
left outer join salesman s 
on c.salesman_id = s.salesman 
where c.grade<300 
order by c.customer_id;

select c.customer_name,c.city,c.grade, s.salesman_name,s.commission from customers c 
left outer join salesman s 
on c.salesman_id = s.salesman 
where c.grade<300 
order by c.customer_id;

select * from employees;

select * from hr.employees;

select e.first_name, e.last_name, m.first_name, m.last_name from employees e, employees m 
where e.manager_id= m.employe_id 
order by e.employee_first_name;

select e.first_name, e.last_name, m.first_name, m.last_name from hr.employees e, hr.employees m 
where e.manager_id= m.employee_id 
order by e.first_name;
