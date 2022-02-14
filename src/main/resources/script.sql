BEGIN;

drop table if exists items cascade;
create table items (id serial not null primary key, val int, version bigint default 0);
insert into items (val) values
(0),(0),(0),(0),(0),(0),(0),(0),(0),(0),
(0),(0),(0),(0),(0),(0),(0),(0),(0),(0),
(0),(0),(0),(0),(0),(0),(0),(0),(0),(0),
(0),(0),(0),(0),(0),(0),(0),(0),(0),(0);

COMMIT;