-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 21, 2018 at 01:54 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `traffic`
--

-- --------------------------------------------------------

--
-- Table structure for table `cardata`
--

CREATE TABLE `cardata` (
  `carno` varchar(25) NOT NULL,
  `date` date NOT NULL,
  `name` varchar(25) NOT NULL,
  `mobile` bigint(20) NOT NULL,
  `address` varchar(25) NOT NULL,
  `fine` int(11) NOT NULL,
  `count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cardata`
--

INSERT INTO `cardata` (`carno`, `date`, `name`, `mobile`, `address`, `fine`, `count`) VALUES
('HR24X9658', '2018-10-20', 'Hardik Dua', 9053410252, 'Sirsa,Haryana', 0, 0),
('HR24X9658', '2018-10-20', 'Hardik Dua', 9053410252, 'Sirsa,Haryana', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `name` varchar(25) NOT NULL,
  `carno` varchar(10) NOT NULL,
  `mobile` bigint(20) NOT NULL,
  `address` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`name`, `carno`, `mobile`, `address`) VALUES
('Hardik Dua', 'HR24X9658', 9053410252, 'Sirsa,Haryana'),
('Karan Kapoor', 'HR12W5647', 8954710236, 'Sec7,UE,KKR'),
('Sakshi Mehta', 'HR14X2569', 9034261800, 'KKR,Haryana'),
('Amit', 'HR31Y4356', 8593475631, 'Mumbai'),
('Kiara Mehta', 'HR43G6481', 8493756315, 'Faridabad,Haryana'),
('Apoorva', 'HR25', 0, ''),
('Apoorva', 'CH73Y0987', 8469712367, 'Chandigarh'),
('Rohan', 'CH53X6578', 9374526895, 'Chandigarh'),
('Sameer', 'HR09Y7649', 9731456272, 'Haryana'),
('Shalini', 'HR64O7893', 9734867436, 'Haryana');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
