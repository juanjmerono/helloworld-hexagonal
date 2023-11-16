insert into todo.titu (cod_titu,tipo_titulacion,curso_aca) values ('T1','G',2023);
insert into todo.titu (cod_titu,tipo_titulacion,curso_aca) values ('T1','P',2023);

insert into todo.coordinador (email,nombre) values ('email1@a.com','Coord1');
insert into todo.coordinador (email,nombre) values ('email2@a.com','Coord2');
insert into todo.coordinador (email,nombre) values ('email3@a.com','Coord3');

insert into todo.coordinador_titu (cod_titu,tipo_titulacion,curso_aca,email) values ('T1','G',2023,'email1@a.com');
insert into todo.coordinador_titu (cod_titu,tipo_titulacion,curso_aca,email) values ('T1','G',2023,'email2@a.com');
insert into todo.coordinador_titu (cod_titu,tipo_titulacion,curso_aca,email) values ('T1','P',2023,'email3@a.com');

insert into todo.coordinador_all (cod_titu,tipo_titulacion,curso_aca,email,nombre) values ('T1','G',2023,'email1@a.com','Coord1');
insert into todo.coordinador_all (cod_titu,tipo_titulacion,curso_aca,email,nombre) values ('T1','G',2023,'email2@a.com','Coord2');
insert into todo.coordinador_all (cod_titu,tipo_titulacion,curso_aca,email,nombre) values ('T1','P',2023,'email3@a.com','Coord3');


insert into todo.tribunal (user_id,curso_aca,cod_conv_defensa,
		convocatoria,cod_titu,tipo_titulacion,tipo_tribunal,
		descripcion,fecha_presentacion) values 
        ('12345678',2023,'J','J','T1','G','A','Description','2023-01-01');
