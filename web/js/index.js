
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
        var personHtml = "<div><label class='personLabel'>Person:</label><input type='text' class='person'/></div>";
        $("#personContainer").append($(personHtml));
            
    });
    
});