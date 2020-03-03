<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Info</title>
    <style type="text/css">
        table{
            width: 200px;
            border: black solid;
            background: burlywood;
        }
        tr{
            border-bottom: coral solid;
        }
    </style>

</head>
<body>
<div align="center">
<em><ins><h1>User Information</h1></ins></em>
<table>
    <tr>
        <td>Id</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${user.age}</td>
    </tr>
</table> <br>
<a href="/users/">Back</a>
</div>
</body>
</html>