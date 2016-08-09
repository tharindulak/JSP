/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function isEmpty(str) {
	return (!str || 0 === str.length);
}
			
function noValidation(inputNo) {
	if (inputNo !== null) {
		var text = inputNo.value.replace(/\D/g, "");
		inputNo.value=text;
	}
}

function tpNoFocusLost(inputNo) {
	str=inputNo.value;
	if(!str || 10 > str.length){
		window.alert("Enter a no with 10 digits");
		inputNo.value="";
	}
}
			
function tpValidation(contactDetail,inputNo) {
	noValidation(inputNo);
	if (inputNo.value.length > 10) {
		var s = inputNo.value.substring(0, 10);
		inputNo.value=s;
	}
	submitBtnValidation(contactDetail);
}

function emailValidation(mailText){
	if(!(isEmpty(mailText.value))){
		if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mailText.value))){
			window.alert("Please enter a valid email address");
			mailText.value="";
		}   
	}
}

function submitBtnValidation(contactDetail){
	if((!(isEmpty(contactDetail.fName.value)) || !(isEmpty(contactDetail.lName.value))) && (!(isEmpty(contactDetail.mobile.value)) || !(isEmpty(contactDetail.home.value))) && !(isEmpty(contactDetail.year.value)) && !(isEmpty(contactDetail.day.value)) && !(isEmpty(contactDetail.email.value))){
		contactDetail.submitBtn.disabled=false;
	}else{
		contactDetail.submitBtn.disabled=true;
	}
}
