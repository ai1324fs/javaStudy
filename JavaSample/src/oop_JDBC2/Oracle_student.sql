
create table student (
    stu_no number(8), --java에서의 int, 하지만 실수형으로 넣어도 알아서 처리함
    stu_name varchar2(12) not null,  --java에서의 String
    stu_dept varchar2(20) not null, --()안은 자릿수, number(5,2)면 전체 자릿수5, 소숫점 아래 두자리까지(즉, xxx.xx)
    stu_grade number(1) not null,
    stu_class char(3) not null,
    stu_gender char(1) not null,
    stu_height number(5,2), --not null : 반드시 값을 입력, 없으면 상관 없음
    stu_weight number(5,2) not null,
    CONSTRAINT stu_no primary key(stu_no) --identified(식별자) => unique -> 겹치면 에러
);

select * from student; --드래그 후, alt + x

insert into student values(20131030, '옥성우2', '컴퓨터정보', 2, 'B', 'F', 172.45, 64.56);