SELECT * FROM TAB;

CREATE TABLE MARRY(
    ID VARCHAR2(6) NOT NULL,
    PW NUMBER(4) NOT NULL,
    이름 VARCHAR2(15) NOT NULL,
    성별 VARCHAR2(6) NOT NULL,
    나이 NUMBER(3) NOT NULL,
    재산 NUMBER(10) NOT NULL,
    연봉 NUMBER(10) NOT NULL,
    키 NUMBER(5,2) NOT NULL,
    몸무게 NUMBER(5,2) NOT NULL,
    운동여부 CHAR(1) NOT NULL,
    음주여부 CHAR(1) NOT NULL,
    흡연여부 CHAR(1) NOT NULL,
    
    CONSTRAINT ID PRIMARY KEY(ID) --ID : 고유값

    );
    
    SELECT * FROM MARRY;
    
    SELECT 이름, 성별, 나이, 
    	(CASE
    	WHEN 재산 >= 100000 THEN 'S'
    	WHEN 재산 BETWEEN 50000 AND 99999 THEN 'A'
    	WHEN 재산 BETWEEN 30000 AND 49999 THEN 'B'
    	WHEN 재산 BETWEEN 10000 AND 29999 THEN 'C'
    	WHEN 재산 BETWEEN 5000 AND 9999 THEN 'D'
    	ELSE 'E'
    	END )AS 재산등급,
    	(CASE
    	WHEN 연봉 >= 100000 THEN 'S'
    	WHEN 연봉 BETWEEN 50000 AND 99999 THEN 'A'
    	WHEN 연봉 BETWEEN 30000 AND 49999 THEN 'B'
    	WHEN 연봉 BETWEEN 10000 AND 29999 THEN 'C'
    	WHEN 연봉 BETWEEN 5000 AND 9999 THEN 'D'
    	ELSE 'E'
    	END )AS 연봉등급,
    	(CASE
    	WHEN 키 >= 185 THEN 'S'
    	WHEN 키 BETWEEN 180 AND 184.99 THEN 'A'
    	WHEN 키 BETWEEN 177 AND 179.99 THEN 'B'
    	WHEN 키 BETWEEN 175 AND 176.99 THEN 'C'
    	WHEN 키 BETWEEN 170 AND 174.99 THEN 'D'
    	ELSE 'E'
    	END )AS 키등급
    	
    FROM MARRY WHERE 성별 LIKE '남성' ORDER BY 나이;
    
        SELECT 이름, 성별, 나이, 
    	(CASE
    	WHEN 재산 >= 100000 THEN 'S'
    	WHEN 재산 BETWEEN 50000 AND 99999 THEN 'A'
    	WHEN 재산 BETWEEN 30000 AND 49999 THEN 'B'
    	WHEN 재산 BETWEEN 10000 AND 29999 THEN 'C'
    	WHEN 재산 BETWEEN 5000 AND 9999 THEN 'D'
    	ELSE 'E'
    	END)AS 재산등급,
    	(CASE
    	WHEN 연봉 >= 100000 THEN 'S'
    	WHEN 연봉 BETWEEN 50000 AND 99999 THEN 'A'
    	WHEN 연봉 BETWEEN 30000 AND 49999 THEN 'B'
    	WHEN 연봉 BETWEEN 10000 AND 29999 THEN 'C'
    	WHEN 연봉 BETWEEN 5000 AND 9999 THEN 'D'
    	ELSE 'E'
    	END)AS 연봉등급,
    	(CASE
    	WHEN 키 >= 175 THEN 'S'
    	WHEN 키 BETWEEN 170 AND 174.99 THEN 'A'
    	WHEN 키 BETWEEN 165 AND 169.99 THEN 'B'
    	WHEN 키 BETWEEN 160 AND 164.99 THEN 'C'
    	WHEN 키 BETWEEN 157 AND 159.99 THEN 'D'
    	ELSE 'E'
    	END)AS 키등급
    	
    FROM MARRY WHERE 성별 LIKE '여성' ORDER BY 나이;
    
    DROP TABLE MARRY;
    
    INSERT INTO MARRY VALUES('123456', 1234, '예시요', '남성', 34, 100000, 10000, 180.00, 80.00, 'O', 'O', 'O');
    INSERT INTO MARRY VALUES('123123', 1234, '예시요', '여성', 34, 100000, 10000, 180.00, 80.00, 'O', 'O', 'O');
    
    COMMIT;