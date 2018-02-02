create table sns_forum(
  forum_id BIGINT PRIMARY KEY ,
  name VARCHAR(50) not null,
  describle VARCHAR(255),
  site_id    SMALLINT unsigned,
  status ENUM('1','2'),
  create_time TIMESTAMP DEFAULT current_timestamp
);
DROP TABLE sns_forum;

create table sns_subject(
subject_id bigint PRIMARY key,
forum_id bigint,
content text,
user_id bigint,
number_of_comment int unsigned,
num_of_like int unsigned
);
