function validate() {
}

/**
 * Function used to validate Email
 * 
 * @param form
 * @returns {Boolean}
 */
function validateEmail(form) {

	var error = document.getElementById("emailError");
	var email = document.getElementById("email").value;
	error.innerHTML = "";
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (email == null || email == "") {
		error.innerHTML = "Input Your Email";
	} else if (!email.match(mailformat)) {
		document.getElementById("email").focus();
		error.innerHTML = "Invalid Email";
	} else {
	}
	if (error.innerHTML.length > 0) {
		return false;
	} else {
		return true;
	}

}