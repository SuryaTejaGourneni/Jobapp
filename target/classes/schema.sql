CREATE TABLE user (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100)
);

CREATE TABLE job (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  description TEXT
);

CREATE TABLE application (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  user_id BIGINT,
  job_id BIGINT,
  status VARCHAR(50),
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (job_id) REFERENCES job(id)
);
CREATE TABLE interview (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  application_id BIGINT,
  interview_date TIMESTAMP,
  feedback TEXT,
  FOREIGN KEY (application_id) REFERENCES application(id)
);