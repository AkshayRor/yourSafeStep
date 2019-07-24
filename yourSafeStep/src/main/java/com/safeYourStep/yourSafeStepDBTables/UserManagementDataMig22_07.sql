DROP TABLE IF EXISTS `User_Management_Data`;

Create table User_Management_Data(
	`ID` bigint(20) NOT null AUTO_INCREMENT,
	`Description` varchar(200) default null,
	`Safe_Rating` bigint(10) not null,
	`Safe_Time` varchar(100) not null,
	`Journey_Starting_Point` varchar(200) not null,
	`Journey_Destination_Point` varchar(200) not null,
	`Submit_Date` date not null,
	 primary key(ID)
	
);