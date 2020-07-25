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
-- Temporary view structure for view `full_products_info`
--

DROP TABLE IF EXISTS `full_products_info`;
/*!50001 DROP VIEW IF EXISTS `full_products_info`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `full_products_info` AS SELECT 
 1 AS `article`,
 1 AS `product_name`,
 1 AS `brend`,
 1 AS `brend_discount`,
 1 AS `type`,
 1 AS `type_discount`,
 1 AS `category`,
 1 AS `category_discount`,
 1 AS `collection`,
 1 AS `collection_discount`,
 1 AS `size_uk`,
 1 AS `size_eur`,
 1 AS `quantity`,
 1 AS `price`,
 1 AS `product_discount`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `all_orders_info`
--

DROP TABLE IF EXISTS `all_orders_info`;
/*!50001 DROP VIEW IF EXISTS `all_orders_info`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `all_orders_info` AS SELECT 
 1 AS `customer_id`,
 1 AS `customer_name`,
 1 AS `order_id`,
 1 AS `date and time`,
 1 AS `product_article`,
 1 AS `product_name`,
 1 AS `price`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `full_products_info`
--

/*!50001 DROP VIEW IF EXISTS `full_products_info`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `full_products_info` AS select `product`.`article` AS `article`,`product`.`product_name` AS `product_name`,`brend`.`name` AS `brend`,`brend`.`discount` AS `brend_discount`,`type`.`name` AS `type`,`type`.`discount` AS `type_discount`,`category`.`name` AS `category`,`category`.`discount` AS `category_discount`,`collection`.`name` AS `collection`,`collection`.`discount` AS `collection_discount`,`size`.`size_uk` AS `size_uk`,`size`.`size_eur` AS `size_eur`,`size_product_quantity`.`quantity` AS `quantity`,`product`.`price` AS `price`,`product`.`discount` AS `product_discount` from ((((((`size_product_quantity` join `product` on((`size_product_quantity`.`product_id` = `product`.`article`))) join `brend` on((`product`.`brend_id` = `brend`.`id`))) join `type` on((`product`.`type_id` = `type`.`id`))) join `category` on((`product`.`category_id` = `category`.`id`))) join `collection` on((`product`.`collection_id` = `collection`.`id`))) join `size` on((`size_product_quantity`.`size_id` = `size`.`id`))) order by `product`.`article` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `all_orders_info`
--

/*!50001 DROP VIEW IF EXISTS `all_orders_info`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `all_orders_info` AS select `order`.`customer_id` AS `customer_id`,`customer`.`name` AS `customer_name`,`order_product`.`order_id` AS `order_id`,`order`.`datetime` AS `date and time`,`product`.`article` AS `product_article`,`product`.`product_name` AS `product_name`,`product`.`price` AS `price` from (((`order_product` join `product` on((`order_product`.`product_id` = `product`.`article`))) join `order` on((`order_product`.`order_id` = `order`.`id`))) join `customer` on((`order`.`customer_id` = `customer`.`personal_card_id`))) order by `order`.`id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-25 18:31:27
