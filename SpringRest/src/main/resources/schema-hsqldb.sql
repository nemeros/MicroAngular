create table T_JOB(id integer identity, job_nom varchar(50));
create table T_USER (id integer identity, nom varchar(50), prenom varchar(50), age integer, id_job integer references T_JOB(id));