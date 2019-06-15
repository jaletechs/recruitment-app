INSERT INTO USER(email, password, active, staff) VALUES ( 'admin@gmail.com', '$2a$10$qkgHAwJWwvFEAg7992m8I.jyBYeCkKZh0GhxWCLTAoCz8TyIDET6i', '1', '1' );

INSERT INTO ROLE(id, name) VALUES ('UPLOAD_APPLICANT_DATA', 'Upload Applicant Data');
INSERT INTO ROLE(id, name) VALUES ('VIEW_TEST_RESULTS', 'View Test Results');

INSERT INTO USER_ROLE(id,email,role) VALUES ( 1, 'admin@gmail.com', 'UPLOAD_APPLICANT_DATA' );
INSERT INTO USER_ROLE(id,email,role) VALUES ( 2, 'admin@gmail.com', 'VIEW_TEST_RESULTS' );