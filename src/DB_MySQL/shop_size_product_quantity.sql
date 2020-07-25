-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: shop
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `size_product_quantity`
--

DROP TABLE IF EXISTS `size_product_quantity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `size_product_quantity` (
  `product_id` int NOT NULL,
  `size_id` int NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`product_id`,`size_id`),
  KEY `fk_product_size_idx` (`product_id`),
  KEY `fk_size_product_idx` (`size_id`),
  CONSTRAINT `fk_product_size` FOREIGN KEY (`product_id`) REFERENCES `product` (`article`),
  CONSTRAINT `fk_size_product` FOREIGN KEY (`size_id`) REFERENCES `size` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `size_product_quantity`
--

LOCK TABLES `size_product_quantity` WRITE;
/*!40000 ALTER TABLE `size_product_quantity` DISABLE KEYS */;
INSERT INTO `size_product_quantity` VALUES (17547,6,25),(17547,7,15),(17547,8,25),(17547,9,30),(17547,10,25),(17547,11,30),(17547,12,15),(17550,6,15),(17550,7,15),(17550,8,20),(17550,9,30),(17550,10,35),(17550,11,15),(17550,12,10),(17551,106,40),(17551,107,40),(17551,108,85),(17551,109,85),(17551,110,100),(17552,106,100),(17552,107,40),(17552,108,60),(17552,109,59),(17552,110,89),(17553,101,40),(17553,102,50),(17553,103,102),(17553,104,115),(17553,105,200),(17553,106,45),(17553,107,35),(17554,10,20),(17554,11,30),(17554,12,40),(17554,13,80),(17554,14,55),(17554,15,50),(17554,16,40),(17554,17,30),(17554,18,25),(17554,19,20),(17554,20,15),(17554,21,15);
/*!40000 ALTER TABLE `size_product_quantity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-25 18:31:26
