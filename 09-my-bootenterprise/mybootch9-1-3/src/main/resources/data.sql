insert into SYS_USER (id,username,password) values (1,'zc','zc');
insert into SYS_USER (id,username,password) values (2,'zccoder','zccoder');

insert into SYS_ROLE (id,name) values (1,'ROLE_ADMIN');
insert into SYS_ROLE (id,name) values (2,'ROLE_USER');

insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) VALUES(1,1);
insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) VALUES(2,2);
