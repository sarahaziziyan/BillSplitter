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
        <div id="personContainer">
            <div><label class="personLabel">Person:</label><input type="text" class="person"/></div>
            
        </div>
        <input type="button" value="addPerson" id="addPerson"/>
        <input type="button" value="Submit" id="submit"/>
    </body>
</html>
