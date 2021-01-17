show databases;
use world;
create table employee(ename char(20),eid int,age int,dept char(10),designation char(20),salary double,doj varchar(20));
insert into employee values("susan",100,24,"cse","Professor",60000,"26-11-2003");
insert into employee values("ravi",101,26,"ece","Asst.Professor",50000,"16-10-2008");
insert into employee values("keerthi",102,31,"eee","Professor",60000,"09-08-2001");
insert into employee values("sampath",103,28,"mech","Asst.Professor",50000,"24-02-2006");
insert into employee values("amritha",104,34,"cse","Professor",60000,"20-12-2007");
select * from employee;
delete from employee where eid=103;
update employee 
SET salary = 55000
WHERE eid=100;
alter table employee add(address char(30));