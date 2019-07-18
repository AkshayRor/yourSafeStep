Create table UserSignUpDetails(
	`ID` bigint(20) NOT NULL AUTO_INCREMENT,
	`UserSignUpName` varchar(50) default null,
	`UserSignUpEmailID` varchar(50) default null,
	`UserSignUpLocation` varchar(50) default null,
	`UserSignUpPassword` varchar(50) default null,
	`UserSignUpCurrentCity` varchar(50) default null,
	`CreatedDate` date default null,
	primary key(ID)
	
);