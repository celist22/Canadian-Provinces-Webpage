/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Pulls data from 
function getProvinceFromServer() {
   var allDataEntered=true;
   var url="ProvincesServlet?";
   if($("#population").val()===''){
       allDataEntered=false;
       alert("Please enter population value");
   }
   else{
       url +="&population="+$("#population").val();
   }
   if($("#landArea").val()===''){
       allDataEntered=false;
       alert("Please enter land area value");
   }
   else{
       url +="&landArea="+$("#landArea").val();
   }
   if($("#waterArea").val()===''){
       allDataEntered=false;
       alert("Please enter water area value");
   }
   else{
       url +="&waterArea="+$("#waterArea").val();
   }
   if(allDataEntered){
            $.getJSON(url, displayMenu);
    }
    //$.getJSON("ProvinceServlet?&population="+$("#population").val()+"&landArea="+$("#landArea").val()+"&waterArea="+$("#waterArea").val(),displayMenu);
}

function displayMenu(data) {
    $("#provinces").empty();
    $.each(data.getDetails,
            function() {
                $("#provinces").append(
                        "<tr>"
                        + "<td>" + this.name + "</td>"
                        + "<td>" + this.population + "</td>"
                        + "<td>" + this.landArea + "</td>"
                        + "<td>" + this.waterArea + "</td>"
                        + "<td>" + this.totalArea + "</td>"
                        + "<td>" + this.officialLanguage + "</td>"
                        + "</tr>");
            });
}

$(document).ready(
        function() {
            $("#getProvinces").click(getProvinceFromServer);
        }
);
