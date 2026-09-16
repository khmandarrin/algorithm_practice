-- 코드를 입력하세요
SELECT DISTINCT c.CAR_ID, c.CAR_TYPE, daily_fee*30*(1-(discount_rate/100)) as FEE
FROM CAR_RENTAL_COMPANY_CAR c
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN p ON c.CAR_TYPE = p.CAR_TYPE
WHERE c.car_type IN ('세단', 'SUV')
AND NOT EXISTS (
    SELECT *
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY h
    WHERE c.CAR_ID = h.CAR_ID
    AND h.START_DATE <= '2022-11-30'
    AND h.END_DATE >= '2022-11-01'
    )
AND duration_type = '30일 이상' AND daily_fee*30*(1-(discount_rate/100)) >= 500000 AND daily_fee*30*(1-(discount_rate/100)) < 2000000
ORDER BY FEE DESC, c.CAR_TYPE, c.CAR_ID DESC