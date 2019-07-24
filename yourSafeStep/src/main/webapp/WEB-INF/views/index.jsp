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


<div class="container">
<div id="mainDiv" style="background-color:lightblue"> 

	<h1 align="center" style="color: green">GR technoSoft</h1>
	<div id="signUpDiv" class="col-md-6" style="background:#1abc9c; padding:15px">
	 	<form action ="userSignUpDetails" method = "POST" >
		 		<div class="pull-left">
		 		<label for="userSignupName"> ENTER NAME</label> 
		 		<input type="text" class="form-control" id="signUpname" name="signUpname"><br/>
		 		</div>
		 		
		 		<div  class="pull-left">
		 		<label for="userSignupEmailId">ENTER EMAIL-ID</label>
		 		<input type="text" class="form-control" id="signUpemailId" name="signUpemailId"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="userSignupEmailId">ENTER YOUR CURRENT LOCATION</label>
		 		<input type="text" class="form-control" id="signUpLocation" name="signUpLocation"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="userSignupPassword">ENTER PASSWORD</label>
		 		<input type="password" class="form-control" id="signUpPassword" name="signUpPassword"><br>
		 		</div>
		 		
		 		<div>
		 		<button type="submit" class="btn btn-success">Sign-up</button>
		 		</div>	
	 	</form> 	
	</div>
	<div id="loginWraperDiv"  class="col-md-6" style="background:#95a5a6; padding:15px;">
	<div id="userLoginDiv">
		<form action ="userLoginDetails" method = "POST">
			<div>
			<label for="userLoginName"> Enter Registered Name</label>
			<input type="text" class="form-control" id="loginName" name="loginName"><br/>
			</div>
			
			<div>
			<label for="userLoginPassword">Enter Password</label>
			<input type="password" class="form-control" id="loginPassword" name="loginPassword"><br/>
			</div>
		
			<div>
			<button type="submit" class="btn btn-success" onclick="saveUserSignUoInfo()">Login</button>
			</div>
			</form>
	</div>
	</div>
	<div id="getInformationDiv" Style="background-color: grey;  padding:15px;">
	<div id="userGetInformation" Style="width: 300px; margin: 0 auto; padding: 10px;">
		<div>
		<button type="button" class="btn btn-info"><a href ="/getInformation">GET YOUR INFORMATION</a></button>
		</div>
	</div>
	</div>
	</div>
	
	<div id="userFeddbackInformation" style= "background-color: #3498db; padding: 15px">
		<button type="submit" class="btn btn-success" id="userFeddbackInformationButton"> I want Share Information</button>
	</div>
	
	<div id="shareUserInformation" style ="display: none; background-color : lightblue; padding : 20px" >
		<form id = "userShareInfo" method = "POST" , action = "saveUserShareInfo">
			<div>
				<label for="userShareStartingPoint">Enter your Starting Point</label>
				<input type="text" class="form-control" id = "userStartingPoint" name = "userStartingPoint">
			</div>
			
			<div>
				<label for = "userShareDestinationPoint">Enter your Destination Point</label>
				<input type = "text" class="form-control" id = "userDestinationPoint" name="userDestinationPoint">
			</div>
			
			<div>
				<label for = "userShareTime">Enter your Journey Time</label>
				<input type = "text" class = "form-control" id= "userJourneyTime" name = "userJourneyTime">
			</div>
			
			<div>
				<label for = "userShareRating">Enter your Rating for your Journey</label>
				<input type = "text" class = "form-control" id= "userSafeRating" name = "userSafeRating">
			</div>
			
			<div>
				<label for = "userShareDescription">Enter your Journey Description</label>
				<input type = "text" class = "form-control" id= "userJourneyDescription" name = "userJourneyDescription"><br>
			</div>
			
			<div>
				<button type = "submit" class = "btn btn-success">Share your Experience</button>
			</div>
		</form>
	</div>
	
</div>




<script>
		$(document).ready(function(){
			$("#userFeddbackInformationButton").click(function(){
				$("#shareUserInformation").show();
			});
		});
</script>

<script>
	$("#shareUserInformation").submit(function(e){
		var form =  this;
		e.preventDefault();
		var formData = {};
		// iterate over form element
		$.each(this, function(i, v){
			var input = $(v);
			// populate form data as key-value pairs
			// with the name of input as key and its value as value
			formData[input.attr("name")] = input.val();
		});
		$.ajax({
			type : form.attr('method'),   // method attribut of form
			url : form.attr.('action'),   // action attribut of form
			dataType : 'json',
			// convert form data to json format
			data : JSON.Stringify(formData),
		});
	});
</script>