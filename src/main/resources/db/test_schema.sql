DROP TABLE IF EXISTS com_user;

CREATE TABLE com_user
(
    id int(20)  NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    user_name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    user_pwd  VARCHAR(30) NULL DEFAULT NULL COMMENT '密码',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);