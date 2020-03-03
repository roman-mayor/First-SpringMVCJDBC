<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8" content="text/html" lang="java"/>
    <title>usersList</title>
    <style type="text/css">
        table{
            width: 500px;
            border: black solid;
            background: burlywood;
        }
        th{
            text-align: center;
            background: darkorchid;
            color: white;
            border-bottom: coral solid;
        }
        td{
            border-bottom: coral solid;
            text-align: center;
        }

    </style>
</head>
<body>
<div align="center">
    <em><ins><h1>List of Users</h1></ins></em>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>E-mail</th>
        <th>Age</th>
        <th></th>
        <th></th>

    </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td><a href="/delete/${user.id}">DELETE</a></td>
            <td><a href="/update/${user.id}">UPDATE</a></td>
        </tr>
    </#list>
</table>
    <br>
    <br>
    <a href="/addUser/"><h3>Create new User</h3></a>
    </div>
</body>
</html>