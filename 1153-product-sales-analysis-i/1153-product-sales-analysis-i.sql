# Write your MySQL query statement below

SELECT P.PRODUCT_NAME,S.YEAR,S.PRICE FROM SALES S LEFT JOIN PRODUCT P ON P.PRODUCT_ID = S.PRODUCT_ID ;