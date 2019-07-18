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

	<h1 align="center" style="color: green">GR technoSoft</h1>
	<div id="signUpDiv" style="width: 300px; margin: 0 auto; padding: 10px;">
	 	<form action ="userSignUpDetails" method = "POST" >
		 		<div>
		 		<label for="userSignupName"> ENTER NAME</label> 
		 		<input type="text" class="form-control" id="signUpname" name="signUpname"><br/>
		 		</div>
		 		
		 		<div>
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
		 		<input type="submit" class="btn btn-success">Sign-Up
		 		</div>	
	 	</form> 	
	</div>
	<div id="loginWraperDiv" Style="background-color:Tomato">
	<div id="userLoginDiv"  style="width: 300px; margin: 0 auto; padding: 10px;">
		<form>
			<div>
			<label for="userLoginName"> Enter Registered Name</label>
			<input type="text" class="form-control" id="loginName" name="loginName"><br/>
			</div>
			
			<div>
			<label for="userLoginPassword">Enter Password</label>
			<input type="password" class="form-control" id="loginPassword" name="loginPassword"><br/>
			</div>
		
			<div>
			<button type="button" class="btn btn-success" onclick="saveUserSignUoInfo()">Login</button>
			</div>
			</form>
	</div>
	<div id="getInformationDiv" Style="background-color: grey">
	<div id="userGetInformation" Style="width: 300px; margin: 0 auto; padding: 10px;">
		<div>
		<button type="button" class="btn btn-info"><a href ="/getInformation">GET YOUR INFORMATION</a></button>
		</div>
	</div>
	</div>
	</div>
	
</div>




<script>
	function saveUserSignUoInfo(){
		alert();
	}
</script>

