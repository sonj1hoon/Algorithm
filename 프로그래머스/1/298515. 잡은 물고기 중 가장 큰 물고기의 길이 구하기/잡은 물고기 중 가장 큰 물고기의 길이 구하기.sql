-- 코드를 작성해주세요
SELECT CONCAT(FORMAT(MAX(LENGTH),2),"cm") AS MAX_LENGTH
FROM FISH_INFO
WHERE LENGTH > 10;