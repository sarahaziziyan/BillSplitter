<!DOCTYPE html>
<html>
    <head>
        <title>Bill Splitter</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
        <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1>Bill Splitter</h1>
        <div class="mainContainer">
            <div id="personContainer" class="sidecontainer">
                <h2>People</h2>
                <div class='block'><label>Name:</label><input type="text" class="person" placeholder="name"/></div>
                <div class="buttonContainer">
                    <input type="button" value="addPerson" id="addPerson"/>
                </div>
            </div>
            <div id="expenseContainer" class="sidecontainer">
                <h2>Expenses</h2>
                <div class='block'><label>Expense:</label><input type="text" class="expense" placeholder="What for?"/><input type="number" class="amount" placeholder="How much?"/></div>
                <div class="buttonContainer">
                    <input type="button" value="addEspense" id="addExpense"/>
                </div>
            </div>
        </div>
        <div class="buttonContainer">
            <input type="button" value="Submit" id="submit"/>
        </div>
    </body>
</html>
