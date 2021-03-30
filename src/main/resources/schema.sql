DROP TABLE IF EXISTS tasks;

CREATE TABLE tasks (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL,
                              status VARCHAR(250) NOT NULL
);