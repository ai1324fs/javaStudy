select * from marry
select 이름, 성별, 나이, 운동여부, 음주여부, 흡연여부,
    (case
    when 재산 >= 500 then 'S급'
    when 재산 between 300 and 499 then 'A급'
    when 재산 between 200 and 299 then 'B급'
    when 재산 between 100 and 199 then 'C급'
    else 'D급'
    end )as 재산등급 ,
    (case
    when 연봉 >= 500 then 'S급'
    when 연봉 between 300 and 499 then 'A급'
    when 연봉 between 200 and 299 then 'B급'
    when 연봉 between 100 and 199 then 'C급'
    else 'D급'
    end )as 연봉등급 ,
        (case
    when mem_height >= 183 then 'S급'
    when mem_height between 180 and 182.99 then 'A급'
    when mem_height between 175 and 179.99 then 'B급'
    when mem_height between 170 and 174.99 then 'C급'
    else 'D급'
    end )as 키등급 , 
    (case
    when 키 >= 183 then 'S급'
    when 키 between 180 and 182.99 then 'A급'
    when 키 between 175 and 179.99 then 'B급'
    when 키 between 170 and 174.99 then 'C급'
    else 'D급'
    end )as 키등급
    
from marry;

commit;
