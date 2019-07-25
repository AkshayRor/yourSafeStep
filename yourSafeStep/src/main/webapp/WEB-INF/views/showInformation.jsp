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
	<div id = "userGetInfoFormDiv"> 
		<form action = "getUserShareInformation" method = "GET" id ="userGetInfoForm">
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
				<input type ="text" class="form-control" id="userJourneyTime" name="userJourneyTime"><br>
			</div>
			
			<div>
		 		<button type="submit" class="btn btn-info">Get-Record</button>
		 	</div>
		 		
		</form>
	</div>	
	</div>
</div>


<script>
	$("#userGetInfoFormDiv").submit(function(e){
		alert();
		var form = $("#userGetInfoForm");
		
		
		var unindexed_array = $(form).serializeArray();
		var formData = new FormData();
		$.map(unindexed_array, function (n, i) {
			if(($("[name="+n[name]+"]").attr('type') && $("[name="+n[name]+"]").attr('type').toLowerCase() === "text") || $("[name="+n[name]+"]").is("textarea"))
				formData.append(n['name'], n['value'].trim().replace(/  +/g,' '));
			else if(n['name'])
				formData.append(n['name'], n['value']);
		});
		
/* 		e.preventDefault();
		var formData = {};
		// iterate over form element
		$.each(this, function(i ,v){
			var input = $(v);
			alert("input========"+input.attr("name"));
			// populate form data as key-value pairs
			// with the name of input as key and its value as value
			formData[input.attr("name")] = input.val();
			alert(formData);
		}); */
		$.ajax({
			type : form.attr('method'),  // method attribut of form
			url  : form.attr('action'),  // action attribut of form
			dataType : 'json',
			// convert form data to json format
			data : JSON.Stringify(formData),
		});
		success: function (data) {
			if(data.response == "SUCCESS"){
				getRecord();
			}else{
				location.href = "/errorPage";
			}
			
		} 
	});
</script>