CREATE DATABASE  IF NOT EXISTS `pruebageareagle02` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `pruebageareagle02`;
-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pruebageareagle02
-- ------------------------------------------------------
-- Server version	8.0.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuenta` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `primer_nombre` varchar(100) NOT NULL,
  `segundo_nombre` varchar(100) DEFAULT NULL,
  `primer_apellido` varchar(100) NOT NULL,
  `segundo_apellido` varchar(100) DEFAULT NULL,
  `numero_identificacion` varchar(20) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `id_tipo_documento` int NOT NULL,
  PRIMARY KEY (`id_persona`),
  UNIQUE KEY `uk_cedula` (`numero_identificacion`,`id_tipo_documento`),
  KEY `FKcuenta652346` (`id_tipo_documento`),
  CONSTRAINT `FKcuenta652346` FOREIGN KEY (`id_tipo_documento`) REFERENCES `tipo_documento` (`id_tipo_documento`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
INSERT INTO `cuenta` VALUES (1,'Davinson',NULL,'Cañas','Hernandez','1015100658','3212206421',1),(2,'Sofia',NULL,'Mora','Contreras','1074929768','3214997234',1),(3,'Hector','Esneyder','Moreno','Rincon','1074929768','3194453080',2),(4,'Andres',NULL,'Alzate',NULL,'1147464215','3125784267',1),(5,'Juan','Armando','Casas','Conpuertas','1048295523','3158902394',1),(6,'Jhon','Jairo','Mateus',NULL,'1234567890','3000000000',1),(7,'Sara',NULL,'Puerto',NULL,'1472583690','7000000000',2),(8,'Juan','Seabastian','Suarez',NULL,'7894561230','8000000000',2),(9,'Gabriela',NULL,'Martinez',NULL,'9874563210','7891300000',1),(10,'Camilo',NULL,'Moreno ',NULL,'6587412367','7965656000',1),(11,'Felipe',NULL,'Fuentes',NULL,'3476897855','6744564556',1),(12,'Juan','David','Caceres','Ruiz','4456745674','3634563466',1),(13,'Julio',NULL,'Junio',NULL,'1255467686','3125634633',1);
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-05 17:10:56
