-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: yes
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appearances`
--

DROP TABLE IF EXISTS `appearances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appearances` (
  `AId` int(11) NOT NULL,
  `Need` int(11) DEFAULT NULL,
  PRIMARY KEY (`AId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appearances`
--

LOCK TABLES `appearances` WRITE;
/*!40000 ALTER TABLE `appearances` DISABLE KEYS */;
/*!40000 ALTER TABLE `appearances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `CId` int(11) NOT NULL,
  `CName` text,
  `CPrice` float DEFAULT NULL,
  `CImage` text,
  `CPath` text,
  `cend_date` date DEFAULT NULL,
  `cstart_date` date DEFAULT NULL,
  PRIMARY KEY (`CId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams`
--

DROP TABLE IF EXISTS `exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exams` (
  `EId` int(11) NOT NULL,
  `CId` int(11) NOT NULL,
  `Q1` int(11) DEFAULT NULL,
  `Q2` int(11) DEFAULT NULL,
  `Q3` int(11) DEFAULT NULL,
  `Q4` int(11) DEFAULT NULL,
  `Q5` int(11) DEFAULT NULL,
  `Q6` int(11) DEFAULT NULL,
  `Q7` int(11) DEFAULT NULL,
  `Q8` int(11) DEFAULT NULL,
  `Q9` int(11) DEFAULT NULL,
  `Q10` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  `eend_date` datetime DEFAULT NULL,
  `estart_date` datetime DEFAULT NULL,
  `EName` text,
  PRIMARY KEY (`EId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams`
--

LOCK TABLES `exams` WRITE;
/*!40000 ALTER TABLE `exams` DISABLE KEYS */;
INSERT INTO `exams` VALUES (1,1,1,2,3,4,5,6,7,8,9,10,100,'2018-01-15 00:00:00','2017-12-01 00:00:00',NULL);
/*!40000 ALTER TABLE `exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grades` (
  `GId` int(11) NOT NULL,
  `UId` int(11) DEFAULT NULL,
  `EId` int(11) DEFAULT NULL,
  `GDate` datetime DEFAULT NULL,
  `Grade` int(11) DEFAULT NULL,
  PRIMARY KEY (`GId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grades`
--

LOCK TABLES `grades` WRITE;
/*!40000 ALTER TABLE `grades` DISABLE KEYS */;
/*!40000 ALTER TABLE `grades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `QId` int(11) NOT NULL,
  `Question` text,
  `Answer1` text,
  `Answer2` text,
  `Answer3` text,
  `Answer4` text,
  `Answer5` text,
  `Answer6` text,
  `Correct` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`QId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'I will tell him as soon as he _____ back','come','comes','will come','came',NULL,NULL,2,10),(2,'Mary _____ on shoes when she ____ them.','tries…buys','tries… buies','trys… buys','trys… buies',NULL,NULL,1,10),(3,'The girl often ______ cold when she ______.','catch…dances','catches… dances','catchs…dances','catches… dance',NULL,NULL,2,10),(4,'_____ he ____ himself there? No, I don\'t think so.','Do…enjoy','Does… enjoies','Does… enjoys','Does…enjoy',NULL,NULL,4,10),(5,'-_____ your teacher ____ from them very often?   -Certainly.','Do…hear','Does…hear','Do… receive','receive',NULL,NULL,2,10),(6,'_____ your mother _____ some cleaning on Sundays?','Does…does','Do…does','Does…do','Do… do',NULL,NULL,3,10),(7,'-_____ Tom _____to work hard to help his family ?  -Yes, he _____.','Has… x…does','Has…x…does','Does…has…has','Does… have…does',NULL,NULL,4,10),(8,'Which teacher _____ lessons to you every day ?','does …gives','does… give','do… give','gives',NULL,NULL,4,10),(9,'Smith does not go fishing on weekdays, ____?  _____ , he does.','does he…No','does he…Yes','doesn\'t he…No','doesn\'t he…Yes',NULL,NULL,2,10),(10,'Mr Black often _____ fishing on Sundays, _____ he ? ','goes…doesn\'t','goes…isn\'t','doesn\'t go…goes','doesn\'t go…is',NULL,NULL,1,10);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trans`
--

DROP TABLE IF EXISTS `trans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trans` (
  `TId` int(11) NOT NULL,
  `TUId` int(11) DEFAULT NULL,
  `TPrice` int(11) DEFAULT NULL,
  `TState` int(11) DEFAULT NULL,
  `TImage` text,
  `TName` text,
  `TNum` int(11) DEFAULT '1',
  `tend_date` datetime DEFAULT NULL,
  `tstart_date` datetime DEFAULT NULL,
  PRIMARY KEY (`TId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trans`
--

LOCK TABLES `trans` WRITE;
/*!40000 ALTER TABLE `trans` DISABLE KEYS */;
/*!40000 ALTER TABLE `trans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `UId` int(11) NOT NULL AUTO_INCREMENT,
  `Password` text,
  `Grade` int(11) DEFAULT NULL,
  `Authority` int(11) DEFAULT NULL,
  `UAId` int(11) DEFAULT NULL,
  `Email` text,
  `UName` text,
  PRIMARY KEY (`UId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'aa',NULL,NULL,NULL,'aa@aa.com','aa,aa'),(2,'bb',NULL,NULL,NULL,'bb@bb.com','bb,bb'),(3,'cc',NULL,NULL,NULL,'cc@bb.com','cc,cc'),(4,'dd',NULL,NULL,NULL,'dd@dd.com','dd,dd'),(5,'ff',NULL,NULL,NULL,'ff@qq.com','ff,ff');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usersappearance`
--

DROP TABLE IF EXISTS `usersappearance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usersappearance` (
  `UAId` int(11) NOT NULL,
  `UId` int(11) DEFAULT NULL,
  `AId` int(11) DEFAULT NULL,
  PRIMARY KEY (`UAId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usersappearance`
--

LOCK TABLES `usersappearance` WRITE;
/*!40000 ALTER TABLE `usersappearance` DISABLE KEYS */;
/*!40000 ALTER TABLE `usersappearance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userscourses`
--

DROP TABLE IF EXISTS `userscourses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userscourses` (
  `UCId` int(11) NOT NULL,
  `UId` int(11) DEFAULT NULL,
  `CId` int(11) DEFAULT NULL,
  PRIMARY KEY (`UCId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userscourses`
--

LOCK TABLES `userscourses` WRITE;
/*!40000 ALTER TABLE `userscourses` DISABLE KEYS */;
/*!40000 ALTER TABLE `userscourses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'yes'
--

--
-- Dumping routines for database 'yes'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-27 18:18:08
