<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Golf Shop</title>
    <style>
        table {
            font-family: "Times New Roman", SansSerif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 5px solid darkcyan;
            text-align: left;
            padding: 12px;
            width: 140px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Inventory Table</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Product Name</th>
        <th>Category</th>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach var = "product" items = "${inventorylist}">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getProductname()}</td>
            <td>${product.getCategory()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getColor()}</td>
        </tr>
    </c:forEach>
</table>
</body>

</html>
