
insert into mst_employee (employee_id, employee_last_name, employee_first_name, role_id) values('01', '管理', '太郎', 'ROLE_ADMIN');
insert into mst_employee (employee_id, employee_last_name, employee_first_name, role_id) values('02', '一般', '二郎', 'ROLE_USER');
insert into mst_role (role_id, role_name) values('ROLE_ADMIN', '管理者');
insert into mst_role (role_id, role_name) values('ROLE_USER', '一般');
insert into mst_password (mst_password_id, employee_id, password) values(1, '01', '$2a$10$1gJJgBlL75OIjkSgkYPXI.mV7ihEPjxIiCkXKBEc7/r9xUIjZyc9i');
insert into mst_password (mst_password_id, employee_id, password) values(2, '02', '$2a$10$1gJJgBlL75OIjkSgkYPXI.mV7ihEPjxIiCkXKBEc7/r9xUIjZyc9i');