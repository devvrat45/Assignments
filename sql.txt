select department_id,to_number(null) location, hire_date, employee_id 
from employees 
union select department_id, location_id,to_date(null), to_number(null)
from departments order by employee_id;


select to_number(null),location_id location
from locations
union select department_id, to_number(null)
from departments;

select employee_id ,job_id, salary 
from employees
union 
select employee_id, job_id,0 
from job_history


INSERT INTO DEPARTMENTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) 
VALUES(71,'Public Relations',100,1700);

insert into employees(employee_id, first_name, last_name, email
,phone_number, hire_date, job_id,salary, commission_pct, manager_id, department_id)
values (230,'Ram','das','ram@gmail.com',845894358,sysdate,'AC_ACCOUNT',6900, null,205,71);

insert into employees 
values(114,'das','ram','dasram', '543563465',to_date('feb 3,1999', 'MON DD,YYYY'),'AC_ACCOUNT',1100,null,100,30);

**
insert into departments(department_id,department_name, location_id) 
values (&department_id,'&department_name',&location);

insert into locations values(3300,' HiTech City',503304,'Hyderabad','Telegana','IN')

insert into departments values(280,'Tech Support',150,3300);

insert into employees(employee_id, first_name, last_name, email
,phone_number, hire_date, job_id,salary, commission_pct, manager_id, department_id)
values (270,'Devv','Ved','Devvv@gmail.com','7422348',sysdate,'IT_PROG',15000, null,150,280);

delete from employees 
where department_id = (select department_id from departments where location_id=3300)
**

insert into (select employee_id, last_name, email, hire_date, job_id, salary, department_id 
from employees where department_id=50) 
values(9999, 'Taylor', 'DTatlor', to_date('07-jun-99', 'DD-MON-RR'),  'ST_CLERK',5000,50); 


create table dept
            (deptno Number(2), dname VARCHAR(14), loc VARCHAR(13), create_date DATE DEFAULT SYSDATE);

create table dept80 as
select employee_id, last_name, salary*12 ANNSAL, hire_date from employees where department_id=80;

create table  emp_copy
as select * from employees; 



 create table Roles
 (role_id number(2) not null primary key,
  name varchar(20) not null unique
 )

 create table Users
(id NUMBER(2) not null primary key,
name VARCHAR(20) not null,
username VARCHAR(20)unique not null,
 password VARCHAR(20) not null, 
 email varchar(20) unique not null ,
 role_id number(2) REFERENCES Roles(role_id))

alter table users add check(length(password)>=6);

 create table Users
(id NUMBER(2) not null primary key,
name VARCHAR(20) not null,
username VARCHAR(20)unique not null,
 password VARCHAR(20) not null check(length(password)>=8), 
 email varchar(20) unique not null ,
 role_id number(2) REFERENCES Roles(role_id))
 
 insert into Users values(&id,'&name','&username','&password','&email',&role_id);
update users set phone = '&phone' where id='&id';


create view empvu80 as select employee_id, last_name, salary from employees where department_id=80;


create or replace view dept_sum_vu(name,minsal, maxsal, avgsal)
as select d.department_name, min(e.salary), max(e.salary), avg(e.salary)
from employees e join departments d on( e.department_id =d.department_id) 
group by d.department_name;

create or replace view empvu10 (employee_number, employee_name, job_title)
as select employee_id, last_name, job_id from employees
where department_id =10
with read only;

	

insert into users values(user_id_seq1.nextval,'rohit','rohi45','det5438543y58','345y473',13,'bbg84gbg');

create view v1 as select id , name, email from users;

create synonym V1new for v1;

desc v1new;

select object_name, object_type, created,
status from user_objects 
order by object_type;


describe user_tab_columns

select sequence_name, min_value, max_value increment_by, 
last_number from user_sequences;

describe user_synonyms

select* from user_synonyms;

select* from user_tab_comments;


select column_name, data_type,data_length, 
data_precision,data_scale, nullable from user_tab_columns where table_name ='EMPLOYEES';

select constraint_name, constraint_type, search_condition, r_constraint_name, delete_rule, status 
from user_constraints where table_name='USERS';

select coNstraint_name, column_name from user_cons_columns where table_name ='USERS'

describe user_views

select distinct view_name from user_views



select text from user_views where view_name ='V1'


***********************************************************************************************************************

set serveroutput on;
declare 
a  number:=3;
begin 
a:= a+1;
DBMS_output.put_line(a);
end;
/




set serveroutput on;

declare
a number:=4;
b number:=1;
begin
a:=a+1;
if mod(a,2)=0 then 
DBMS_output.put_line(a);
else
DBMS_output.put_line(b);
end if;

