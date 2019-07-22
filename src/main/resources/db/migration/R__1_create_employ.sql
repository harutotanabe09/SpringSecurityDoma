-- パスワードマスタ
CREATE TABLE mst_password(
    mst_password_id int NOT NULL ,
    employee_id varchar(10) NOT NULL,
    password varchar(256) ,
    generation varchar(2) ,
    version int ,
    insert_user varchar(20) ,
    insert_date timestamp ,
    update_user varchar(20) ,
    update_date timestamp ,
    PRIMARY KEY (mst_password_id)
);

-- 権限マスタ
CREATE TABLE mst_role(
    role_id varchar(20) NOT NULL,
    role_name varchar(100),
    version int ,
    insert_user varchar(20) ,
    insert_date timestamp ,
    update_user varchar(20),
    update_date timestamp ,
    PRIMARY KEY (role_id)
);