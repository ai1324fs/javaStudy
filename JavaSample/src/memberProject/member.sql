select * from tab;

create table member(
    mem_no varchar2(20)not null,
    mem_pw varchar2(4)not null,
    mem_name varchar2(9) not null, 
    mem_gender char(1) not null,  
    mem_propertym number(10) not null,
    mem_height number(5,2) not null,
    mem_weight number(5,2) not null,
    mem_age number(2),
    mem_paym number(5),
    mem_exercise char(1),
    mem_drink char(1),
    mem_smoking char(1),

    
    constraint mem_no primary key(mem_no)--회원번호(주민번호):고유값/ 
);


select * from member;
select * from MARRYINFORMATION;
select * from memberrr;

drop table member;-- 테이블 삭제, 데이터 삭제
drop table MARRYINFORMATION;
drop table memberrr;

insert into member values('980524', 1234, '옥한빛', 'F', 123, 177.32, 80.12, 25, 240, 'O', 'X', 'X');
insert into member values('931126', 1234, '이태연', 'M', 100,  162.25, 50.0, 30, 400, 'O', 'O', 'X');
insert into member values('990201', 1234, '유가인', 'F', 55, 154, 47, 23, 290, 'X', 'O', 'X');
insert into member values('880417', 1234, '조민우', 'M', 989, 188.00, 90.00, 35, 440, 'X', 'O', 'O' );
insert into member values('960821', 1234, '심수정', 'F', 777, 168.00, 45.00, 27, 2000, 'X', 'O', 'O');
insert into member values('941212', 1234, '박희철', 'M', 22, 152, 63, 29, 340, 'O', 'O', 'O');
insert into member values('910505', 1234, '김언중', 'M', 3, 166, 67, 32, 680, 'O', 'X', 'O');
insert into member values('910506', 1234, '진현무', 'F', 512, 174, 64, 32, 560, 'O', 'X', 'X');
insert into member values('950723', 1234, '김종헌', 'M', 85, 198.32, 73, 28, 300, 'O', 'O', 'O');


select mem_name, mem_exercise, mem_drink, mem_smoking,
    (case
    when mem_propertym >= 500 then 's급'
    when mem_propertym between 300 and 499 then 'A급'
    when mem_propertym between 200 and 299 then 'B급'
    when mem_propertym between 100 and 199 then 'C급'
    else 'D급'
    end )as 재산등급 ,
    (case
    when mem_paym >= 500 then 's급'
    when mem_paym between 300 and 499 then 'A급'
    when mem_paym between 200 and 299 then 'B급'
    when mem_paym between 100 and 199 then 'C급'
    else 'D급'
    end )as 연봉등급 ,
        (case
    when mem_height >= 183 then 's급'
    when mem_height between 180 and 182.99 then 'A급'
    when mem_height between 175 and 179.99 then 'B급'
    when mem_height between 170 and 174.99 then 'C급'
    else 'D급'
    end )as 키등급 , 
    (case
    when mem_height >= 183 then 's급'
    when mem_height between 180 and 182.99 then 'A급'
    when mem_height between 175 and 179.99 then 'B급'
    when mem_height between 170 and 174.99 then 'C급'
    else 'D급'
    end )as 키등급
    
from member;

commit;

--------------------------------------------------------------------------------

select * from tab;


create table memberrr(
    memm_no number(6)not null,
    memm_name varchar2(9) not null, 
    memm_gender char(1) not null,  
    memm_propertym number(10) not null,
    memm_height number(5,2) not null,
    memm_weight number(5,2) not null,
    memm_age number(2),
    memm_paym number(5),
    memm_exercise char(1),
    memm_drink char(1),
    memm_smoking char(1),

    
    constraint memm_no primary key(memm_no)--회원번호(생년월일):고유값/ 
);


select * from memberrr;

drop table memberrr;-- 테이블 삭제, 데이터 삭제

insert into memberrr values(980524, '옥한빛', 'F', 123, 177.32, 80.12, 25, 240, 'O', 'X', 'X');
insert into memberrr values(931126, '이태연', 'M', 100,  162.25, 50.0, 30, 400, 'O', 'O', 'X');
insert into memberrr values(990201, '유가인', 'F', 55, 154, 47, 23, 290, 'X', 'O', 'X');
insert into memberrr values(880417, '조민우', 'M', 989, 188.00, 90.00, 35, 440, 'X', 'O', 'O' );
insert into memberrr values(960821, '심수정', 'F', 777, 168.00, 45.00, 27, 2000, 'X', 'O', 'O');
insert into memberrr values(941212, '박희철', 'M', 22, 152, 63, 29, 340, 'O', 'O', 'O');
insert into memberrr values(910505, '김언중', 'M', 3, 166, 67, 32, 680, 'O', 'X', 'O');
insert into memberrr values(910506, '진현무', 'F', 512, 174, 64, 32, 560, 'O', 'X', 'X');
insert into memberrr values(950723, '김종헌', 'M', 85, 198.32, 73, 28, 300, 'O', 'O', 'O');


select memm_no, memm_name, memm_gender, memm_age, memm_exercise, memm_drink, memm_smoking,
    (case
    when memm_propertym >= 500 then 's급'
    when memm_propertym between 300 and 499 then 'A급'
    when memm_propertym between 200 and 299 then 'B급'
    when memm_propertym between 100 and 199 then 'C급'
    else 'D급'
    end )as 재산등급 ,
    (case
    when memm_paym >= 500 then 's급'
    when memm_paym between 300 and 499 then 'A급'
    when memm_paym between 200 and 299 then 'B급'
    when memm_paym between 100 and 199 then 'C급'
    else 'D급'
    end )as 연봉등급 ,
        (case
    when memm_height >= 183 then 's급'
    when memm_height between 180 and 182.99 then 'A급'
    when memm_height between 175 and 179.99 then 'B급'
    when memm_height between 170 and 174.99 then 'C급'
    else 'D급'
    end )as 키등급 

    
from memberrr;

commit;
