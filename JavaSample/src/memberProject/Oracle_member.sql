select mem_no, mem_name, (  case
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
    end )as 연봉등급
    
from member;