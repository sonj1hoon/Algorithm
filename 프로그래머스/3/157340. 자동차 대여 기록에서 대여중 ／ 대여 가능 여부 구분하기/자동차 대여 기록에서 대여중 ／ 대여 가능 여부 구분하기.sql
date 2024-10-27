-- 코드를 입력하세요
SELECT DISTINCT(CAR_ID),
CASE 
    WHEN CAR_ID in 
    (SELECT CAR_ID 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE to_char(start_date, 'yyyy-mm-dd') <= '2022-10-16' 
        and to_char(end_date, 'yyyy-mm-dd') >= '2022-10-16')
    THEN '대여중'
    ELSE '대여 가능'
END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
ORDER BY CAR_ID DESC;