end;
/


set serveroutput on;
declare
    i number:= 1;
begin
    loop
        insert into T1 values(i,i);
        i:=i+1;
        exit when i>100;
    end loop;
end;
/
select *from T1;



set serveroutput on;
declare
    i number:= 1;
begin
    while i<100 loop
        insert into T1 values(i,i);
        i:=i+1;
    end loop;
end;
/
select *from T1;




set serveroutput on;
declare
    i number;
begin
    for i in 1..100 loop
        insert into T1 values(i,i);

    end loop;
end;
/
select *from T1;



SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
  n_pct    employees.commission_pct%TYPE;
  v_eval   varchar2(10);
  n_emp_id employees.employee_id%TYPE := 145;
BEGIN
  -- get commission percentage
  SELECT commission_pct
  INTO n_pct
  FROM employees
  WHERE employee_id = n_emp_id;
 
  -- evalutate commission percentage
  CASE n_pct
    WHEN 0 THEN
      v_eval := 'N/A';
    WHEN 0.1 THEN
      v_eval := 'Low';
    WHEN 0.4 THEN
      v_eval := 'High';
    ELSE
      v_eval := 'Fair';
  END CASE;
  -- print commission evaluation
  DBMS_OUTPUT.PUT_LINE('Employee ' || n_emp_id || 
                       ' commission ' || TO_CHAR(n_pct) ||
                       ' which is '   || v_eval);
END;
/



SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
    n_usr_role_id users.role_id%TYPE ;
    n_usr_name users.name%TYPE :='avi';
    n_usr users.name%type;
    v_eval varchar2(20);
BEGIN
  -- get commission percentage
  SELECT name
  INTO n_usr
  FROM users
  WHERE name = n_usr_name;
 
  -- evalutate commission percentage
  CASE n_usr
    WHEN 'devv' THEN
      v_eval := 'admin';
    WHEN 'sid' THEN
      v_eval := 'user';
    WHEN 'avi' THEN
      v_eval := 'manager';
      WHEN 'sham' THEN
      v_eval := 'user';
      WHEN 'ram' THEN
      v_eval := 'manager';
      WHEN 'surbi' THEN
      v_eval := 'user';
    ELSE
      v_eval := 'none of the above';
  END CASE;
  -- print commission evaluation
  DBMS_OUTPUT.PUT_LINE('Employee, ' || n_usr || 
                       ' role is '   || v_eval);
END;
/


SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
    n_name users.name%TYPE :='Devv';
    v_role_id users.role_id%TYPE;
    v_role_name varchar2(10);
BEGIN
    SELECT ROLE_ID
    INTO v_role_id
    FROM users
    WHERE name=n_name;
    
    CASE v_role_id
        when 11 then
            v_role_name:='Admin';
        when 12 then
            v_role_name:='Manager';
        when 13 then
            v_role_name:='User';
         ELSE
      v_role_name := 'none of the above';
    end case;
    DBMS_output.put_line('User role is '||v_role_name);
end;
/



SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
    n_name employee_salary.name%TYPE :='Tara';
    v_gross_salary employee_salary.GROSS_SALARY%TYPE;
    v_val employee_salary.GROSS_SALARY%TYPE;
 BEGIN  
    SELECT GROSS_SALARY 
    INTO v_gross_salary
    FROM EMPLOYEE_SALARY
    WHERE name=n_name;
    
    CASE 
        WHEN v_gross_salary < 10000 THEN
             v_val:=0.1*v_gross_salary;
        WHEN v_gross_salary in(10000,20000) THEN
             v_val:=0.2*v_gross_salary;
        ELSE
            v_val:=0.3*v_gross_salary;
     end case;       
DBMS_output.put_line('User tax is '||v_val ||' and gross salary is '||v_gross_salary);
end;
/ 


SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
  n_emp_id EMPLOYEES.EMPLOYEE_ID%TYPE := &emp_id1;
BEGIN
  DECLARE
    n_emp_id employees.employee_id%TYPE := &emp_id2;
    v_name   employees.first_name%TYPE;
  BEGIN
    SELECT first_name
    INTO v_name
    FROM employees
    WHERE employee_id = n_emp_id;
 
    DBMS_OUTPUT.PUT_LINE('First name of employee ' || n_emp_id || 
                                       ' is ' || v_name);
    EXCEPTION
      WHEN no_data_found THEN
        DBMS_OUTPUT.PUT_LINE('Employee ' || n_emp_id || ' not found');
  END;
END;
/            
             



