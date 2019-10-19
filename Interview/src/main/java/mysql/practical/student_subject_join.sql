create table student(st_id int primary key, student_name varchar(20));

create table subject(sub_id int primary key, subject_name varchar(20));

create table stud_sub_mapping (st_id int,sub_id int,
primary key (st_id, sub_id),
foreign key (st_id) references student(st_id),
foreign key (sub_id) references subject(sub_id) );


mysql> select * from student;
+-------+--------------+
| st_id | student_name |
+-------+--------------+
|     1 | konara       |
|     2 | rajith       |
|     3 | supitha      |
|     4 | ashinsahra   |
|     5 | saman        |
+-------+--------------+
5 rows in set (0.01 sec)

mysql> select  * from subject;
+--------+---------------+
| sub_id | subject_name  |
+--------+---------------+
|      1 | Math          |
|      2 | bio           |
|      3 | history       |
|      4 | science       |
|      5 | geo           |
+--------+---------------+
5 rows in set (0.00 sec)

mysql> select  * from stud_sub_mapping;
+-------+--------+
| st_id | sub_id |
+-------+--------+
|     1 |      1 |
|     1 |      2 |
|     3 |      2 |
|     2 |      4 |
|     3 |      5 |
+-------+--------+
5 rows in set (0.00 sec)


Q - 1  Get the number of studets who doing the subject "bio";

SELECT count("sub_id") FROM stud_sub_mapping
INNER JOIN subject ON subject.sub_id = stud_sub_mapping.sub_id WHERE subject.subject_name = "bio";


Q - 2 Return subject names done by a particular student.

SELECT sub.subject_name FROM subject sub
INNER JOIN stud_sub_mapping map ON sub.sub_id = map.sub_id
INNER JOIN student st ON map.st_id = st.st_id where student_name = "konara";