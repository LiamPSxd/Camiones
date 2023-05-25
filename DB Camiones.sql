DROP DATABASE IF EXISTS camiones;
CREATE DATABASE camiones;

USE camiones;

CREATE USER IF NOT EXISTS 'camiones'@'localhost' IDENTIFIED BY 'camiones';
GRANT ALL PRIVILEGES ON camiones.* TO 'root'@'localhost';
GRANT ALL PRIVILEGES ON camiones.* TO 'camiones'@'localhost';
FLUSH PRIVILEGES;

SHOW GRANTS FOR root@'localhost';
SHOW GRANTS FOR camiones@'localhost';

SELECT * FROM camion;
SELECT * FROM hibernate_sequence;