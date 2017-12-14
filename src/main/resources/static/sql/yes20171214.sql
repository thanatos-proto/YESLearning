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
  `CStartDate` date DEFAULT NULL,
  `CEndDate` date DEFAULT NULL,
  `CName` text,
  `CPrice` float(8,2) DEFAULT NULL,
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
  `EStartDate` datetime DEFAULT NULL,
  `EEndDate` datetime DEFAULT NULL,
  `eend_date` datetime DEFAULT NULL,
  `estart_date` datetime DEFAULT NULL,
  PRIMARY KEY (`EId`),
  KEY `FK_FK_Courses_Exams` (`CId`),
  CONSTRAINT `FK_FK_Courses_Exams` FOREIGN KEY (`CId`) REFERENCES `courses` (`CId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams`
--

LOCK TABLES `exams` WRITE;
/*!40000 ALTER TABLE `exams` DISABLE KEYS */;
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
  `EId` int(11) DEFAULT NULL,
  `Question` text,
  `Answer1` text,
  `Answer2` text,
  `Answer3` text,
  `Answer4` text,
  `Answer5` text,
  `Answer6` text,
  `Correct` text,
  PRIMARY KEY (`QId`),
  KEY `FK_FK_Exams_Questions` (`EId`),
  CONSTRAINT `FK_FK_Exams_Questions` FOREIGN KEY (`EId`) REFERENCES `exams` (`EId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
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
  `UId` int(11) DEFAULT NULL,
  `TStartDate` datetime DEFAULT NULL,
  `TUId` int(11) DEFAULT NULL,
  `TPrice` int(11) DEFAULT NULL,
  `TEndDate` datetime DEFAULT NULL,
  `TState` int(11) DEFAULT NULL,
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
  `name` text,
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

-- Dump completed on 2017-12-14 22:42:08
