DROP TABLE IF EXISTS `User_Manafement_Data`;

Create table User_Manafement_Data(
	`ID` bigint(20) NOT null AUTO_INCREMENT,
	`Description` varchar(200) default null,
	`Safe_Rating` bigint(10) not null,
	`Safe_Time` varchar(100) not null,
	 primary key(ID)
	
);