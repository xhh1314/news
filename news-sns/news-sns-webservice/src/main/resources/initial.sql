create table sns_forum(
  forum_id BIGINT PRIMARY KEY ,
  name VARCHAR(50) not null,
  describle VARCHAR(255),
  site_id    SMALLINT unsigned,
  status ENUM('1','2'),
  create_time TIMESTAMP DEFAULT current_timestamp
);
DROP TABLE sns_forum;
