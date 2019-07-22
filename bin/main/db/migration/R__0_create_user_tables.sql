-- 従業員マスタ
CREATE TABLE mst_employee(
    employee_id varchar(10) NOT NULL ,
    employee_last_name varchar(50) ,
    employee_first_name varchar(50),
    role_id varchar(20) NOT NULL ,
    version int ,
    insert_user varchar(20),
    insert_date timestamp ,
    update_user varchar(20),
    update_date timestamp,
    PRIMARY KEY (employee_id)
);
