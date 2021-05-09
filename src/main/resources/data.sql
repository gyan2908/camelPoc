CREATE TABLE Student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL,
  admissionDate Date
);
INSERT INTO Student (first_name, last_name, career,admissionDate) VALUES
  ('Aliko', 'Dangote', 'Industrialist', TO_DATE( '1-DEC-2021:1024:12:12', 'DD-MON-YYYY:HH24:MI:SS' )),
  ('Bill', 'Gates', 'Tech Entrepreneur', TO_DATE( '2-DEC-2021:1124:12:12', 'DD-MON-YYYY:HH24:MI:SS' )),
  ('Folrunsho', 'Alakija', 'Oil Magnate', TO_DATE( '3-DEC-2021:0924:12:12', 'DD-MON-YYYY:HH24:MI:SS' ));