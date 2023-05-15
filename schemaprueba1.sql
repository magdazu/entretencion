CREATE SCHEMA entretencion;

USE entretencion;

CREATE TABLE Categoria (
categoria_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre_categoria VARCHAR (20)
);

CREATE TABLE Genero (
genero_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre_genero VARCHAR (20)
);

CREATE TABLE Contenido (
contenido_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
titulo VARCHAR (50),
fecha_estreno DATE,
descripcion VARCHAR(255),
categoria_id INT,
genero_id INT,
FOREIGN KEY (categoria_id) REFERENCES Categoria(categoria_id),
FOREIGN KEY (genero_id) REFERENCES Genero (genero_id)
);

ALTER TABLE Contenido DROP COLUMN fecha_estreno;

ALTER TABLE Contenido add fecha_estreno DATE;

ALTER TABLE Categoria DROP COLUMN nombre_categoria;
ALTER TABLE Categoria add nombre_categoria VARCHAR(20);

ALTER TABLE Genero DROP COLUMN nombre_genero;
ALTER TABLE Genero add nombre_genero VARCHAR (20);

INSERT INTO Categoria (nombre_categoria) VALUES ('Pelicula'),('Serie'),('Anime'),('Documental');
INSERT INTO Genero (nombre_genero) VALUES ('Accion'),('Comedia'),('Fantasia'),('Romance'),('Drama'),('Suspenso'),('Terror'),('Aventura'),('Ciencia ficcion'),('Misterio');

INSERT INTO Contenido (titulo, fecha_estreno, descripcion, categoria_id, genero_id) VALUES("Interestelar", '2014-05-20',
"Interstellar es una película épica de drama y ciencia ficción, dirigida por Christopher Nolan y protagonizada por Matthew McConaughey, Anne Hathaway, Jessica Chastain, Michael Caine y Matt Damon",
17,19); 

SELECT * FROM categoria; 
SELECT * FROM Genero;

SELECT * FROM Contenido;