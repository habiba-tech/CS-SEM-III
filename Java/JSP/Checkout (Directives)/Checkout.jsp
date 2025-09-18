<%@page language="java" contentType="text/html;charset=UTF-8" errorPage="error.jsp"%>
<%@page import="java.text.DecimalFormat"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkout Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Checkout Form</h2>
    <form method="post">
        Product Name: <input type="text" name="product"><br><br>
        Quantity: <input type="number" name="quantity"><br><br>
        Price: <input type="text" name="price"><br><br>
        <input type="submit" value="Calculate Total">
    </form>

    <%
        String product = request.getParameter("product");
        String qtyStr = request.getParameter("quantity");
        String priceStr = request.getParameter("price");

        if (product != null && qtyStr != null && priceStr != null) {
            // Trigger error if product is empty
            if (product.trim().isEmpty()) {
                throw new Exception("Product name cannot be empty!");
            }

            try {
                int quantity = Integer.parseInt(qtyStr);
                double price = Double.parseDouble(priceStr);

                // Trigger error if values are invalid
                if (quantity < 1 || price <= 0) {
                    throw new Exception("Invalid input: Quantity must be >=1 and Price > 0.");
                }

                double total = quantity * price;
                DecimalFormat df = new DecimalFormat("0.00");
    %>

    <div class="result">
        <h3>Product: <%= product %></h3>
        <h3>Quantity: <%= quantity %></h3>
        <h3>Total Price: $<%= df.format(total) %></h3>
    </div>

    <%
            } catch (Exception e) {
                // Forward error to error.jsp
                throw new Exception("Calculation error: " + e.getMessage());
            }
        }
    %>
</body>
</html>
    ``