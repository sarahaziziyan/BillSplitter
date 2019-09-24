
$(document).ready(function(){
    
    $("#submit").click(function(){
        var people      = createJSONPeople();
        var expenses    = createJSONExpenses();
        $.post("BillSplitterServlet",
            {
                people   : people,
                expenses : expenses
            },
            function(mydata, status){
                alert(status);
            }
        );
    });
    
    $("#addPerson").click(function(){
        //var personHtml = '<div class="block"><label class="personLabel">Name:</label><input type="text" class="person" placeholder="name"/></div>';
        var personName = $("#personContainer").children("div.block:last").find("input").val();
        $("#personContainer").children("div.block:first").before($("<div class='addedPerson' personName='"+personName+"'>person: "+personName+"</div>"));
        $("#peopleSelectBox").append("<option value="+personName+">"+personName+"</option>");
        $("#personContainer").children("div.block:last").find("input").val("");
    });
    
    $("#addExpense").click(function(){
        var lastChild       = $("#expenseContainer").children("div.block:last");
        var expenseName     = lastChild.find(".expense").val();
        var amount          = lastChild.find(".amount").val();
        var personWhoSpent  = $("#peopleSelectBox").children("option:selected").val()
        lastChild.before("<div class='addedExpense' expenseName='"+expenseName+"' amount='"+amount+"' personWhoSpent='"+personWhoSpent+"'>Expense: "+personWhoSpent+" spent "+amount+"$ on"+expenseName+"</div>");
        
        lastChild.find(".expense").val("");
        lastChild.find(".amount").val("");
        $("#peopleSelectBox")[0].selectedIndex = 0;
    });
    
});

function createJSONPeople() {
    jsonObj = [];
    $("#personContainer").find(".addedPerson").each(function() {
        var personName = $(this).attr("personName");
        item = {}
        item ["personName"] = personName;
        jsonObj.push(item);
    });
    return jsonObj;
    console.log(jsonObj);
}

function createJSONExpenses() {
    jsonObj = [];
    $("#expenseContainer").find(".addedExpense").each(function() {
        var expensename = $(this).attr("expensename");
        var amount = $(this).attr("amount");
        var personwhospent = $(this).attr("personwhospent");
        item = {}
        item ["expensename"] = expensename;
        item ["amount"] = amount;
        item ["personWhoSpent"] = personwhospent;
        jsonObj.push(item);
    });
    return jsonObj;
    console.log(jsonObj);
}