Create table UserSignUpDetails(
	`ID` bigint(20) NOT NULL AUTO_INCREMENT,
	`User_SignUp_Name` varchar(50) default null,
	`User_SignUp_EmailID` varchar(50) default null,
	`User_SignUp_Location` varchar(50) default null,
	`User_SignUp_Password` varchar(50) default null,
	`User_SignUp_CurrentCity` varchar(50) default null,
	`Created_Date` date default null,
	primary key(ID)
	
);