-- выведите всю таблицу
SELECT * FROM jagers;
-- отобразите только не уничтоженных роботов
SELECT * FROM jagers WHERE status = true;
-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jagers WHERE mark IN ('Mark-1', 'Mark-6');
-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jagers ORDER BY mark DESC;
-- отобразите самого старого робота
SELECT * FROM jagers WHERE launch = (SELECT MIN(launch) FROM jagers);
-- отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jagers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jagers);
SELECT * FROM jagers WHERE kaijukill = (SELECT MIN(kaijukill) FROM jagers);
-- отобразите средний вес роботов
SELECT AVG(weight) AS average_weight FROM jagers;
-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jagers SET kaijukill = kaijukill + 1 WHERE status = true;
-- удалите уничтоженных роботов
DELETE FROM jagers WHERE status = false;
-- выведите всю таблицу
SELECT * FROM jagers;