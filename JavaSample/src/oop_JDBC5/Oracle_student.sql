select * from student;


    stu_no number(8), --학번
    stu_name varchar2(12) not null, -- 이름
    stu_dept varchar2(20) not null, -- 전공
    stu_grade number(1) not null, -- 학년
    stu_class char(3) not null,--반 
    stu_gender char(1) not null, -- 성별
    stu_height number(5,2), -- 키 / null 허용
    stu_weight number(5,2) not null, -- 몸무게
    constraint stu_no primary key (stu_no)     -- primary key = identifier => unique /식별
\

delete from student where stu_no = 2022;
 insert into student values (20131026, '옥성우2', '컴퓨터정보', 2, 'B', 'F', 172.66, 63.55);