-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2024 at 01:04 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oopject`
--

-- --------------------------------------------------------

--
-- Table structure for table `access_control`
--

CREATE TABLE `access_control` (
  `access_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `access_room_info_user` varchar(255) NOT NULL,
  `access_room_info_contact` varchar(255) NOT NULL,
  `access_room_info_roomrent` varchar(255) NOT NULL,
  `access_roomsetting_info_room` varchar(255) NOT NULL,
  `access_roomsetting_info_room_cost` varchar(255) NOT NULL,
  `access_service_info_service` varchar(255) NOT NULL,
  `access_bill_bill` varchar(255) NOT NULL,
  `access_bill_mitor` varchar(255) NOT NULL,
  `access_bill_editstatus` varchar(255) NOT NULL,
  `access_level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `access_control`
--

INSERT INTO `access_control` (`access_id`, `employee_id`, `access_room_info_user`, `access_room_info_contact`, `access_room_info_roomrent`, `access_roomsetting_info_room`, `access_roomsetting_info_room_cost`, `access_service_info_service`, `access_bill_bill`, `access_bill_mitor`, `access_bill_editstatus`, `access_level`) VALUES
(1, 1, 'True', 'True', 'True', 'False', 'True', 'True', 'True', 'True', 'False', 'admin'),
(2, 2, 'True', 'True', 'True', 'False', 'True', 'True', 'True', 'True', 'False', 'admin'),
(3, 3, 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'owner');

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL,
  `admin_username` varchar(10) NOT NULL,
  `admin_password` text NOT NULL,
  `admin_role` text DEFAULT NULL,
  `admin_imageprofile` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`admin_id`, `admin_username`, `admin_password`, `admin_role`, `admin_imageprofile`) VALUES
(1, 'Emily', 'password1', 'admin', 'profile1.jpg'),
(2, 'Michael', 'password2', 'admin', 'profile2.jpg'),
(3, 'Nicholus', 'password3', 'owner', 'profile3.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `employee_id` int(11) NOT NULL,
  `employee_firstname` varchar(255) NOT NULL,
  `employee_lastname` varchar(255) NOT NULL,
  `employee_role` varchar(255) NOT NULL,
  `employee_idcard` varchar(255) NOT NULL,
  `employee_gender` varchar(255) NOT NULL,
  `employee_religion` varchar(255) NOT NULL,
  `employee_nationality` varchar(255) NOT NULL,
  `employee_disease` varchar(255) DEFAULT '-',
  `employee_education` varchar(255) NOT NULL,
  `employee_bank` varchar(255) NOT NULL,
  `employee_address` varchar(255) NOT NULL,
  `employee_phone` varchar(255) NOT NULL,
  `employee_salary` int(11) NOT NULL,
  `employee_imageprofile` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`employee_id`, `employee_firstname`, `employee_lastname`, `employee_role`, `employee_idcard`, `employee_gender`, `employee_religion`, `employee_nationality`, `employee_disease`, `employee_education`, `employee_bank`, `employee_address`, `employee_phone`, `employee_salary`, `employee_imageprofile`) VALUES
(1, 'Emily', 'Davis', 'admin', '67890123456789', 'female', 'Buddhism', 'Thai', '-', 'Bachelor\'s degree', '678901234567', '123 Pine Street, Bangkok', '0867890123', 10000, 'profile_em.jpg'),
(2, 'Michael', 'White', 'admin', '56789012345678', 'male', 'Buddhism', 'Thai', '-', 'Bachelor\'s degree', '567890123456', '123 Oak Street, Bangkok', '0856789012', 10000, 'profile.jpg'),
(3, 'Nicholus', 'Wilson', 'owner', '78901234567890', 'female', 'Buddhism', 'Thai', '-', 'Bachelor\'s degree', '789012345678', '123 Walnut Street, Bangkok', '0878901234', 0, 'profile.jpg'),
(4, 'John', 'Smith', 'cleaning staff', '12345678901234', 'male', 'Buddhism', 'Thai', '-', 'High school diploma', '890123456789', '123 Maple Street, Bangkok', '0812345678', 7500, 'profile.jpg'),
(5, 'Sarah', 'Johnson', 'maintenance staff', '23456789012345', 'female', 'Buddhism', 'Thai', '-', 'Technical diploma', '901234567890', '234 Elm Street, Bangkok', '0823456789', 10000, 'profile.jpg'),
(6, 'David', 'Brown', 'laundry staff', '34567890123456', 'male', 'Buddhism', 'Thai', '-', 'High school diploma', '456789123456', '345 Oak Street, Bangkok', '0834567890', 7500, 'profile.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `pays`
--

CREATE TABLE `pays` (
  `pay_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `water_meter` int(11) DEFAULT NULL,
  `elec_meter` int(11) DEFAULT NULL,
  `pay_room_cost` int(11) NOT NULL,
  `pay_water_cost` int(11) NOT NULL,
  `pay_elec_cost` int(11) NOT NULL,
  `pay_common_area` int(11) DEFAULT NULL,
  `pay_total_cost` int(11) NOT NULL,
  `pay_date` date NOT NULL,
  `pay_status` varchar(255) NOT NULL CHECK (`pay_status` in ('paid','notpaid'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pays`
--

INSERT INTO `pays` (`pay_id`, `room_id`, `water_meter`, `elec_meter`, `pay_room_cost`, `pay_water_cost`, `pay_elec_cost`, `pay_common_area`, `pay_total_cost`, `pay_date`, `pay_status`) VALUES
(1, 1, 11, 37, 7000, 200, 300, 350, 7850, '2024-01-25', 'paid'),
(2, 4, 10, 50, 9000, 180, 400, 350, 9930, '2024-01-25', 'paid'),
(3, 5, 8, 56, 9000, 150, 450, 350, 9950, '2024-01-25', 'paid'),
(4, 7, 12, 62, 15000, 220, 500, 350, 16070, '2024-01-25', 'paid'),
(5, 9, 13, 75, 15000, 250, 600, 350, 16200, '2024-01-25', 'paid'),
(6, 1, 9, 50, 7000, 162, 400, 350, 7912, '2024-02-25', 'paid'),
(7, 4, 12, 45, 9000, 216, 360, 350, 9926, '2024-02-25', 'paid'),
(8, 5, 10, 49, 9000, 180, 392, 350, 9922, '2024-02-25', 'paid'),
(9, 7, 9, 55, 15000, 162, 440, 350, 15952, '2024-02-25', 'paid'),
(10, 9, 10, 80, 15000, 180, 640, 350, 16170, '2024-02-25', 'paid'),
(11, 1, 8, 45, 7000, 144, 360, 350, 7854, '2024-03-25', 'paid'),
(12, 4, 12, 42, 9000, 216, 336, 350, 9902, '2024-03-25', 'paid'),
(13, 5, 15, 40, 9000, 270, 320, 350, 9940, '2024-03-25', 'paid'),
(14, 7, 14, 48, 15000, 252, 384, 350, 15986, '2024-03-25', 'paid'),
(15, 9, 10, 65, 15000, 180, 520, 350, 16050, '2024-03-25', 'paid'),
(16, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-04-25', 'notpaid'),
(17, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-04-25', 'notpaid'),
(18, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-04-25', 'notpaid'),
(19, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-04-25', 'notpaid'),
(20, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-04-25', 'notpaid'),
(21, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-05-25', 'notpaid'),
(22, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-05-25', 'notpaid'),
(23, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-05-25', 'notpaid'),
(24, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-05-25', 'notpaid'),
(25, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-05-25', 'notpaid'),
(26, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-06-25', 'notpaid'),
(27, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-06-25', 'notpaid'),
(28, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-06-25', 'notpaid'),
(29, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-06-25', 'notpaid'),
(30, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-06-25', 'notpaid'),
(31, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-07-25', 'notpaid'),
(32, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-07-25', 'notpaid'),
(33, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-07-25', 'notpaid'),
(34, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-07-25', 'notpaid'),
(35, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-07-25', 'notpaid'),
(36, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-08-25', 'notpaid'),
(37, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-08-25', 'notpaid'),
(38, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-08-25', 'notpaid'),
(39, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-08-25', 'notpaid'),
(40, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-08-25', 'notpaid'),
(41, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-09-25', 'notpaid'),
(42, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-09-25', 'notpaid'),
(43, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-09-25', 'notpaid'),
(44, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-09-25', 'notpaid'),
(45, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-09-25', 'notpaid'),
(46, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-10-25', 'notpaid'),
(47, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-10-25', 'notpaid'),
(48, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-10-25', 'notpaid'),
(49, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-10-25', 'notpaid'),
(50, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-10-25', 'notpaid'),
(51, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-11-25', 'notpaid'),
(52, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-11-25', 'notpaid'),
(53, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-11-25', 'notpaid'),
(54, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-11-25', 'notpaid'),
(55, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-11-25', 'notpaid'),
(56, 1, 0, 0, 7000, 0, 0, 350, 0, '2024-12-25', 'notpaid'),
(57, 4, 0, 0, 9000, 0, 0, 350, 0, '2024-12-25', 'notpaid'),
(58, 5, 0, 0, 9000, 0, 0, 350, 0, '2024-12-25', 'notpaid'),
(59, 7, 0, 0, 15000, 0, 0, 350, 0, '2024-12-25', 'notpaid'),
(60, 9, 0, 0, 15000, 0, 0, 350, 0, '2024-12-25', 'notpaid');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` int(11) NOT NULL,
  `room_number` varchar(255) NOT NULL,
  `room_floor` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `room_start_rent` date NOT NULL,
  `room_end_rent` date NOT NULL,
  `room_timepay` varchar(255) NOT NULL,
  `room_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `room_number`, `room_floor`, `user_id`, `room_start_rent`, `room_end_rent`, `room_timepay`, `room_status`) VALUES
(1, '101', 1, 1, '2024-01-01', '2024-12-31', 'monthly', 'Inactive'),
(2, '102', 1, NULL, '2024-02-01', '2024-07-31', 'monthly', 'active'),
(3, '103', 1, NULL, '2024-03-01', '2024-09-30', 'monthly', 'active'),
(4, '201', 2, 2, '2024-01-01', '2024-12-31', 'monthly', 'Inactive'),
(5, '202', 2, 3, '2024-02-01', '2024-07-31', 'monthly', 'Inactive'),
(6, '203', 2, NULL, '2024-03-01', '2024-09-30', 'monthly', 'active'),
(7, '301', 3, 4, '2024-01-01', '2024-12-31', 'monthly', 'Inactive'),
(8, '302', 3, NULL, '2024-02-01', '2024-07-31', 'monthly', 'active'),
(9, '303', 3, 5, '2024-03-01', '2024-09-30', 'monthly', 'Inactive');

-- --------------------------------------------------------

--
-- Table structure for table `room_details`
--

CREATE TABLE `room_details` (
  `room_number` varchar(255) NOT NULL,
  `room_det_price` varchar(255) NOT NULL,
  `room_det_description` varchar(255) NOT NULL,
  `water_per_unit` varchar(255) NOT NULL,
  `elec_per_unit` varchar(255) NOT NULL,
  `wifi` varchar(255) NOT NULL,
  `air` varchar(255) NOT NULL,
  `furniture` varchar(255) NOT NULL,
  `refridge` varchar(255) NOT NULL,
  `water_heater` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_details`
--

INSERT INTO `room_details` (`room_number`, `room_det_price`, `room_det_description`, `water_per_unit`, `elec_per_unit`, `wifi`, `air`, `furniture`, `refridge`, `water_heater`) VALUES
('101', '7000', 'Standard room', '18', '8', '1', '1', '0', '1', '1'),
('102', '7000', 'Standard room', '18', '8', '1', '1', '0', '1', '1'),
('103', '7000', 'Standard room', '18', '8', '1', '1', '0', '1', '1'),
('201', '9000', 'Standard room with basic amenities', '18', '8', '1', '1', '1', '1', '1'),
('202', '9000', 'Standard room with basic amenities', '18', '8', '1', '1', '1', '1', '1'),
('203', '9000', 'Standard room with basic amenities', '18', '8', '1', '1', '1', '1', '1'),
('301', '15000', 'Suite room with spacious living area', '18', '8', '0', '0', '1', '1', '1'),
('302', '15000', 'Suite room with spacious living area', '18', '8', '0', '0', '1', '1', '1'),
('303', '15000', 'Suite room with spacious living area', '18', '8', '0', '0', '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `service_id` int(11) NOT NULL,
  `room_number` int(11) NOT NULL,
  `service_name` varchar(255) NOT NULL,
  `service_description` varchar(255) NOT NULL,
  `service_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `summary`
--

CREATE TABLE `summary` (
  `month_id` int(11) NOT NULL,
  `govt_electric` int(11) NOT NULL,
  `govt_water` int(11) NOT NULL,
  `pay_common` int(11) NOT NULL,
  `dorm_electric` int(11) NOT NULL,
  `dorm_water` int(11) NOT NULL,
  `collect_common` int(11) NOT NULL,
  `room_charge` int(11) NOT NULL,
  `net_income` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `summary`
--

INSERT INTO `summary` (`month_id`, `govt_electric`, `govt_water`, `pay_common`, `dorm_electric`, `dorm_water`, `collect_common`, `room_charge`, `net_income`) VALUES
(1, 1125, 500, 45100, 2250, 1000, 1750, 55000, 13275),
(2, 1116, 450, 45100, 2232, 900, 1750, 55000, 13216),
(3, 960, 531, 45100, 1920, 1062, 1750, 55000, 13141),
(4, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(5, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(6, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(7, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(8, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(9, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(10, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(11, 0, 0, 45100, 0, 0, 1750, 55000, 11650),
(12, 0, 0, 45100, 0, 0, 1750, 55000, 11650);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `user_firstname` varchar(255) NOT NULL,
  `user_lastname` varchar(255) NOT NULL,
  `user_nickname` varchar(255) NOT NULL,
  `user_age` int(11) NOT NULL,
  `user_nationality` varchar(255) NOT NULL,
  `user_occupation` varchar(255) NOT NULL,
  `user_idcard` varchar(255) NOT NULL,
  `user_birthday` date NOT NULL,
  `user_gender` varchar(255) NOT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_lineid` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) NOT NULL,
  `user_address` varchar(255) NOT NULL,
  `user_imageprofile` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_firstname`, `user_lastname`, `user_nickname`, `user_age`, `user_nationality`, `user_occupation`, `user_idcard`, `user_birthday`, `user_gender`, `user_email`, `user_lineid`, `user_phone`, `user_address`, `user_imageprofile`) VALUES
(1, 'Saikhim', 'Jaidee', 'khim', 19, 'Thai', 'Student', '12345678901234', '2003-06-15', 'female', 'sai.khim@example.com', 'sai.khim', '0812345678', '123 Main Street, Bangkok', 'profile.jpg'),
(2, 'Jane', 'Tumdee', 'jane', 20, 'Thai', 'Student', '98765432109876', '2002-09-20', 'female', 'jane.Tumdee@example.com', 'janesmith', '0876548910', '456 LadKrabang , Bangkok', 'profile.jpg'),
(3, 'John', 'Doe', 'john', 18, 'Thai', 'Student', '12345678901235', '2004-05-17', 'male', 'john.doe@example.com', 'johndoe', '0812348758', '123 Main Street, Bangkok', 'profile.jpg'),
(4, 'Peter', 'Parker', 'Spidey', 21, 'Thai', 'Student', '12345678901236', '2001-12-23', 'male', 'peter.parker@example.com', 'peterparker', '0876543210', '456 Elm Street, Bangkok', 'profile.jpg'),
(5, 'Alice', 'Wonderland', 'alice', 23, 'Thai', 'Student', '12345678901239', '1999-05-09', 'female', 'alice.wonderland@example.com', 'alicewonderland', '0812345456', '789 Cherry Street, Bangkok', 'profile.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `access_control`
--
ALTER TABLE `access_control`
  ADD PRIMARY KEY (`access_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `pays`
--
ALTER TABLE `pays`
  ADD PRIMARY KEY (`pay_id`),
  ADD KEY `room_id` (`room_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`room_id`),
  ADD UNIQUE KEY `room_number` (`room_number`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `room_details`
--
ALTER TABLE `room_details`
  ADD PRIMARY KEY (`room_number`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`service_id`);

--
-- Indexes for table `summary`
--
ALTER TABLE `summary`
  ADD PRIMARY KEY (`month_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `access_control`
--
ALTER TABLE `access_control`
  MODIFY `access_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `employee_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `pays`
--
ALTER TABLE `pays`
  MODIFY `pay_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `service_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `access_control`
--
ALTER TABLE `access_control`
  ADD CONSTRAINT `access_control_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`);

--
-- Constraints for table `pays`
--
ALTER TABLE `pays`
  ADD CONSTRAINT `pays_ibfk_1` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`);

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- Constraints for table `room_details`
--
ALTER TABLE `room_details`
  ADD CONSTRAINT `room_details_ibfk_1` FOREIGN KEY (`room_number`) REFERENCES `rooms` (`room_number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
