# gestion-crud
crud para gestionar inventario discos.

Base de datos mysql:
CREATE TABLE gestion_inventario.Discos (
	Id INT auto_increment NOT NULL PRIMARY KEY,
	Artista varchar(100) DEFAULT NULL,
	Album varchar(100) DEFAULT NULL,
	Genero varchar(100) DEFAULT NULL,
	Stock INT DEFAULT NULL,
	Precio INT DEFAULT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;


INSERT INTO gestion_inventario.Discos VALUES 
	(1,'Jungle','For Ever', 'Electronica', 3 ,400),
	(2,'MGMT','Little Dark Age', 'Indie', 2, 450),
	(3,'Gustavo Cerati','Siempre es Hoy', 'Rock', NULL, 500),
	(4,'The Avalanches','Since I Left You', 'Electronica', 1, 500),
	(5,'Homeshake','In The Shower', 'Indie', 2, 450),
	(6,'Amy Winehouse','Back To Black', 'Soul', 2, 450);
	
SELECT * FROM gestion_inventario.discos d ;
