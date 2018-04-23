<%@ page contentType="text/html; charset=utf-8"%>
<!doctype html>
<html>
<script src="resources/js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
    function exportExcel() {

        $.ajax({
            url:"exportExcel",
            type:"post",//get
            data:{},
            dataType:"json",
            success:function(data){},
            error:function(){}
        });
    }
</script>
<body>
<input type="button" value="GO!" onclick="exportExcel()"/>
<input type="hidden" value="123" id="testj"/>
</body>
</html>
