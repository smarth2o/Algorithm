-- 코드를 입력하세요
SELECT month(start_date) month, car_id, count(*) records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (
    SELECT car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where start_date between '2022-08-01' and '2022-10-31'
    group by car_id
    having count(*) >= 5
) and start_date between '2022-08-01' and '2022-10-31'
group by month, car_id
having records > 0
order by month asc, car_id desc