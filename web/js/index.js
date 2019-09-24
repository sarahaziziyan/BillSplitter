
$(document).ready(function(){
    
    $("#submit").click(function(){
        var people = "";
        $.each($(".person"),function(){
            people += $(".person").val();  
        })
        
        $.post("BillSplitterServlet",
            {
                people : people       
            },
            function(mydata, status){

            }
        );
    });
    
    $("#addPerson").click(function(){
        //var personHtml = '<div class="block"><label class="personLabel">Name:</label><input type="text" class="person" placeholder="name"/></div>';
        var personName = $("#personContainer").children("div.block:last").find("input").val();
        $("#personContainer").children("div.block:first").before("<div clsss='addedPerson'>person: "+personName+"</div>");
        $("#peopleSelectBox").append("<option value="+personName+">"+personName+"</option>");
        $("#personContainer").children("div.block:last").find("input").val("");
    });
    
    $("#addExpense").click(function(){
        var lastChild       = $("#expenseContainer").children("div.block:last");
        var expenseName     = lastChild.find(".expense").val();
        var amount          = lastChild.find(".amount").val();
        var personWhoSpent  = $("#peopleSelectBox").children("option:selected").val()
        lastChild.before("<div clsss='addedExpense'>Expense: "+personWhoSpent+" spent "+amount+"$ on"+expenseName+"</div>");
        
        lastChild.find(".expense").val("");
        lastChild.find(".amount").val("");
        $("#peopleSelectBox")[0].selectedIndex = 0;
    });
    
});