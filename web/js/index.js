
$(document).ready(function(){
    
    $("#submit").click(function{
        var people   = $(".person").val();
    
        $.post("BillSplitterServlet",
            {
                people : people,        
            },
            function(mydata, status){

            }
        );
    });
    
    $("#addPerson").click(function{
        
        
    
    });
    
});