SET SERVEROUTPUT ON SIZE 1000000;
<<parent>>
DECLARE
  n_emp_no EMPLOYEE_SALARY.EMP_NO%TYPE := &emp_no;
  n_emp_name EMPLOYEE_SALARY.name%TYPE := '&emp_name';
  n_emp_basic EMPLOYEE_SALARY.basic%TYPE := &emp_basic;
  n_emp_hra EMPLOYEE_SALARY.hra%TYPE := &emp_hra;
  n_emp_da EMPLOYEE_SALARY.da%TYPE := &emp_da;
 n_emp_td EMPLOYEE_SALARY.TOTAL_DEDUCTION%TYPE := &emp_td;
  n_emp_netSal EMPLOYEE_SALARY.NET_SALARY%TYPE := &emp_netSal;
  n_emp_gross EMPLOYEE_SALARY.NET_SALARY%TYPE := &emp_gross;
BEGIN
  insert into Employee_salary values(n_emp_no,n_emp_name,n_emp_basic,n_emp_hra,n_emp_da,n_emp_td,n_emp_netSal,n_emp_gross);
  <<child>>
  DECLARE
    
    v_gross_salary   employee_salary.GROSS_SALARY%TYPE;
    v_val employee_salary.GROSS_SALARY%TYPE;
  BEGIN
    SELECT GROSS_SALARY
    INTO v_gross_salary
    FROM employee_salary
    WHERE name = parent.n_emp_name;
 
    CASE 
        WHEN v_gross_salary < 10000 THEN
             v_val:=0.1*v_gross_salary;
        WHEN v_gross_salary in(10000,20000) THEN
             v_val:=0.2*v_gross_salary;
        ELSE
            v_val:=0.3*v_gross_salary;
     end case;       
DBMS_output.put_line('User tax is '||v_val ||' and gross salary is '||v_gross_salary);

    EXCEPTION
      WHEN no_data_found THEN
        DBMS_OUTPUT.PUT_LINE('Employee ' || parent.n_emp_no || ' not found');
  END;
END;
/



SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT e.name as uname,
            d.name as rname
      FROM users e
      INNER JOIN roles d ON d.role_id = e.role_id;
 
  r_chief cur_chief%ROWTYPE;
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO r_chief;
 
    EXIT WHEN cur_chief%NOTFOUND;
 
    -- print department - chief
    DBMS_OUTPUT.PUT_LINE(r_chief.uname || ' - ' ||
                         r_chief.rname);
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/

SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
    E T2.A%TYPE;
    F T2.B%TYPE;
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT A,B
      FROM T2
      WHERE A<B
      FOR UPDATE;
 
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO E,F;
    
    EXIT WHEN cur_chief%NOTFOUND;
    
    UPDATE t2 set A=F, B=E where CURRENT OF cur_chief;
 
    DBMS_OUTPUT.PUT_LINE('done');
    
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/

SELECT * FROM T2;




    
SET SERVEROUTPUT ON SIZE 1000000;

DECLARE
    n_sal Emp_copy.Salary%TYPE;
    n_hire Emp_copy.hire_date%TYPE;
    n_new_sal Emp_copy.Salary%TYPE;
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT Salary
      FROM Emp_copy
      WHERE hire_date>'31-DEC-05'
      FOR UPDATE;
 
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO n_sal;
    
    EXIT WHEN cur_chief%NOTFOUND;
    n_new_sal:= n_sal*1.1;
    UPDATE Emp_copy set Salary=n_new_sal where CURRENT OF cur_chief;
 
   
    
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/

SELECT last_name ,salary, hire_date FROM EMP_COPY where hire_date>'31-DEC-05' order by last_name;








    
SET SERVEROUTPUT ON SIZE 1000000;

DECLARE
    F Emp_copy.first_name%TYPE;
    L Emp_copy.last_name%TYPE;
    H Emp_copy.hire_date%TYPE;
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT last_name, first_name, hire_date
      FROM Emp_copy
        where HIRE_DATE=(select min(hire_date)from emp_copy);
 
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO F,L,H;
    
    EXIT WHEN cur_chief%NOTFOUND;
    
    DBMS_OUTPUT.PUT_LINE('The oldest employee is '||f|| ' - ' ||
                         l);
 
   
    
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/




    
SET SERVEROUTPUT ON SIZE 1000000;

DECLARE
    
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT last_name, first_name, hire_date
      FROM Emp_copy
        where HIRE_DATE=(select min(hire_date)from emp_copy);
  r_chief cur_chief%ROWTYPE;
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
   
    FETCH cur_chief INTO r_chief;
    
    EXIT WHEN cur_chief%NOTFOUND;
    
    DBMS_OUTPUT.PUT_LINE(r_chief.first_name|| ' - ' ||
                         r_chief.last_name);
 
   
    
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/



