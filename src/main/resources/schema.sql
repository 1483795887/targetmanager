drop table task;
drop table diary;
CREATE TABLE task
(
  id                 int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  current_progress    int             NOT NULL,
  target_progress     int             NOT NULL,
  start_date         varchar(10)     NOT NULL,
  last_modified_date varchar(10)     NOT NULL,
  name               varchar(20)     NOT NULL
);

CREATE TABLE diary
(
  id    int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title varchar(10)     NOT NULL,
  date  varchar(10)     NOT NULL,
  text  varchar(200)    NOT NULL
);