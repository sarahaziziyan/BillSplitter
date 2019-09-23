
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
        var personHtml = '<div class="block"><label class="personLabel">Name:</label><input type="text" class="person" placeholder="name"/></div>';
        $("#personContainer").children("div.block:last").after($(personHtml));
            
    });
    
    $("#addExpense").click(function(){
        var expenseHtml = '<div class="block"><label class="expense">Expense:</label><input type="text" class="expense" placeholder="What for?"/><input type="number" class="amount" placeholder="How much?"/></div>';
        $("#expenseContainer").children("div.block:last").after($(expenseHtml));
            
    });
    
});