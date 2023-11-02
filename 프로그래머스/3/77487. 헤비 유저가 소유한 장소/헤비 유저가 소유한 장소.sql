-- 코드를 입력하세요
SELECT *
FROM PLACES
WHERE HOST_ID in (
    select HOST_ID
    FROM PLACES
    group by HOST_ID
    having count(*) >= 2
)