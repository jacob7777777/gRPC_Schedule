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
  date_booked DATE,
  PRIMARY KEY (time_entry)
);

INSERT INTO Professional_timesheet VALUES ( 2,2,1, 1, '2000-01-01');
SELECT * FROM scheduler_db.professional_timesheet WHERE date_booked BETWEEN CAST("2009-12-31" AS DATE) AND CAST("2010-12-31" AS DATE);
SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = "Producer" AND date_booked BETWEEN CAST("2009-12-31" AS DATE) AND CAST("2010-12-31" AS DATE);
SELECT * FROM scheduler_db.professional_profile INNER JOIN professional_timesheet USING (card_number) WHERE task = "Producer" AND DATE(date_booked) = '2010-10-10';