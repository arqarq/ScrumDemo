create database addressbook;
create user 'springuser'@'%' identified by 'sda';
grant all on addressbook.* to 'springuser'@'%';
revoke all on addressbook.* from 'springuser'@'%';
grant select, insert, delete, update on addressbook.* to 'springuser'@'%';
select *
from addressbook.contact;
