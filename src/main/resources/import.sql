INSERT INTO tb_doctor (name, crm, landiline, mobile, cep) VALUES ('lucas', '034/s', 32454, 719, 5475);
INSERT INTO tb_doctor (name, crm, landiline, mobile, cep) VALUES ('kamila', '044/b', 3450, 79844, 5645);
INSERT INTO tb_doctor (name, crm, landiline, mobile, cep) VALUES ('ana', '014/r', 345060, 74983, 5455);

INSERT INTO tb_specialty (name) VALUES ('Alergologia');
INSERT INTO tb_specialty (name) VALUES ('Angiologia');
INSERT INTO tb_specialty (name) VALUES ('Buco maxilo');
INSERT INTO tb_specialty (name) VALUES ('Cardiologia clínca');
INSERT INTO tb_specialty (name) VALUES ('Cardiologia infantil');
INSERT INTO tb_specialty (name) VALUES ('Cirurgia cabeça e pescoço');
INSERT INTO tb_specialty (name) VALUES ('Cirurgia cardíaca');
INSERT INTO tb_specialty (name) VALUES ('Cirurgia de tórax');

INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (1,1);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (1,2);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (2,1);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (2,3);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (2,4);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (2,5);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (3,6);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (3,7);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (3,8);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (3,1);
INSERT INTO tb_doctor_specialty (doctor_id, specialty_id) VALUES (3,2);