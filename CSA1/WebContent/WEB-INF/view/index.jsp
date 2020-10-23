<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>i am index</title>
<script type="text/javascript" src="/CSA1/resources/js/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$("#province").change(function(){
		var id = $("#province").val(); 
		$.ajax({
			url: "city",
			data: {"pid":id},
			dataType: "json",
			success:function(msg){
				//console.log(msg.cities[1].cityId);
				//alert(msg.cities[1].cityId);
				$("#city,#area").children().remove();
				$("#city,#area").append("<option value='0'>请选择城市</option>"); 
				for(var i=0;i<msg.cities.length;i++){
					//alert(1);
					console.log(msg.cities[i].cityId);
					$("#city").append("<option value="+msg.cities[i].cityId+">"+msg.cities[i].cityName+"</option>");
				}
			}
		})
		
	}) 
	$("#city").change(function(){
		var id = $("#city").val();
		$.ajax({
			url: "area",
			data: {"cId":id},
			dataType: "json",
			success:function(msg){
				$("#area").children().remove();
				$("#area").append("<option value='0'>请选择城市</option>"); 
				for(var i=0;i<msg.length;i++){ 
					console.log(msg[i].areaId);
					$("#area").append("<option value="+msg[i].areaId+">"+msg[i].areaName+"</option>");
				}
			}
		})
	})
})
</script>
</head>
<body>
 	<select id="province" >
 		<option value="0">请选择省份</option>
 		<c:forEach items="${provinces}" var="p">
 			<option value="${p.provinceId}">${p.provinceName}</option>
 		</c:forEach> 
    </select>
    <select id="city" name="city"><option value='0'>请选择城市</option></select>
    <select id="area" name="area"><option value='0'>请选择地区</option></select>
</body>
</html>