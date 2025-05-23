CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100)
);

CREATE TABLE jobs (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  description TEXT
);

CREATE TABLE applications (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  user_id BIGINT,
  job_id BIGINT,
  status VARCHAR(50),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (job_id) REFERENCES jobs(id)
);

CREATE TABLE interviews (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  application_id BIGINT,
  interview_date TIMESTAMP,
  feedback TEXT,
  FOREIGN KEY (application_id) REFERENCES applications(id)
);