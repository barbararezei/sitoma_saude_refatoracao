 /* criação do banco de dados*/
CREATE DATABASE sintomasaude; 
USE sintomasaude;

/* criação das tabelas*/

create table usuario (
  id int primary key  auto_increment,
  login varchar(100) not null,
  senha varchar(100) not null,
  tipo varchar(100) not null
  );
  
   CREATE TABLE paciente (
 idpaciente int primary key auto_increment ,
 nome varchar(45) not null,
 idade varchar(1000) not null,
 condicao varchar(1000) not null,
 remedio varchar(1000) not null, 
 infremedio varchar(1000) not null
 
 
  );
  
  create table incidente (
  idincidente int primary key auto_increment ,
  idpaciente int not null,
  data varchar(10) not null,
 hora varchar(8) not null,
 relato varchar(1000) not null,
  foreign key (idpaciente) REFERENCES paciente(idpaciente)
  
  );
  
  create table responsavel(
   id_responsavel int primary key auto_increment,
   nome varchar(45) not null,
    idpaciente int not null,
   foreign key ( idpaciente) REFERENCES paciente( idpaciente)
  
  );
  
  
  INSERT INTO usuario (login, senha, tipo) 
VALUES ('juliana','sufleh16','paciente');

INSERT INTO usuario (login, senha, tipo) 
VALUES ('barbara','1234','responsavel ');

INSERT INTO usuario (login, senha, tipo) 
VALUES ('pedro','ababab','paciente');

INSERT INTO usuario (login, senha, tipo) 
VALUES ('amelie','bebeashe','responsavel');

INSERT INTO usuario (login, senha, tipo) 
VALUES ('luna','feiosa9','paciente');


select * from usuario;




 

