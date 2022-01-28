-- Создайте таблицу студенты (students): id, имя, серия паспорта, номер паспорта;
-- Пара серия-номер паспорта должны быть уникальны в таблице Студенты;
create table students
(id serial primary key not null, name text not null, pas_ser numeric not null, pas_num numeric not null);

-- Создайте таблицу Предметы (subjects): id, название предмета;
create table subjects (id serial primary key,name text);

-- Создайте таблицу Успеваемость (progress): id, студент, предмет, оценка;
-- Оценка может находиться в пределах от 2 до 5;
-- При удалении студента из таблицы, вся его успеваемость тоже должна быть удалена;
create table progerss (id serial primary key,
student_id integer not null,
subject_id integer not null,
foreign key (student_id) references students(id) on delete cascade,
foreign key (subject_id) references subjects(id) on delete cascade,
score numeric not null check (score >= 2 and score <= 5));

-- Вывести список студентов, сдавших определенный предмет, на оценку выше 3;
select students.name from students join progress on students.id = progress.student_id where progress.mark >=3 and progress.subject_id = 2;

-- Посчитать средний бал по определенному предмету;
select subjects.name,avg(progress.mark) from progress join subjects on progress.subject_id = subjects.id group by 1;

-- Посчитать средний балл по определенному студенту;
select students.name, avg(progress.mark) from progress join students on progress.student_id = students.id group by 1;

-- Найти три предмета, которые сдали наибольшее количество студентов.
select subjects.name from subjects join progress on subjects.id = progress.subject_id where progress.mark >= 3;

