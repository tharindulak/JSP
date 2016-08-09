<!DOCTYPE html>
<html>
    <head>
        <title>Add User</title>
        <style type="text/css">
        </style>
        <script src="js/validation.js"></script>
    </head>
    <body onload="autoGenerateId()">
        <form name="addUser" action="AddUserServlet" method="post">
            <h1>Add User</h1>

            <label>ID :</label> <input id="nameId" type="text" name="id" readonly> <br> <br>
            <label>Name :</label> <input type="text" name="name"> <br>
            <br> <label>Gender :</label> <input type="radio" name="gender"
                                                value="male" checked> Male <input type="radio" name="gender"
                                                value="female"> Female <input type="radio" name="gender"
                                                value="other"> Other <br> <br> <label>Address
                :</label> <input type="text" name="address"> <br> <br> <label>Email
                :</label> <input type="text" name="email" onblur="emailValidation(document.addUser.email)" onkeyup="submitBtnValidation(document.addUser)"> <br> <br> <label>No
                Of Vehicles :</label> <input type="text" name="nosVehicle" onkeyup="noValidation(document.addUser.nosVehicle)"> <br>
            <br> <label>Contact No :</label> <input type="text"
                                                    name="contact" onkeyup="tpValidation(document.addUser, document.addUser.contact)" onblur="tpNoFocusLost(document.addUser.contact)"> <br> <br>
            <input type="submit"
                   value="Add User"> <input type="reset" value="Clear">
            <br> <br>

        </form>
        <script type="text/javascript">
            function autoGenerateId() {
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function () {
                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                        var s = xmlhttp.responseText;
                        document.addUser.id.value = s.trim();
                        //document.getElementById(nameId).innerHTML= "212";
                    }
                };
                xmlhttp.open("GET", "AddUSerJsp.jsp", true);
                xmlhttp.send();
            }
        </script>
    </body>
</html>