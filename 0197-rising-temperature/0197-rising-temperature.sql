# Write your MySQL query statement below
SELECT W1.ID FROM WEATHER W1 
JOIN WEATHER W2 ON DATE_ADD(W2.RECORDDATE,INTERVAL 1 DAY) = W1.RECORDDATE 
WHERE W1.TEMPERATURE > W2.TEMPERATURE;