SET SERVEROUTPUT ON SIZE 1000000;

DECLARE


  Cursor cur_chief IS
    select users.name uname, roles.name rname
    from users inner join roles on users.role_id = roles.role_id;
    r_chief cur_chief%ROWTYPE;
    n_emp_no users.id%TYPE := 2;
BEGIN
 OPEN cur_chief;
 LOOP
    FETCH cur_chief into r_chief;
    
    EXIT WHEN cur_chief%NOTFOUND;
  
  DBMS_OUTPUT.PUT_LINE(r_chief.uname || ',' || r_chief.rname );
  end LOOP;    
END;
/




SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
  r_emp employees%ROWTYPE;
  n_emp_id  employees.employee_id%TYPE := 200;
BEGIN
  SELECT *
  INTO r_emp
  FROM employees
  WHERE employee_id = n_emp_id;
  -- print out the employee's first name
  DBMS_OUTPUT.PUT_LINE(r_emp.first_name);
END;
/


SET SERVEROUTPUT ON SIZE 1000000;
DECLARE
  TYPE t_name IS RECORD(
     uname users.name%TYPE,
     rname  roles.name%TYPE
  );
  r_name   t_name; -- name record
  n_emp_no users.id%TYPE := 2;
BEGIN
  SELECT users.name,
        roles.name
  INTO r_name
  FROM users inner join roles on users.role_id = roles.role_id
  WHERE users.id = n_emp_no;
  
  DBMS_OUTPUT.PUT_LINE(r_name.uname || ',' || r_name.rname );
END;
/



SET SERVEROUTPUT ON SIZE 1000000;
clear screen;
DECLARE
  TYPE t_user IS RECORD(
     uname users.name%TYPE,
     rname  roles.name%TYPE
  );
  r_user   t_user; -- name record
  Cursor cur_chief IS
    select users.name, roles.name
    from users inner join roles on users.role_id = roles.role_id;
    
  n_emp_no users.id%TYPE := 2;
BEGIN
 OPEN cur_chief;
 LOOP
    FETCH cur_chief into r_user;
    
    EXIT WHEN cur_chief%NOTFOUND;
  
  DBMS_OUTPUT.PUT_LINE(r_user.uname || ',' || r_user.rname );
  end LOOP;    
END;
/


ET serveroutput ON SIZE 1000000;
DECLARE
  TYPE t_name IS RECORD(
    first_name employees.first_name%TYPE,
    last_name employees.last_name%TYPE
  );
  r_name      t_name;
  r_name2     t_name;
  r_name_null t_name;
  n_emp_id employees.employee_id%TYPE := 200;
BEGIN
  -- assign employee's infomation to record
  SELECT first_name,
         last_name
  INTO r_name
  FROM employees
  WHERE employee_id = n_emp_id;
 
  -- assign record to another record
  r_name2 := r_name;
  -- print out the employee's name
  DBMS_OUTPUT.PUT_LINE(r_name2.first_name || ',' || r_name2.last_name);
 
  -- assign record to NULL
  r_name2 := r_name_null; 
 
  -- check NULL for each individual field
  IF r_name2.first_name IS NULL AND
     r_name2.last_name IS NULL THEN
    DBMS_OUTPUT.PUT_LINE('Record r_name2 is NULL');
  END IF;
 
END;
/










************************************************************************************


clear screen;
SET SERVEROUTPUT ON SIZE 1000000;

DECLARE
Cursor cur_chief IS
    select e.employee_id,e.first_name,d.department_name,d.department_id,l.location_id, l.city
    from employees e, departments d, locations l 
    WHERE e.department_id=d.department_id and d.location_id=l.location_id;
r_chief cur_chief%ROWTYPE;   

  TYPE t_emp IS RECORD(
     empid employees.EMPLOYEE_ID%TYPE,
     fname employees.first_name%TYPE
     
  );
TYPE t_dept IS RECORD(
     deptname departments.department_name%TYPE,
     deptid  departments.department_id%TYPE
   
  );
TYPE t_loc IS RECORD(
     loccity locations.location_id%TYPE,
     locid  locations.city%TYPE
     
  ); 
Type t_org IS RECORD(
    e  t_emp,
    d  t_dept,
    l  t_loc
);
  org1 t_org;

BEGIN

OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO r_chief;
    
    EXIT WHEN cur_chief%NOTFOUND;
    org1.e.empid:=r_chief.employee_id;
    org1.d.deptname:= r_chief.department_name;
    org1.l.loccity :=r_chief.city;

    DBMS_OUTPUT.PUT_LINE( org1.e.empid ||','|| org1.d.deptname ||' , '||org1.l.loccity );
    
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/

