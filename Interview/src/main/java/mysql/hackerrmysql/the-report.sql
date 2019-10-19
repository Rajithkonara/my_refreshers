-- https://www.hackerrank.com/challenges/the-report/problem

-- CASE --
CASE expression
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
   ...
    WHEN conditionN THEN resultN
    ELSE result
END


SELECT (CASE WHEN
        grade < 8 THEN
        NULL
        ELSE NAME END)  name, grade, marks
        FROM STUDENTS, GRADES WHERE marks BETWEEN min_Mark and Max_Mark
        ORDER BY grade DESC, name, decode(name, NULL, marks);


SELECT (CASE WHEN g.grade < 8 THEN NULL ELSE s.name END),
        g.grade, s.marks FROM
        STUDENTS s INNER JOIN GRADES g ON s.marks
        BETWEEN min_mark AND max_mark
        ORDER BY g.grade DESC, s.name, s.marks;

