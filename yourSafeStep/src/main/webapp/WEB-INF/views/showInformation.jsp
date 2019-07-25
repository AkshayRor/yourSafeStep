<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 


<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>


<style>
	.divBackImg{
		background-image: url("./images/tenis-ideal-pisada-supinada");
	}
</style>


<div id="mainDiv" style="background-color:lightblue">
	<h1 align="center" style="color: green">GR technoSoft</h1><br>
	<div id="getUserInformationDiv" style="width: 300px; margin: 0 auto; padding: 10px;">
	<h4>welcome</h4> ${userLoginName} 
		<form action = "getUserShareInformation" method = "POST">
			<div>
				<label for="userStartingPoint">Enter your Starting point</label>
				<input type="text" class="form-control" id="userStartingPoint" name="userStartingPoint">
			</div>
			
			<div>
				<label for="userDestinationPoint">Enter your Destination Point</label>
				<input type="text" class="form-control" id="userDestinationPoint" name="userDestinationPoint">
			</div>
			
			<div>
				<label for="time">Enter your Journey Time</label>
				<input type ="number" class="form-control" id="userJourneyTime" name="userJourneyTime"><br>
			</div>
			
			<div>
		 		<button type="submit" class="btn btn-info">Get-Record</button>
		 	</div>
		 		
		</form>
	</div>
</div>