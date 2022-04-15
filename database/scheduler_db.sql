CREATE DATABASE IF NOT EXISTS scheduler_db;

USE scheduler_db;

DROP TABLE IF EXISTS Professional_profile;
CREATE TABLE Professional_profile (
  card_number INT,
  task VARCHAR(50),
  cap_prof_mon FLOAT(3,2),
  cap_prof_tue FLOAT(3,2),
  cap_prof_wed FLOAT(3,2),
  cap_prof_thu FLOAT(3,2),
  cap_prof_fri FLOAT(3,2),
  PRIMARY KEY (card_number)
);

DROP TABLE IF EXISTS Professional_timesheet;
CREATE TABLE Professional_timesheet (
  time_entry INT AUTO_INCREMENT NOT NULL,
  card_number INT,
  job_number INT,
  hours_booked FLOAT(3,2),
  day_booked INT,
  month_booked INT,
  year_booked INT,
  PRIMARY KEY (time_entry)
);

INSERT INTO Professional_timesheet VALUES ( 2,1, 1, 1, 1, 1, 2000);
