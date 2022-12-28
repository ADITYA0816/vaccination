//-----------------------------------------------------------------
const whos = document.querySelectorAll('input[type=radio]');
const lbl_name = document.querySelector('#lbl_name');
const id_name = document.querySelector('#id_name');
const signup_title = document.querySelector('#signup_title');

whos.forEach((who)=>{
	who.addEventListener('click', (event) => {
		id_name.value = '';
		if(event.target.value==1){
			lbl_name.innerHTML = 'Student Name';
			signup_title.innerHTML = 'Student SignUp';	
		}else{
			lbl_name.innerHTML = 'Institute Name';
			signup_title.innerHTML = 'Institute SignUp';
		}
	});
});




//------------------------------------------------------------------
const inputs = document.querySelectorAll(':not(input[type=radio])');

const form = document.forms[0];

const result = {
	name: false,
	email: false,
	password: false,
	contact: false
};


//---------------------- UNIQUE EMAIL -------------------------------
const emailField = document.querySelector('#id_email');

const ajaxRequest = async () => {
	const response = await fetch(`checkemail.do?email=${emailField.value}`);
		
	return response.text();
};

const checkEmail = () => {
	if(result['email']){
		ajaxRequest().then((data)=>{			
			const emailHelp = document.querySelector('#email_help');
			const emailError = document.querySelector('#email_error');
							
			if(data=='true'){
				emailField.classList.replace('success', 'fail');	
				result['email'] = false;
				emailHelp.classList.replace('show', 'hide');
				emailError.classList.replace('hide', 'show');	
				emailError.innerHTML = 'Account with the given email already exists!';
			}		
		}).catch((error)=>{
			console.log(error);
		});
	}
};

emailField.addEventListener('blur', checkEmail);


//---------------------- VIEW PASSWORD -------------------------------
const passwordField = document.querySelector('#id_password');
const viewPassword = document.querySelector('#view_password');

let passVisible = false;

viewPassword.addEventListener('click', function(event){
	if(passVisible){
		passwordField.attributes.type.value = 'password';
		passVisible = false;
	}else{	
		passwordField.attributes.type.value = 'text';
		passVisible = true;
	}
});



//---------------------- VALIDATION -------------------------------
const patterns = {
	name: /^[a-zA-Z ]{5,50}$/,
	email: /^([a-zA-Z][a-zA-Z\d-_\.]*)@([a-zA-Z\d-_]{2,})\.([a-zA-Z]{2,5})(\.[a-zA-Z]{2,5})?$/,
	password: /^[a-zA-Z\d_-]{8,20}$/,
	contact: /^[5-9][0-9]{9}$/	
};

form.addEventListener('submit', function(event){
	if(result.name && result.email && result.password && result.contact){
		return true;
	}else{
		event.preventDefault();
		return false;
	}
});

const validate = (field, pattern) => {
	let help = document.querySelector('#'+field.attributes.name.value+'_help');
	let error = document.querySelector('#'+field.attributes.name.value+'_error')
	
	if(field.attributes.name.value==='email'){
		error.innerHTML = 'Invalid Email. Please enter valid Email.';
	}
	
	if(pattern.test(field.value)){
		field.classList.replace('fail', 'success');
		result[field.attributes.name.value] = true;
		help.classList.replace('hide', 'show');
		error.classList.replace('show', 'hide');
	}else{
		if(field.classList.contains('success')){
			field.classList.replace('success', 'fail');
			help.classList.replace('show', 'hide');
			error.classList.replace('hide', 'show');
		}else{
			field.classList.add('fail');
			help.classList.add('hide');
			error.classList.replace('hide', 'show');
		}
		result[field.attributes.name.value] = false;
	}
}

inputs.forEach((input) => {
	input.addEventListener('keyup', (event) => {		
		let pattern = patterns[event.target.attributes.name.value];
		let field = event.target;
				
		validate(field, pattern);
	});
	
	input.addEventListener('blur', (event) => {		
		let pattern = patterns[event.target.attributes.name.value];
		let field = event.target;
		
		validate(field, pattern);
	});
});