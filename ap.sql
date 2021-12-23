-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 23, 2021 lúc 10:24 PM
-- Phiên bản máy phục vụ: 10.4.20-MariaDB
-- Phiên bản PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ap`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`id`, `username`, `password`) VALUES
(1, 'admin', '123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `fulltime`
--

CREATE TABLE `fulltime` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `department` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `basicsalary` int(11) NOT NULL,
  `timework` int(11) NOT NULL,
  `salary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `fulltime`
--

INSERT INTO `fulltime` (`id`, `name`, `phone`, `mail`, `department`, `age`, `basicsalary`, `timework`, `salary`) VALUES
(1, 'quan', '1', '1', '1', 21, 1, 111, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `parttime`
--

CREATE TABLE `parttime` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `department` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `basicsalary` int(11) NOT NULL,
  `timework` int(11) NOT NULL,
  `salary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `parttime`
--

INSERT INTO `parttime` (`id`, `name`, `phone`, `mail`, `department`, `age`, `basicsalary`, `timework`, `salary`) VALUES
(1, 'quan', '0123456789', 'quan@gmail.com', '1', 21, 111111, 111, 111111),
(3, 'quan', '123', '123', 'giam doc', 2, 2, 2, 0),
(4, 'quan', '123', '123', 'giam doc', 2, 2, 2, 0),
(9, '1', '1', '1', '1', 1, 1, 1, 0),
(10, 'admin', '123', '132', '123', 1231, 123, 123, 0),
(11, 'quan', '123', '123', 'giam doc', 2, 2, 2, 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `fulltime`
--
ALTER TABLE `fulltime`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `parttime`
--
ALTER TABLE `parttime`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `fulltime`
--
ALTER TABLE `fulltime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `parttime`
--
ALTER TABLE `parttime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
